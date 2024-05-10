import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDAOfile{

	public static int rowCount=0;
	public static String [][] info=new String[rowCount][6];

	public static void create(String name, String surname, String email, String dob, String id,String age){
		// Increment rowCount first
        rowCount = info.length + 1;
        // Resize the info array to accommodate the new row
        String[][] temp = new String[rowCount][6];
        for (int i = 0; i < info.length; i++) {
            temp[i] = info[i];
        }
        info = temp;
        // Add user information to the new row
        info[rowCount - 1][0] = name;
        info[rowCount - 1][1] = surname;
        info[rowCount - 1][2] = email;
        info[rowCount - 1][3] = dob;
        info[rowCount - 1][4] = id;
        info[rowCount - 1][5] = age;

     System.out.print("\nHello "+name+ " " + surname+" you details have been saved to the database.");
     
     try {
            insertdoc(info);
        } catch (FileNotFoundException e) {
            // Handle the exception (e.g., print an error message)
            System.out.println("Error writing to file: " + e.getMessage());
        }
    
	}
    
	public static void update(String name, String surname, String email, String dob, String id,String age){
        boolean userFound = false; 
        for (int i = 0; i < info.length; i++) {
            if (info[i][2] != null && info[i][2].equals(email)) { 
                userFound = true;
                // Check for non-null email
                System.out.println("\nSelect and option you would like to edit \n" 
                                +"1. Name \n"
                                +"2. Surname \n"
                                +"3. Email \n"
                                +"4. Date of birth \n"
                                +"5. ID \n"
                                );

                String edit=Prompter.prompt("Choose an option (1-5) ");

                switch(edit){

                    case "1":

                        name=Prompter.prompt("Enter updated name ->");

                        if(name.isEmpty()){
                            System.out.print("Value not entered. Blank Space");
                        }else{
                            info[i][0]=name;
                        System.out.print("Users name has been updated!!"); 
                        }
                
                        break;

                    case "2":

                        surname=Prompter.prompt("Enter updated surname ->");

                        if(surname.isEmpty()){
                            System.out.print("Value not entered. Blank Space");
                        }else{
                            info[i][1]=surname;
                            System.out.print("Users surname has been updated!!");
                        }

                        break;

                    case "3":


                        boolean validmail=false;

                        while(!validmail){
                             email=Prompter.prompt("Enter updated email ->");

                            validmail=(FormatChecker.emailcheck(email)&UserDAO.checkemaildup(email)); 
                        }

                        info[i][2]=email;
                        System.out.print("Users email has been updated!!");

                        break;

                    case "4":

                        boolean validdob=false;
                        while(!validdob){

                            dob = Prompter.prompt("\nEnter your date of birth (dd/mm/yyyy) -> ");
                            validdob = DateValidator.isValid(dob);
                            if (validdob) {
                                age = String.valueOf(AgeCalculator.calculate(dob));
                            } 
                        }

                        info[i][3]=dob;
                        info[i][5]=age;
                        System.out.print("Users date of birth and age has been updated!!");

                        break;

                    case "5":

                        id=Prompter.prompt("Enter updated id ->");

                        if(id.isEmpty()){
                            System.out.print("Value not entered. Blank Space");
                        }else{
                            info[i][4]=id;
                            System.out.print("Users id has been updated!!");
                        }

                        break;

                    default:

                        System.out.print("Value entered is out of range");
                        break;
                }
                  try {
            insertdoc(info);
        } catch (FileNotFoundException e) {
            // Handle the exception (e.g., print an error message)
            System.out.println("Error writing to file: " + e.getMessage());
        }
        }
    
	   }
       if (userFound==false) {
            System.out.print("User not found");
        }
}
	

public static void delete(String email) {
    boolean found = false;

    for (int i = 0; i < info.length; i++) {
        if (info[i][2] != null && info[i][2].equals(email)) {
            found = true;
            String[][] temp = new String[info.length - 1][6];
            int newIndex = 0;
            for (int j = 0; j < info.length; j++) {
                if (j != i) {
                    temp[newIndex++] = info[j];
                }
            }
            info = temp;
            rowCount--;
            System.out.println(email + " has been deleted");
             try {
            insertdoc(info);
        } catch (FileNotFoundException e) {
            // Handle the exception (e.g., print an error message)
            System.out.println("Error writing to file: " + e.getMessage());
        }
            break; // Exit the loop once deletion is done
        }
    }
    if (!found) {
        System.out.println("User not found");
    }
}


  public static void findAll() {
        //readFromFile();
        if (info.length > 0) {
            for (int i = 0; i < info.length; i++) {
                System.out.println("User " + (i + 1) + ":");
                System.out.println("\tName: " + info[i][0]);
                System.out.println("\tSurname: " + info[i][1]);
                System.out.println("\tEmail: " + info[i][2]);
                System.out.println("\tDate of Birth: " + info[i][3]);
                System.out.println("\tID: " + info[i][4]);
                System.out.println("\tAge: " + info[i][5]);
                System.out.println();
            }
        } else {
            System.out.println("No data found in the file.");
        }
    }


    public static String[] getUserByEmail(String email){

        String [] arr=new String[6];
        boolean userFound = false;
        for(int i=0;i<info.length;i++){
            if(info[i][2].equals(email)){

                userFound = true;
                
                arr[0]=info[i][0];
                arr[1]=info[i][1];
                arr[2]=info[i][2];
                arr[3]=info[i][3];
                arr[4]=info[i][4];
                arr[5]=info[i][5];

               
                System.out.print("\nName: "+arr[0]);
                System.out.print("\nSurname: "+arr[1]);
                System.out.print("\nEmail: "+arr[2]);
                System.out.print("\nDate of birth: "+arr[3]);
                System.out.print("\nid: "+arr[4]);
                System.out.print("\nAge: "+arr[5]);

            
            }
            // else{
            //     System.out.print("User not found");
            // }
        }
        if(userFound == false){
            System.out.println("User not found.");
        }
        return arr;
    }

    public static boolean checkemail(String email){
        for(int i=0;i<info.length;i++){
            if(info[i][2] != null && info[i][2].equals(email)){
                return true;
            }
        }
        return false;
    }

     public static boolean checkemaildup(String email){
        for(int i=0;i<info.length;i++){
            if(info[i][2] != null && info[i][2].equals(email)){
                System.out.println("Emails is already taken..please enter a unique email");
                return false;
            }
        }
        return true;
    }


  public static void insertdoc(String[][]info) throws FileNotFoundException {
    PrintWriter output = new PrintWriter("Challenge3.txt");
    for (int i = 0; i < info.length; i++) {
        output.print("[");
        for (int j = 0; j < info[i].length; j++) {
            output.print(info[i][j]);
            if (j < info[i].length - 1) {
                output.print(", ");
            }
        }
        output.println("]");
    }
    output.close();
}

 public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Challenge3.txt"))) {
            long count = reader.lines().count();
            info = new String[(int) count][6];
            
            BufferedReader resetReader = new BufferedReader(new FileReader("Challenge3.txt"));
            String line;
            int index = 0;
            while ((line = resetReader.readLine()) != null) {
                String[] parts = line.substring(1, line.length() - 1).split(", ");
                if (parts.length == 6) {
                    for (int i = 0; i < 6; i++) {
                        info[index][i] = parts[i];
                    }
                    index++;
                }
            }
            System.out.println("File data read successfully.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }


   


}









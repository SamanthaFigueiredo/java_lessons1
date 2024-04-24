public class UserDAO{

	public static int rowCount=0;
	public static String [][] info=new String[rowCount][6];

	public static void create(String name, String surname, String email, String dob, String id,String age){
		// Increment rowCount first
        rowCount++;
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

                    validmail=(FormatChecker.emailcheck(email)&UserDAO.checkemaildup(email));                }
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
    }
    
	}if (userFound==false) {
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
            break; // Exit the loop once deletion is done
        }
    }
    if (!found) {
        System.out.println("User not found");
    }
}



	public static String[] findAll(){
         String [] arr=new String[info.length];
        if(info.length==0){
            System.out.print("No Users found!!! Add Users :)");
        }
		for (int i = 0; i < info.length; i++) {
       
           
           String output="\nName: "+info[i][0]+"\nSurname: "+info[i][1]+"\nEmail: "+info[i][2]+"\nDate of birth: "
                        +info[i][3]+"\nid: "+info[i][4]+"\nAge: "+info[i][5]+"\n";
            arr[i]=output;
                

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
		return arr;
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
                System.out.print("\nDate of birht: "+arr[3]);
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



}


 // System.out.println("User " + (i + 1) + ":");
            // System.out.println("Name: " + info[i][0]);
            // System.out.println("Surname: " + info[i][1]);
            // System.out.println("Email: " + info[i][2]);
            // System.out.println("DOB: " + info[i][3]);
            // System.out.println("ID: " + info[i][4]);
            // System.out.println("Age: " + info[i][5]);
            // Add a line break between users




// public static String[] findAll(){
         
//         if(info.length==0){
//             System.out.print("No Users found");
//         }
//         for (int i = 0; i < info.length; i++) {
            
//             // arr[0]=info[i][0];
//             // arr[1]=info[i][1];
//             // arr[2]=info[i][2];
//             // arr[3]=info[i][3];
//             // arr[4]=info[i][4];
//             // arr[5]=info[i][5];
           
//                 // System.out.print("Name: "+arr[0]);
//                 // System.out.print("\nSurname: "+arr[1]);
//                 // System.out.print("\nEmail: "+arr[2]);
//                 // System.out.print("\nDate of birth: "+arr[3]);
//                 // System.out.print("\nid: "+arr[4]);
//                 // System.out.print("\nAge: "+arr[5]);

//         }
        
//         return info;
//     }


/*public static void delete(String email) {
    int indexToRemove = -1;//unreachable value
    //assigns that new index to indexToRemove.
    for (int i = 0; i < info.length; i++) {
        if (info[i][2] != null && info[i][2].equals(email)) { // Check for non-null email
            indexToRemove = i;
            break;
        }
    }
    //If "indexToRemove" is different to original value
    if (indexToRemove != -1) {
        //temp array storing oldsize - removed elements
        String[][] temp = new String[info.length - 1][6];
        int newIndex = 0;
        //populates new array
        for (int i = 0; i < info.length; i++) {
            if (i != indexToRemove) {
                temp[newIndex++] = info[i];
            }
        }
        //assigns info array to temp
        info = temp;
        rowCount--; // Decrement rowCount since a user is deleted
        System.out.println(email+" has been deleted");
    } else {
        //email entered is not found
        System.out.println("User not found");
    }
}*/




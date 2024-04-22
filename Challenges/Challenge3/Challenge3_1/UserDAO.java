public class UserDAO{

	private static int rowCount=0;
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
        for (int i = 0; i < info.length; i++) {
        if (info[i][2] != null && info[i][2].equals(email)) { // Check for non-null email
            System.out.println("\nSelect and option you would like to edit \n" 
                            +"1. Name \n"
                            +"2. Surname \n"
                            +"3. Email \n"
                            +"4. Date of birth \n"
                            +"5. ID \n"
                            );

            String edit=Prompter.prompt("-> ");
            switch(edit){
            case "1":
                name=Prompter.prompt("Enter updated name ->");
                info[i][0]=name;
                break;
            case "2":
                surname=Prompter.prompt("Enter updated surname ->");
                info[i][1]=surname;
                break;
            case "3":
                email=Prompter.prompt("Enter updated email ->");
                info[i][2]=email;
                break;
            case "4":
                dob=Prompter.prompt("Enter updated date of birth ->");
                info[i][3]=dob;
                age=String.valueOf(AgeCalculator.calculate(dob));

                info[i][5]=age;
                break;
            case "5":
                id=Prompter.prompt("Enter updated id ->");
                info[i][4]=id;
                break;
            default:

            }

        }else{
            System.out.print("User not found");
        }
    }
	}
	

	public static void delete(String email) {
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
}


	public static String[][] findAll(){

        if(info.length==0){
            System.out.print("No Users found");
        }
		for (int i = 0; i < info.length; i++) {
            System.out.println("User " + (i + 1) + ":");
            System.out.println("Name: " + info[i][0]);
            System.out.println("Surname: " + info[i][1]);
            System.out.println("Email: " + info[i][2]);
            System.out.println("DOB: " + info[i][3]);
            System.out.println("ID: " + info[i][4]);
            System.out.println("Age: " + info[i][5]);
            System.out.println(); // Add a line break between users
        }
		return info;
	}

    public static String[][]getUserByEmail(String email){
        for(int i=0;i<info.length;i++){
            if(info[i][2].equals(email)){

            System.out.println("User " + (i + 1) + ":");
            System.out.println("Name: " + info[i][0]);
            System.out.println("Surname: " + info[i][1]);
            System.out.println("Email: " + info[i][2]);
            System.out.println("DOB: " + info[i][3]);
            System.out.println("ID: " + info[i][4]);
            System.out.println("Age: " + info[i][5]);
            System.out.println(); // Add a line break between users
        
            }else{
                System.out.print("User not found");
            }
        }
        return info;
    }


}
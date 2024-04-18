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

	public static void update(String name, String surname, String email, String dob, String id){

	}
	//public static String[] getUserByEmail(String email){
	//	return email;
	//}

	public static void delete(String email){

	}
	public static String[][] findAll(){

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
}
public class print{
    public static void printer(String NameSurname, String grade,String ClassTeacher, String PETeacher){

        System.out.println("\n------------------------------------------\n");

        System.out.println("Hello "+ NameSurname + " :)");
        System.out.println("You are in grade "+grade);

        int newgrade=Integer.parseInt(grade);
        if(newgrade >7){
            System.out.println("You are in block A");
        }else{
            System.out.println("You are in block B");
        }

        System.out.println("Class Teacher: "+ClassTeacher);
        System.out.println("PE Teacher: "+PETeacher);
        System.out.println("\n------------------------------------------\n");

    }
}

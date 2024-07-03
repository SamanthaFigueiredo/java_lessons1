public class BooleanTest4{
	public static void main(String[]args){
		//constructor for Boolean
		String val = "true";

        // Convert the string to an Boolean using parseBoolean method
        Boolean bool = Boolean.parseBoolean(val);

        // Print the converted Boolean
        System.out.println("Value: " + bool);
	}
}

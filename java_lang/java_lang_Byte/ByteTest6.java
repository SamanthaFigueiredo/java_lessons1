public class ByteTest6{
	public static void main(String[]args){
		//constructor for Byte
		Byte num= new Byte((byte)42);

		Byte nums = Byte.valueOf(num);

        // Print the converted Byte
        System.out.println("Value: " + nums);
	}
}

public class CharacterTest6{
	public static void main(String[]args){
		//constructor for Character
		Character num= new Character('a');

		Character nums = Character.valueOf(num);

        // Print the converted Character
        System.out.println("Value: " + nums);
	}
}

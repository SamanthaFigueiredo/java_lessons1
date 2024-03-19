public class Excersice1{
	public static void main(String []args){
		int [] nums=new int[50];
		System.out.println("\n Array\n");
		for(int i=0; i<nums.length;i++){
			nums[i]=i;
			System.out.println(nums[i]);
		}

		
		System.out.println("\n New array increment with 1\n");
		for(int i=0; i<nums.length;i++){
			nums[i]=i+1;
			System.out.println(nums[i]);
		}

	}
}
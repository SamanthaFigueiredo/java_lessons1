public class InstCounterTest2 {
	public static void main(String[] args) {
		InstanceCounter2 obj1 = new InstanceCounter2();
		InstanceCounter2 obj2 = new InstanceCounter2();
		InstanceCounter2 obj3 = new InstanceCounter2();

                //sysout InstanceCounter.staticCounter
				System.out.print(obj1.staticCounter);
                InstanceCounter2.staticCounter = 1000;

                //sysout InstanceCounter.staticCounter
                System.out.print(obj2.staticCounter);
                //increment object counter 1
                InstanceCounter2.objectCounter = 1;
                //increment static counter = 1001
                InstanceCounter2.staticCounter = 1001;

	}	
}

public class Tester4{
	public static void main(String[]args){
		Runnable run=()->{System.out.print("Run");};

		Runnable run2=()-> System.out.print("Run");
	}
}

interface Runnable{
	public void run();
}
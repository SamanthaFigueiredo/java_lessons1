public class Tester6{
	@FunctionalInterface
	interface LambdaFunction{
		int apply(int j, int x);
		boolean equals (java.lang.Object arg0);
	}

	public static void main(String[]args){
		LambdaFunction lamfunc= (i,j) -> i*j;
		System.out.print(lamfunc.apply(10, 20));
	}
}
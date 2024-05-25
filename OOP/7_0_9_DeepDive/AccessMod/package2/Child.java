package package2;

import package1.Parent;

public class Child extends Parent{

	protected static void childmethod(){
		
		Parent.myMethod1();
		System.out.println("I am child");
	}

	public static void childmethod2(){
		
		Parent.family();
		System.out.println("We are family");
	}

	public Child(){
		//super();
	}
	public Child(int a,int b){

		super(a,b);
	}

	public Child(int a,int b, int c){
		this(a,b);
	}

}

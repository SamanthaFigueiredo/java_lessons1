public class VariableTypes2 implements VariableTypes{

 	public static int i=5;
    public static int j=7;
    public int x=6;
    public int y=8;

    public final static int var2=10;
    public final static String var3="10";

    //public final static int var1;
    public int var4;
    public int var5;
    public static int var6;
    public static int var7;

	public static void main(String[]args){
		VariableTypes2 vt=new VariableTypes2();
		vt.doIt();
		VariableTypes2 vt2=new VariableTypes2();
		vt2.converter(var3);
		
		VariableTypes2 vt3=new VariableTypes2(j,var6,var7);
	}

    static{
    	var7=11;
    }

    {
    	var4=15;
    	i++;
    	j++;
    	x++;
    	y++;
    	var4++;
    	var5++;
    	var6++;
    	var7++;
    }
	 VariableTypes2(){
    	var5=13;
    	var6=9;
    }

	  VariableTypes2(int i, int j) {
          // Calls the no-argument constructor to initialize other variables
        double res = (this.i + this.j - this.var6 + 4.0) + this.var7;
        System.out.println("Result for 2 args constructor: " + res);
    }

    VariableTypes2(int a, int b, int c){
    	this(a,b);
    	double res2=(a-b+this.var6+c)-this.var7;
    	System.out.print("Result for 3 args constructor "+res2);

    }

    public void converter(String input)  {
        
        int convertedval = Integer.parseInt(input);
        
        System.out.println("Converted String: " + convertedval);
    }

   
	public void doIt(){
		int a=2;
		
		System.out.println("Overloaded method 2: "+this.doIt(this.x,this.y,a));
		

	}

	public int doIt(int i, int j, int x){
		
		int a=4;
		int b=1;
		System.out.println("Overloaded method 3: "+this.doIt(i,j,a,b));
		return  (i + j - x) /a * var2;


	}

	public static int doIt(int i, int j, int x, int y){
		int a =3;
		return (i + j * x) / a * var2;
	}


	

}
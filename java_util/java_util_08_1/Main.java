import java.util.*;
class Main{

public static void main(String[]args){


	List<Banana> banana=new ArrayList<Banana>();
	banana.add(new Banana());
	banana.add(new Banana());
	banana.add(new Banana());



	Iterator value = banana.iterator(); 
  
        
    System.out.println("The iterated banana values: "); 
    while (value.hasNext()) { 
       System.out.println(value.next()); 
    } 

    Map<Ball,Banana> ball=new HashMap<Ball,Banana>();
    ball.put(new Ball(),new Banana());
    ball.put(new Ball(),new Banana());
    ball.put(new Ball(),new Banana());

    System.out.println("The iterated ball values: ");
  	System.out.println(ball);
}
}


class Banana{
	@Override
	public String toString(){
		return "Banana";
	}
}

class Ball{
	@Override
	public String toString(){
		return "Ball";
	}
}

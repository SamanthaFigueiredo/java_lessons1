 public class NullTest5{
  public static void main(String[]args){
  String f = null ;

  try{
     System.out.println("this will cause null pointer exception  "+ f.length());
 }catch(Exception e){
    System.out.print(" Error occured");
 }
 
  }
}

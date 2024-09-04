
public class Tester8 extends Writer{
    public static void write(){
        System.out.println("Writing code");
    }
    public static void main(String[]args){
        Writer w=new Tester8();
        w.write();
    }
}
abstract class Writer{
    public static void write(){
        System.out.println("Writing...");
    }
}
class Author extends Writer{
    public static void write(){
        System.out.println("Writing book");
    }
}
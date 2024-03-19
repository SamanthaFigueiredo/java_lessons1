// Java program to demonstrate assertion in Java
public class Assertex {
    public static void main(String[] args)
    {
        int age = 12;
        assert age >= 18 : "Too young to vote";
        System.out.println("The voter's age is " + age);
    }
}

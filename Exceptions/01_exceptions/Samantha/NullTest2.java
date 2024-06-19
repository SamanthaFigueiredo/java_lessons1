public class NullTest2 {

    static NullObject nullObject;

    public static void main(String[] args) {
        System.out.println("Start");
        nullObject = new NullObject();
        try {
            nullObject.test();
        } catch (MyException e) {
            System.out.println("MyException occurred: " + e.getMessage());
        }
        System.out.println("Finished");
    }
}
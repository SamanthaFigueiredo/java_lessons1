
public class Assertex{

public static void main(String []args){

List<String> names = Arrays.asList("Alice", "Bob", null, "Charlie");

for(String name : names) {
    assert name != null : "null value in names";
}


}}
import java.util.*;
import java.util.function.Predicate;

public class PersonMain {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Doe", 21, Gender.MALE, City.LOS_ANGELES));
        persons.add(new Person("Jane", "Smith", 30, Gender.FEMALE, City.TOKYO));
        persons.add(new Person("Alice", "Johnson", 20, Gender.FEMALE, City.MIAMI));
        persons.add(new Person("Bob", "Brown", 55, Gender.MALE, City.ROME));

        
      	persons.removeIf(((Predicate<Person>)(e->e.getCity().equals(City.TOKYO))).negate());

      	
        persons.forEach(System.out::println);
    }
}

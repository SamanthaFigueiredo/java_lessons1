import java.util.*;
import java.util.Date;
import java.util.List;

public class LambdaSortMain{
	 public static void main(String[] args) {
        // Create a list of LambdaSortMain objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("1990,5,15", "John", "Doe"));
        persons.add(new Person("1985,10,25", "Jane", "Smith"));
        persons.add(new Person("2000,3,8", "Alice", "Johnson"));
        persons.add(new Person("1970,8,12", "Bob", "Brown"));
//persons.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
       persons.sort(Comparator.comparing(Person::getSurname).reversed());
       persons.forEach(person -> person.setDaysToNextBirthday(person.calculateDaysToNextBirthday()));
       persons.forEach(System.out::println);


    }
}

   


import java.util.*;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private City city;

    public Person(String name, String surname, int age, Gender gender, City city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return 
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", city=" + city;
    }

 
}





import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Person {
    private String dateOfBirth;
    private int age;
    private String name;
    private String surname;
    private long daysToNextBirthday;

    Person(String dateOfBirth, String name, String surname) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.age = calculateAge();
    }

    private int calculateAge() {
        String[] parts = this.dateOfBirth.split(",");
        int birthYear = Integer.parseInt(parts[0]);
        int birthMonth = Integer.parseInt(parts[1]);
        int birthDay = Integer.parseInt(parts[2]);

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.of(2024, 1, 1); // Assuming current date is 2024-01-01
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    public long calculateDaysToNextBirthday() {
        String[] parts = this.dateOfBirth.split(",");
        int birthMonth = Integer.parseInt(parts[1]);
        int birthDay = Integer.parseInt(parts[2]);

        LocalDate currentDate = LocalDate.of(2024, 1, 1); // Assuming current date is 2024-01-01
        LocalDate nextBirthday = LocalDate.of(2024, birthMonth, birthDay);

        if (nextBirthday.isBefore(currentDate) || nextBirthday.equals(currentDate)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(currentDate, nextBirthday);
    }

    public void setDaysToNextBirthday(long days) {
        this.daysToNextBirthday = days;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return this.age; // Hash on age
    }

 public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", daysToNextBirthday=" + daysToNextBirthday +
                '}';
    }
}

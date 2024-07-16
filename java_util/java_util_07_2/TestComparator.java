
import java.io.*;
import java.lang.*;
import java.util.*;

// Class 1
class Student {

	int rollno;
	String name;

	// Constructor
	public Student(int rollno, String name)
	{

		// This keyword refers to current instance itself
		this.rollno = rollno;
		this.name = name;
		
	}

	// Method of Student class
	// To print student details in main()
	public String toString()
	{

		// Returning attributes of Student
		return this.rollno + " " + this.name;
	}
}

// Class 2
class Sortbyroll implements Comparator<Student> {

	// Method
	// Sorting in ascending order of roll number
	public int compare(Student a, Student b)
	{

		return a.rollno - b.rollno;
	}
}

// Class 3
class Sortbyname implements Comparator<Student> {

	// Method
	// Sorting in ascending order of name
	public int compare(Student a, Student b)
	{

		return a.name.compareTo(b.name);
	}
}

// Class 4
class TestComparator {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an empty ArrayList of Student type
		ArrayList<Student> ar = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method
		ar.add(new Student(111, "Mayank"));
		ar.add(new Student(131, "Anshul"));
		ar.add(new Student(121, "Solanki"));
		ar.add(new Student(101, "Aggarwal"));

		// Display message on console for better readability
		System.out.println("Unsorted");

		// Iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by roll number
		Collections.sort(ar, new Sortbyroll());

		// Display message on console for better readability
		System.out.println("\nSorted by rollno");

		// Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by name
		Collections.sort(ar, new Sortbyname());

		// Display message on console for better readability
		System.out.println("\nSorted by name");

		// // Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}

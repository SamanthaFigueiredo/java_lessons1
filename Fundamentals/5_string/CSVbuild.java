import java.util.Scanner;
import java.io.*;

public class CSVbuild{
	public static main void(String[]args){
		Scanner sc= new Scanner(System.in);
 		System.out.println("Menu");
        System.out.println("1. Capture New User ");
        System.out.println("2. Print CSV");
        System.out.println("3. Exit\n");

        System.out.println("Select Option ->");
        int choice = sc.nextInt();

        if(choice ==1){
        	CreateNewUser();
        }else if(choice ==2){
        	ViewCSV();
        }else if(choice ==3){
        	System.exit();
        }else{
        	System.out.println("Invalid Option Chosen");
        }


	}


	public static void CreateNewUser(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name -> ");
		String name = sc.nextLine();
		System.out.println("Enter Surname -> ");
		String surname=sc.nextLine();
		System.out.println("Enter Age -> ");
		String age=sc.nextInt();
	}

	public static void ViewCSV(){
		System

	}
}
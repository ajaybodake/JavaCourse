// Java program to demonstrate the use of Scanner class
// to take input from user

import java.util.Scanner;

public class ScannerDemo1 {
	
	public static void main(String[] args) {
		
	System.out.println("main method started!!!");
	
	int input = 0;
   	
	System.out.println("Enter a number : ");
	
	Scanner sc = new Scanner(System.in);    // Create a Scanner object
	
	input = sc.nextInt();   // Read user input
	
	System.out.println("You entered number ========>>>" + input);   //// Output user input
	
	System.out.println("main method ended!!!");
		
	}

}

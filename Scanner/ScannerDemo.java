import java.util.Scanner;	// Import the Scanner class

public class ScannerDemo {
	
	public static void main(String[] args) {
		
	System.out.println("main method started!!!");
	
	String input;	//Create a variable
	
	System.out.println("Enter a statement : ");
	
	Scanner sc = new Scanner(System.in);	//Create the object of the Scanner class.
	
	input = sc.nextLine();		//reads entire line including space
	//using scanner class object call the corresponding method to take the input value.

//	input = sc.next();		//next reads the single word (stops at space)
	
	System.out.println("You entered statement ========>>>" + input);

	// close the scanner
    System.out.println("Closing Scanner...");
    sc.close();		//close scanner when done
	
	System.out.println("main method ended!!!");
		
	}

}

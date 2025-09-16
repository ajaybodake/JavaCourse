import java.util.Scanner;

public class ScannerDemo3 {
	
	public static void main(String[] args) {
		
	System.out.println("main method started!!!");
	
	boolean input;
	
	System.out.println("Enter a Yes/No : ");
	
	Scanner sc = new Scanner(System.in);
	
	input = sc.nextBoolean();
	
	System.out.println("You entered  ========>>>" + input);
	
	System.out.println("main method ended!!!");
		
	}

}

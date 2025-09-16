import java.util.Scanner;

public class ScannerDemo2 {
	
	public static void main(String[] args) {
		
	System.out.println("main method started!!!");
	
	char input;
	
	System.out.println("Enter a character : ");
	
	Scanner sc = new Scanner(System.in);
	
	input = sc.next().charAt(0);
	
	System.out.println("You entered  ========>>>" + input);
	
	System.out.println("main method ended!!!");
		
	}

}

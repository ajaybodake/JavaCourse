import java.util.Scanner;

public class IfElseIfLadderDemoUsingScanner {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		int marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks :");
		
		marks = sc.nextInt();
		
		System.out.println("You have entered marks = "+marks);
		
		if((marks >= 0) && (marks < 35))
		{
			System.out.println("Fail");
		}
		else if((marks >= 35) && (marks < 45))
		{
			System.out.println("C Grade!!");
		}
		else if((marks >= 45) && (marks < 55))
		{
			System.out.println("B Grade!!");
		}
		else if((marks >= 55) && (marks < 75))
		{
			System.out.println("A Grade!!");
		}
		else if((marks >= 75) && (marks <= 100))
		{
			System.out.println("First class with Distinction!!");
		}
		else
		{
			System.out.println("You have entered INVALID MARKS!!! - marks must be within range of 0-100");
		}		
		
			System.out.println("main method ended!!");
		
	}

}

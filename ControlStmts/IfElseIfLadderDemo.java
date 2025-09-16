package com.prowings.corejava.controlstatements;

public class IfElseIfLadderDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		int marks = 175;
		
		if(marks < 35)
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
			System.out.println("INVALID MARKS!!! - marks must be within range of 0-100");
		}
		
		
			System.out.println("main method ended!!");
		
	}

}

package com.prowings.corejava.controlstatements;

public class IfDemo {
	
	public static void main(String[] args) {
		
		int a = 11;
		
		if(isEven(a))
		{
			System.out.println(a +" is Even!!");
		}
		
	}

	public static boolean isEven(int number)
	{
		if(number % 2 == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

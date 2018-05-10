package com.SeleniumProject.javaprogrammes;

public class Stringeg2 {

	public static void main(String[] args) 
	{
		String Desg="Malayalam";
		String Rev="";
		int len=Desg.length();

		
		for (int i = len-1; i >= 0; i--) 
		{
			Rev=Rev+Desg.charAt(i);
		}
		System.out.println(Rev);
		
		if (Desg.equalsIgnoreCase(Rev)) 
		{
			System.out.println("The given String is a polindrome");
		}
		else
		{
			System.out.println("The given string is not a polindrome");
		}
	}

}

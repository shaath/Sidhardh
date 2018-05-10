package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args)
	{
		String Desg="Manager";

		int len=Desg.length();
		
		for (int i = 0; i < len; i++) 
		{
			char letter=Desg.charAt(i);
			System.out.println(letter);
		}
		System.out.println("************");
		
		for (int i = len-1; i >= 0; i--) 
		{
			char letter=Desg.charAt(i);
			System.out.print(letter);
		}
	}

}

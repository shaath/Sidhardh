package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i=i+1) 
		{
			System.out.println(i);
			if (i==7) 
			{
				break;
			}
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

}

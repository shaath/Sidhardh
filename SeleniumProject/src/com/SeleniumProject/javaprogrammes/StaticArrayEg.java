package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] salary={10000,20000,30000,40000,50000,20000};
//		Finding the length of an array
		System.out.println("The length of an array is "+salary.length);
	//	Reading the value from an array
		
//		System.out.println(salary[2]);
		
//		for (int i = 0; i < salary.length; i++)
//		{
//			System.out.println(salary[i]);
//		}
		
		for (int i : salary) 
		{
			System.out.println(i);
		}
	}

}

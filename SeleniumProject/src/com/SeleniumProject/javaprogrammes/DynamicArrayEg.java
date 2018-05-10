package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		int[] salary=new int[5];

		System.out.println(salary.length);
		
		//writing the data into an array
		salary[2]=50000;
		
		salary[4]=30000;
		salary[2]=40000;
		
		salary[5]=60000;
		for (int i = 0; i < salary.length; i++) 
		{
			System.out.println(salary[i]);
		}
	}

}

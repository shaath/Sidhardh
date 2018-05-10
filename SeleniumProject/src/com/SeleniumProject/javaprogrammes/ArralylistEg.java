package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArralylistEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into an array
		x.add("Selenium");
		x.add(40000);
		x.add(true);
		x.add('A');
		
		x.add(4, "UFT");
		x.add(3, "Sharath");
		x.add('A');
		
		System.out.println(x.size());
		
		
//		System.out.println(x.get(2));
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
		
		

	}

}

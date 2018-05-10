package com.SeleniumProject.javaprogrammes;

import java.util.Scanner;
public class NestedIfEg {

	public static String course="Selenium";
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter C value");
		int c=sc.nextInt();
		
		if (a > b && a > c) 
		{
			System.out.println(a+" is Greater");
		}
		else if (b > a && b>c)
		{
			System.out.println("B is Greater");
		}
		else if (c>a && c>b) {
			System.out.println("C is greater");
		}
			

	}

}

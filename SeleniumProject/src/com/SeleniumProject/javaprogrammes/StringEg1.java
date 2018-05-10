package com.SeleniumProject.javaprogrammes;

public class StringEg1 {

	public static void main(String[] args) 
	{
		String course="Selenium len";
		String var="selenium";
		System.out.println(course.length());
		
		System.out.println(course.charAt(4));
		
		System.out.println(course.substring(2, 5));
		
		String x=String.join("-", "You selected", course, "By");
		System.out.println(x);
		
		System.out.println(course.trim().length());
		
		System.out.println(course.toUpperCase());
		System.out.println(course.toLowerCase());
		
		System.out.println(course.lastIndexOf('e'));
		
		System.out.println(course.replace("e", "a"));
		
		if (course.equalsIgnoreCase(var)) {
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the strings are not same");
		}
		
		if (course.contains("len")) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println(course.indexOf("len"));
	}

}

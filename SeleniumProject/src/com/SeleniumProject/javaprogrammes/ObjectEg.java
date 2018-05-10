package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={20000,"Selenium",'V',true,444.44};

		System.out.println(x.length);
		
		for (Object data : x)
		{
			System.out.println(data);
		}
	}

}

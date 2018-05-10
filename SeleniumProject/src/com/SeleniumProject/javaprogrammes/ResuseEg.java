package com.SeleniumProject.javaprogrammes;

public class ResuseEg {

	public static void main(String[] args)
	{
		MethodsEg m=new MethodsEg();
		
		int res=m.sum(300,700);
		System.out.println(res);
		
		res=m.sum(10, 20, 30);
		System.out.println(res);

	}

}

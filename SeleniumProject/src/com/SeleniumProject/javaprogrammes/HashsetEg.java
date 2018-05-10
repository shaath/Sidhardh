package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEg {

	public static void main(String[] args)
	{
		HashSet<String> s=new HashSet<String>();
		
		//Writing the data into hashset
		s.add("Selenium");
		s.add("UFT");
		s.add("Apple");
		s.add("Boll");
		s.add("Apple");
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String data=it.next();
			System.out.println(data);
		}
		
		

	}

}

package org.collectionPractice;

import java.util.HashMap;

public class MapEx3 {
	public static void main(String[] args)  {
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(10, "UK");
		m1.put(-11, "USA");
		m1.put(1, "Mumbai");
		m1.put(5 , "Pune");
		System.out.println("m1: "+m1);
		m1.put(-11 , "SA");
		m1.put(99 , "Mumbai");
		m1.put(null , "Japan");
		m1.put(77 , null);
		m1.put(null , "Delhi");
		
		System.out.println("m1: "+m1);
		
		
		
		
		
		
	}

}

package org.collectionPractice;

import java.util.HashMap;

public class MapEx2 {
	public static void main(String[] args)  {
		HashMap<Object,Object> m1 = new HashMap<Object,Object>();
		m1.put(10, 50);
		m1.put(-11, "USA");
		m1.put('Q', new MapEx2());
		m1.put("Name", "Akshay Kumar");
		System.out.println("m1: "+m1);
		System.out.println("isEmpty: "+m1.isEmpty());
		System.out.println("size: "+m1.size());
		m1.clear();
		System.out.println("m1: "+m1);
		
		
		
		
		
		
	}

}

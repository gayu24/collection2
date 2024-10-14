package org.collectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx5 {
	public static void main(String[] args)  {
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(10, "UK");
		m1.put(-11, "USA");
		m1.put(1, "Mumbai");
		m1.put(5 , "Pune");
		m1.put(99 , "Mumbai");
		m1.put(null , "Japan");
		m1.put(77 , null);
		System.out.println("m1: "+m1);
	//	m1.keySet().contains(1);
	//	m1.values().contains("Japan");
		System.out.println("containsKey : "+m1.containsKey(5));
		System.out.println("containsValue : "+m1.containsValue("Mumbai"));
		}
		
	
		
		
		
		
	}



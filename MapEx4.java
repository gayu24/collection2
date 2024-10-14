package org.collectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx4 {
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
		m1.remove(-11);
		m1.remove(-11, "USA");
		m1.replace(null, "China");
		System.out.println("m1: "+m1);
		Set<Integer> s1 = m1.keySet();
		for(Integer obj:s1) {
			System.out.println(obj);
		}
		System.out.println("*****************");		;
		Collection<String>  c1  =  m1.values();
		for(String str: c1) {
			
		}
		//System.out.println("m1: "+m1);	
		
		
		
		
	}

}

package org.collectionPractice;

import java.util.HashSet;

public class SetEx3 {
	public static void main(String[] args)  {
		HashSet<Object> h1 = new HashSet<Object>();  
		h1.add("Pune");
		h1.add("Mumbai");
		h1.add(55);
		h1.add(Integer.valueOf(-99));
		h1.add(true);
		h1.add(null);
		System.out.println("h1: "+h1);
		for(Object obj:h1) {
			if(obj != ("Pune")) {
			System.out.println(obj);
		}
	  }
	}
}

//int[] ar = {20, 30, 40, 50, 10};
//for(int i : ar) {
// System.out.println(i);
//}

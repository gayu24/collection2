package org.collectionPractice;

import java.util.ArrayList;

public class ArEx5 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(-5);
		ar.add(20);
		ar.add(88);
		ar.add(77);
		ar.add(55);
		System.out.println("ar : "+ar);
		ar.set(3, 99);
		System.out.println("ar : "+ar);
		//ar.remove(3);     // 99
		//ar.remove(99);   // exception as its index
		ar.remove(Integer.valueOf(99));
		System.out.println("ar : "+ar);
		ar.add(1, 123);
		System.out.println("ar : "+ar);
		System.out.println(ar.contains(20));  
		System.out.println(ar.contains(201));
		
		System.out.println("**Program Ends**");
}

}

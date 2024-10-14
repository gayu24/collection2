package org.collectionPractice;

import java.util.HashSet;

public class SetEx2 {
	public static void main(String[] args)  {
		HashSet<Object> h1 = new HashSet<Object>();   // duplicate objects are not allow
		System.out.println("isEmpty: "+h1.isEmpty());
		System.out.println("size: "+h1.size());
		h1.add("Pune");
		h1.add("Mumbai");
		h1.add(55);
		h1.add(Integer.valueOf(-99));
		h1.add(true);
		h1.add(null);
		System.out.println("h1: "+h1);
		System.out.println("isEmpty: "+h1.isEmpty());
		System.out.println("size: "+h1.size());
		h1.add(new String("Pune"));    // duplicate
		h1.add("Mumbai");              // duplicate
		h1.add(null);                 // duplicate
		System.out.println("size: "+h1.size());
		System.out.println("h1: "+h1);
	 }

}

package org.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArEx8 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(-5);
		ar1.add(20);
		ar1.add(88);
		ar1.add(77);
		ar1.add(-5);
		ar1.add(20);
		ar1.add(88);
	    ar1.add(99);
		System.out.println("ar1 : "+ar1);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(20);
		ar2.add(88);
		ar2.add(77);
		ar2.add(10);
		ar2.add(-5);
	//	ar2.add(99);
		System.out.println("ar2 : "+ar2);
		System.out.println("******************");
		ar1.removeAll(ar2);
		ar1.retainAll(ar2);    // matching
		System.out.println("ar1 : "+ar1);
	    System.out.println("ar2 : "+ar2);
	
		System.out.println("**Program Ends**");
}

}

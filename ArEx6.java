package org.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArEx6 {
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
		Collections.sort(ar);           //ascending order - 1,2,3,4,5
		System.out.println("ar : "+ar);
		Collections.reverse(ar);       //reverse the arryList  // after sort method by default it give descending order
		System.out.println("ar : "+ar);
		ar.clear();                   // it clear the arrayList
    	System.out.println("ar : "+ar);
		
		System.out.println("**Program Ends**");
}

}

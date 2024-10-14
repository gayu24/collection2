package org.collectionPractice;

import java.util.ArrayList;

public class ArEx1 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		ArrayList ar1 = new ArrayList();
		
		//homogeneous ArrayLists/collection
		ArrayList<Integer> ar2 = new ArrayList<Integer> ();
		ArrayList<Character> ar3 = new ArrayList<Character>();
		ArrayList<String> ar4 = new ArrayList<String> ();
		ArrayList<ArEx1> ar5 = new ArrayList<ArEx1> ();
		
		// heterogeneous ArrayLists/collection
		ArrayList<Object> ar6 = new ArrayList<Object>();
		System.out.println("**Program Ends**");
	}

}

package org.collectionPractice;

import java.util.ArrayList;

public class ArEx4 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		
		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add(50);
		ar.add(Integer.valueOf(99));
		ar.add('R');
		ar.add(new  ArEx4());
		ar.add(Character.valueOf('Q'));
		ar.add(null);
		ar.add(new String("Pune"));
		ar.add("Pune");
		ar.add(new  ArEx4());
		ar.add(50);
		ar.add(null);
		ar.add(99.77);
		System.out.println("ar : "+ar);
		//System.out.println(ar.get(5));
		//System.out.println(ar.get(-5));
		for (int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
			System.out.println("**Program Ends**");
	}

}

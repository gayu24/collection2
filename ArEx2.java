package org.collectionPractice;

import java.util.ArrayList;

public class ArEx2 {
	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		
		ArrayList<Object> ar = new ArrayList<Object>();

		System.out.println("isEmpty : "+ar.isEmpty());
		int size = ar.size();
		System.out.println("size = "+size);
		ar.add(50);
		ar.add(Integer.valueOf(99));
		ar.add('R');
		ar.add(Character.valueOf('Q'));
		ar.add(null);
		ar.add(new String("Pune"));
		ar.add(50);
		ar.add(null);
		ar.add(99.77);
		System.out.println("ar : "+ar);
		System.out.println("isEmpty : "+ar.isEmpty());
		System.out.println("size : "+ar.size());
		
		System.out.println("**Program Ends**");
	}

}

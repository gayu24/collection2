package org.collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorEx1 {
	public static void main(String[] args)  {
		ArrayList<String> ar = new ArrayList<String>();   
		ar.add("Pune");
		ar.add("Mumbai");
		ar.add("USA");
		ar.add(new String("UK"));
		ar.add("Nasik");
		ar.add("Delhi");
		System.out.println("ar: "+ar);
		ListIterator<String>  itr = ar.listIterator();
		System.out.println("hasPrevious: "+itr.hasPrevious());
		System.out.println(itr.next());
		System.out.println("hasPrevious: "+itr.hasPrevious());
		System.out.println("previous "+itr.previous());

	
	}
}



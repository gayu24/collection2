package org.collectionPractice;

import java.util.HashSet;
import java.util.Iterator;



public class SetIteratorEx {
	public static void main(String[] args)  {
		HashSet<String> h1 = new HashSet<String>();   
		h1.add("Pune");
		h1.add("Mumbai");
		h1.add("USA");
		h1.add(new String("UK"));
		h1.add("Nasik");
		h1.add("Delhi");
		System.out.println("h1: "+h1);
		Iterator<String> itr = h1.iterator();
//		System.out.println(itr.hasNext());   //true
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		//System.out.println(itr.next());
//		for(int i=1; i<=h1.size(); i++)  {
//			System.out.println(itr.next());
//		}
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("USA")) {
				itr.remove();
				continue;
             }
		//	System.out.println(str);
		}
		System.out.println("h1: "+h1);
	}
}

//int[] ar = {20, 30, 40, 50, 10};
//for(int i : ar) {
// System.out.println(i);
//}

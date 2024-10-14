package org.collectionPractice;

import java.util.HashMap;

public class MapEx1 {
	public static void main(String[] args)  {
		//without generics/heterogeneous
		HashMap m1 = new HashMap();
		
		//heterogeneous
		HashMap<Object,Object> m2 = new HashMap<Object,Object>();
		HashMap<Object,String> m3 = new HashMap<Object,String>();
		
		//homegeneous
		HashMap<String,String> m4 = new HashMap<String,String>();
		HashMap<Integer,Integer> m5 = new HashMap<Integer,Integer>();
		HashMap<Integer,String> m6 = new HashMap<Integer,String>();
		//......
	}

}

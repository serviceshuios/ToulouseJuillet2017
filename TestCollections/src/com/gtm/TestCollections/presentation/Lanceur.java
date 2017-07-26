package com.gtm.TestCollections.presentation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al = new ArrayList();
		al.add(12);
		al.add("une chaine de caractère");
		al.add(12.2f);
		al.add("d");
		al.add(12);
		
		for(int i=0; i<al.size();i++) {
			System.out.println("la donnée à l'indice "+i+ " est "+al.get(i));
		}
	System.out.println("-----------------------------------------------------------------------");	
		List<String> al2 = new ArrayList<String>();
		al2.add("une chaine de caractère");
		al2.add("d");
		al2.add("d");

		for(int i=0; i<al2.size();i++) {
			System.out.println("la donnée à l'indice "+i+ " est "+al2.get(i));
		}
		System.out.println("====================================================================");	

		Set s = new HashSet();
		s.add(12);
		s.add("une chaine de caractère");
		s.add(12.2f);
		s.add("d");
		s.add(12);
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int i=0;i<s.size();i++) {
			System.out.println("la donnée à l'indice "+i+ " est "+s.toArray()[i]);
		}
System.out.println("-----------------------------------------------------------------------");	
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(15);
		s2.add(15);
		s2.add(2);
		
		Iterator it2 = s2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		System.out.println("====================================================================");	

		Hashtable m = new Hashtable();
		m.put(1, "printemps");
		m.put(10, "été");
		m.put("x", "automne");
		m.put(45, "hivers");
		
		Enumeration e = m.elements();
		Enumeration k = m.keys();
		
		while(e.hasMoreElements())
		{
			System.out.println(k.nextElement()+" => "+ e.nextElement());
		}
System.out.println("-----------------------------------------------------------------------");	

		Hashtable<Integer, String> m2 = new Hashtable<Integer, String>();
		m2.put(1, "printemps");
		m2.put(10, "été");
		m2.put(75, "automne");
		m2.put(45, "hivers");
		Enumeration e2 = m2.elements();
		Enumeration k2 = m2.keys();
		
		while(e2.hasMoreElements())
		{
			System.out.println(k2.nextElement()+" => "+ e2.nextElement());
		}
	}

}

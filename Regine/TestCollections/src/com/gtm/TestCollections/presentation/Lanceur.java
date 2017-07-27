package com.gtm.TestCollections.presentation;

// Classe permettant de tester 3 types de collections

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lanceur {
	
	public static void main(String[] args)
	{
// declaration des collections de type Array
		
		List al = new ArrayList();
		al.add(12);
		al.add("une chaine de caractères");
		al.add(12.2f);
		al.add("d");
		al.add(12);
		
		for(int i=0; i < al.size();i++) {
			
			System.out.println("la donnée à l'indice "+i+ " est " +al.get(i));
			
		}
		
		List<String> al2 = new ArrayList<String>();
		al2.add("une chaine de caracteres");
		al2.add("d");
		al2.add("d");
		
        for(int i=0; i < al2.size();i++) {
			
			System.out.println("la donnée à l'indice "+i+ " est " +al2.get(i));
			
		}
        
        System.out.println("==============================================");
        
     // methode Iterator pour pointer et parcourir la liste
        
        Set s = new HashSet();
    	s.add("d");
		s.add("d");
		s.add(2);
		s.add(3);
		
	// methode Iterator pour pointer et parcourir la liste
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
// Sortir les valeurs en se servant de la fonction toArray	pour ecceder à la valeur suivant l'indice	
		
		for(int i=0;i<s.size();i++)
		{
			System.out.println("La donnée à l'indice :" +i+ " est " +s.toArray()[i]);
		}
		System.out.println("==============================================");
		
		// methode Iterator pour pointer et parcourir la liste : affichage de la liste triée sans doublon
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		s2.add(2);
		s2.add(3);
		s2.add(1);
		s2.add(2);
		s2.add(20);
	
			
		Iterator it1 = s2.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("==============================================");	
		
		// Methode de collection où on choisit la valeur que l'on met dans une clé : parcours avec enumeration 
		
		Hashtable m = new Hashtable();
		m.put(1, "Printemps");
		m.put(10, "Eté");
		m.put("x", "Automne");
		m.put(45, "Hiver");
		
		Enumeration e = m.elements();
		Enumeration k = m.keys();
		
		while(e.hasMoreElements())
		{
			System.out.println(k.nextElement()+"  =>  "+e.nextElement());
			
			
		}
		
		System.out.println("==============================================");
	// imposer le type integer en cle et le type caracters en valeurs
		
		Hashtable<Integer,String> m1 = new Hashtable<Integer,String>();
		m1.put(1, "Printemps");
		m1.put(10, "Eté");
		m1.put(75, "Automne");
		m1.put(45, "Hiver");
		
		Enumeration ee = m1.elements();
		Enumeration k1 = m1.keys();
		
		while(ee.hasMoreElements())
		{
			System.out.println(k1.nextElement()+"  =>  "+ee.nextElement());
		}
		
		
		
		
	}
}

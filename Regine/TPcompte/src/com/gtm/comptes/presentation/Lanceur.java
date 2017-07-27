package com.gtm.comptes.presentation;

import com.gtm.comptes.metier.Compte;
import com.gtm.comptes.metier.CompteEparge;
import com.gtm.comptes.metier.ComptePayant;
import com.gtm.comptes.metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Compte c = new Compte();
		c.setCode(451578);
		c.setSolde(20000);
		System.out.println(c);
		c.retirer(15000);
		System.out.println(c);
		//
		Compte cs = new CompteSimple(800);
		cs.setCode(451580);
		cs.setSolde(1000);
		cs.retirer(1800);
		System.out.println(cs);
		//
		Compte ce = new CompteEparge(0.01f);
		ce.setCode(451595);
		ce.setSolde(5000);
		ce.calculinterets();
		System.out.println(ce);
		//
		Compte cp = new ComptePayant();
		cp.setCode(451599);
		cp.setSolde(2000);
		cp.verser(500);
		System.out.println(cp);
		//
		cp.setCode(451599);
		cp.setSolde(2000);
		cp.retirer(3000);
		System.out.println(cp);
		
		
	
	}


}

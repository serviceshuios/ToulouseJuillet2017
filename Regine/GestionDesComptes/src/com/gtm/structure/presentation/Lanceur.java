package com.gtm.structure.presentation;

import java.util.Scanner;

import com.gtm.strucrure.metier.Compte;
import com.gtm.strucrure.metier.CompteEpargne;
import com.gtm.strucrure.metier.ComptePayant;
import com.gtm.strucrure.metier.CompteSimple;


public class Lanceur {
	
	public static void main(String[] args) {
	
	Compte c = new Compte();
	c.setCode(1212);
	c.setSolde(2000);
	
	
	c.verser(200);
	c.retirer(300);
	
	CompteSimple cc = new CompteSimple();
	cc.setSolde(500);
	cc.verser(500);
	cc.setDecouvert(500);
	cc.retirer(2500);
	
	CompteEpargne ce = new CompteEpargne();
	ce.setSolde(2000);
	ce.setTaux(2);
	ce.calculInterets();
	
	ComptePayant cp = new ComptePayant();
	cp.setSolde(1000);
	cp.verser(200);
	cp.retirer(300);
	
	System.out.println(cp);
	System.out.println("nombre de comptes =" + Compte.getNbComptes());
	
	// classe scanner 
	// Application entrer du code et solde au clavier
	
	System.out.print("DONNER LE NEMERO DE COMPTE");
	Scanner clavier = new Scanner(System.in);
	int numero = clavier.nextInt();
	System.out.print("DONNER LE SOLDE DU COMPTE");
	float solde = clavier.nextFloat();
	Compte c1 = new Compte();
	c1.setCode(numero);
	c1.setSolde(solde);
	System.out.println(c1);
	clavier.close();
	
	
}

}

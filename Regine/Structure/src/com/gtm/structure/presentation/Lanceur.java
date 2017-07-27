package com.gtm.structure.presentation;

import com.gtm.structure.metier.Employe;
import com.gtm.structure.metier.Employeur;
import com.gtm.structure.metier.Personne;
import com.gtm.structure.metier.Voiture;
import com.gtm.structure.service.PersonneService;

/**
 * Programme principal
 * @author sin
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p = new Personne("TOTO","Titi",25);
		p.setNom("TOTO");
		p.setPrenom("Titi");
		p.setAge(25);
		
		PersonneService ps = new PersonneService();
		ps.ajouterPersonne(p);
		//ps.lirePersonne(p);
		
		System.out.println(ps.lirePersonne(p));
		
		ps.supprimerPersonne(p);
		System.out.println(ps.modifierPersonne(p, "nom modifie", "prenom modifie"));
		
		Employe e = new Employe("Durant","paul",25,8000.00);
		e.setNom("Durant");
		e.setPrenom("paul");
		e.setAge(25);
		e.setSalaire(8000.00);
		System.out.println(e);
		
		Employeur z = new Employeur ("Dupont", "Gerard", 35, 4000.00);
		z.setNom("Dupont");
		z.setPrenom("Gerard");
		z.setAge(35);
		z.setDividende(40000.00);
		System.out.println(z);
		
		
		e.methode9();
		e.afficheSalaire();
		z.methode10();
		z.afficheDividende();
		
		Voiture v = new Voiture();
		v.setCouleur("noir");
		v.setMarque("BMW");
		
		
	}

	
	
}

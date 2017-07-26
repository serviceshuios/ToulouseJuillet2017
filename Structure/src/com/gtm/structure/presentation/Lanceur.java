package com.gtm.structure.presentation;

import com.gtm.structure.metier.Employe;
import com.gtm.structure.metier.Employeur;
import com.gtm.structure.metier.Personne;
import com.gtm.structure.service.PersonneService;
/**
 * Programme principal
 * @author eddy
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p = new Personne("TOTO", "TITI", 25);
		/*p.setNom("TOTO");
		p.setPrenom("TITI");
		p.setAge(25);*/
		PersonneService ps = new PersonneService();
		ps.ajouterPersonne(p);
		
		System.out.println(ps.lirePersonne(p));
		
		ps.supprimerPersonne(p);
		
		System.out.println(ps.modifierPersonne(p, "NOM MODIFIE", "PRENOM MODIFIE"));
		
		Employe e = new Employe("Durant", "paul", 25, 8000.00);
		/*e.setNom("Durant");
		e.setPrenom("paul");
		e.setAge(25);
		e.setSalaire(8000.00);*/
		System.out.println(e);
		
		
		Employeur ee = new Employeur("Durant", "Gerard", 35, 40000.00);
		/*ee.setNom("Dupont");
		ee.setPrenom("Gerard");
		ee.setAge(35);
		ee.setDividende(40000.00);*/
		System.out.println(ee);
		
		System.out.println("nombre de personnes ="+ Personne.getNbPersonnes());
	}

}

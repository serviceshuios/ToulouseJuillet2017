package com.gtm.structure.service;

import com.gtm.structure.dao.PersonneJDBC;
import com.gtm.structure.metier.Personne;
/**
 * Classe de service
 * @author eddy
 *
 */
public class PersonneService {

	//d�claration et initialisation de la variable de la couche DAO
	private PersonneJDBC personneJDBC = new PersonneJDBC();
	
	// gestion de la demande de cr�ation d'une personne
	public void ajouterPersonne(Personne p)
	{
		personneJDBC.ajouterPersonne(p);
	}
	public void supprimerPersonne(Personne p) 
	{
		personneJDBC.supprimerPersonne(p);
	}
	public Personne lirePersonne(Personne p)
	{
		return personneJDBC.lirePersonne(p);
	}
	public Personne modifierPersonne(Personne p,String lenom,String leprenom) {
		return personneJDBC.modifierPersonne(p, lenom, leprenom);
	}
}

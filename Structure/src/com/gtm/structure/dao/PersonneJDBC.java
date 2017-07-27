package com.gtm.structure.dao;

import com.gtm.structure.metier.Personne;
/**
 * Classe qui permet d'interroger la base de donn�es
 * @author eddy
 */
public class PersonneJDBC {
	/**
	 * M�thode d'ajout d'une personne
	 * @param p personne � ajouter en base de donn�es
	 */
	public void ajouterPersonne(Personne p)
	{
		System.out.println("J'ajoute la personne "+p+" en base de donn�es");
	}
	/**
	 * M�thode de r�cup�ration d'une personne en BDD
	 * @param p personne � r�cup�rer
	 * @return personne trouv�e en BDD
	 */
	public Personne lirePersonne(Personne p)
	{
		return p;
	}
	/**
	 * M�thode de suppression d'une personne en BDD
	 * @param p personne � supprimer de la BDD
	 */
	public void supprimerPersonne(Personne p) 
	{
		System.out.println(p+ " supprim�e");
	}
	/**
	 * M�thode de modification du nom et du prenom d'une personne
	 * @param p personne � modifier
	 * @param lenom le nouveau nom de la personne
	 * @param leprenom le nouveau nom de la personne
	 * @return personne apr�s mise � jour
	 */
	public Personne modifierPersonne(Personne p,String lenom,String leprenom) {
		p.setNom(lenom);
		p.setPrenom(leprenom);
		return p;
	}
}

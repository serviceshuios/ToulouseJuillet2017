package com.gtm.structure.dao;



import com.gtm.structure.metier.Personne;

/**
 * Class qui permet d'interroger la base de don�es
 * @author sin
 * 
 */

public class PersonneJDBC {
	
	/**
	 * M�thode d'ajout d'une personne
	 * @param p personne � ajouter en base de don�es
	 */
	public void ajouterPersonne(Personne p) {
		
		System.out.println("J'ajoute la personne "+p+" en basse de donn�es");
		
	}

	/*public void lirePersonne(Personne p) {
		
		System.out.println("Je lis personne " +p);
	}*/
	
	/**
	 * M�thode de r�cup�ration d'une personne en BDD 
	 * @param p personne � r�cup�rer
	 * @return personne trouv� en BDD
	 */
	
	public Personne lirePersonne(Personne p) {
		
		return p;
	}
	
	/**
	 * M�thode de suppression d'une personne en BDD
	 * @param p personne � suppremer de la BDD
	 */
	
	public void supprimerPersonne(Personne p) {
		
		System.out.println(p+ " supprim�e");
	}
	
	/**
	 * M�thode de modification du nom et du prenom d'une personne
	 * @param p personne � modifier
	 * @param lenom le nouveau nom de la personne
	 * @param leprenom le noueveau prenom de la personne
	 * @return personne ap�s mise � jour
	 */
	
	public Personne modifierPersonne(Personne p, String lenom, String leprenom) {
		
		//System.out.println("Je modifie personne " +p);
		
		p.setNom(lenom);
		p.setPrenom(leprenom);
		return p;
	}
}

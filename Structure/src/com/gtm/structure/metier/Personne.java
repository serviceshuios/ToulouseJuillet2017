package com.gtm.structure.metier;

import java.util.Collection;

/**
 * Structure de la classe personne
 * @author Eddy
 */
public  class Personne {
	/**
	 * nom de la personne
	 */
	protected String nom;
	protected String prenom;
	protected int age;
	protected  Collection<Voiture> mesVoitures;
	protected static int nbPersonnes;
	protected final int nbJambes=2;
	/**
	 * méthode de récupération du nom de la personne
	 * @return retourne le  nom de la personne
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Collection<Voiture> getMesVoitures() {
		return mesVoitures;
	}
	public void setMesVoitures(Collection<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}
	@Override
	public  String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		nbPersonnes++;
		//impossible de modifier nbJambes car attribut final
		/* nbJambes = 4;*/
	}
	/*public Personne() {
		super();
		nbPersonnes++;
	}*/
	public static int getNbPersonnes() {
		return nbPersonnes;
	}
	public static void setNbPersonnes(int nbPersonnes) {
		Personne.nbPersonnes = nbPersonnes;
	}

	public final void methode()
	{
		System.out.println("je ne peux pas être redéfinit");
	}
}

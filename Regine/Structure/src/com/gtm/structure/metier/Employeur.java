package com.gtm.structure.metier;

/**
 * Classe de structure des employeurs
 * @author sin
 *
 */
public class Employeur extends Personne 
{
	public Employeur(String nom, String prenom, int age, Double dividende) {
		super(nom, prenom, age);
		this.dividende = dividende;
		// TODO Auto-generated constructor stub
	}

	private Double dividende;

	public Double getDividende() {
		return dividende;
	}

	public void setDividende(Double dividende) {
		this.dividende = dividende;
	}

	@Override
	public String toString() {
		return "Employeur [dividende=" + dividende + ", toString()=" + super.toString() + "]";
	}
	
	public void methode10() {
		System.out.println("Je suis dans la classe Employeur");
	}

	public void afficheDividende() 
	{
		System.out.println("Le dividende de l'employeur est "+ dividende);
	}
}
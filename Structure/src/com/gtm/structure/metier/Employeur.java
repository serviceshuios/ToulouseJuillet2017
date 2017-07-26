package com.gtm.structure.metier;

public class Employeur extends Personne {
	private Double dividende;

	public Employeur(String nom, String prenom, int age, Double dividende) {
		super(nom, prenom, age);
		this.dividende = dividende;
	}

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
	
	public void afficheDividende()
	{
		System.out.println(dividende);
		
	}
}

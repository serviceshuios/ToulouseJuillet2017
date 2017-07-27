package com.gtm.strucrure.metier;

public class CompteEpargne extends Compte {
	
	
	private float taux;
	
	// Ajouter getters and setters

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	// Calcul des interets
	
	public void calculInterets()
	
	{
		solde = solde + solde*taux/100;
		System.out.println("votre nouveau solde est:  " + solde);
	}

	
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}

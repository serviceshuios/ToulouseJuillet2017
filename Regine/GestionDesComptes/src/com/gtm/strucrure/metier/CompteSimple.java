package com.gtm.strucrure.metier;


public class CompteSimple extends Compte {
	
	private float decouvert;

// Ajout generation des getters setters
	
	public float getDecouvert() {
		
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	public void retirer (float mt)
	
	{
		
		System.out.println("quel montant voulez-vous verser?");
		
		
	//	decouvert = solde;
		
		if (mt > solde+decouvert)
		{
			System.out.println("IMPOSSIBLE DE RETIRER LA SOMME DEMANDEE");
			
			return;
		}
		else
		{
			solde = solde -mt;
			System.out.println("votre solde est crediteur de" +solde);
		}
	}
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}

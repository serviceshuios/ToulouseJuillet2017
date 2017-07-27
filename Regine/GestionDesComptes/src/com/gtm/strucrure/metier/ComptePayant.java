package com.gtm.strucrure.metier;

public class ComptePayant extends Compte {
	
// verser un maontant avec 1% de frais)
	
	public void verser(float mt)
	{
		 solde  = solde + mt - mt/100;
		 
		System.out.println("Votre nouveau solde est de :" +solde);
		 
	}

	// verser un maontant avec 1% de frais)
	
		public void retirer(float mt)
		{
			 solde  = solde - mt - mt/100;
			 
			System.out.println("Votre nouveau solde est de :" +solde);
			 
		}
	
	@Override
	public String toString() {
		return "ComptePayant [toString()=" + super.toString() + "]";
	}

	
}



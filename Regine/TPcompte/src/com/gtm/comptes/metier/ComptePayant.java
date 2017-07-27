package com.gtm.comptes.metier;

public class ComptePayant extends Compte {
	@Override
	public String toString() {
		return "ComptePayant [toString()=" + super.toString() + "]";
	}
	public void verser(float mt) {
		if (mt < 0) 
		{
			System.out.println("attention montant negatif");
		} else 

		solde = solde + mt*(1-0.01f);
	}
	public void retirer(float mt) {
		if (mt < 0) 
		{
			System.out.println("attention montant negatif");
		} else 
			if (mt > solde) 
			{
				System.out.println("attention solde negative");
			} else 
		solde = solde - mt*(1+0.01f);
	}
}

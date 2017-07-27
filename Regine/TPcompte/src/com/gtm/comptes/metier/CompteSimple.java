package com.gtm.comptes.metier;

public class CompteSimple extends Compte  
{
	private float decouvert;
	// ********************************************
	// ********************************************
	// ********************************************
	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}
	// ********************************************
	// ********************************************
	// *******************************************

	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}

	public void retirer(float mt) {
		if (mt < 0) 
		{
			System.out.println("attention montant negatif");
		} else 
		{
			if (mt > solde+decouvert) 
			{
				System.out.println("operation impossible");
			} else 
			{
				this.solde = this.solde - mt;
			}
		}
	}
}


package com.gtm.comptes.metier;

public class CompteEparge extends Compte {
	private float taux;
	// ********************************************
	// ********************************************
	// ********************************************

	public CompteEparge(float taux) {
		super();
		this.taux = taux;
	}
	// ********************************************
	// ********************************************
	// *******************************************

	@Override
	public String toString() {
		return "CompteEparge [taux=" + taux + ", getCode()=" + getCode() + ", getSolde()=" + getSolde()
				+ ", toString()=" + super.toString() + "]";
	}
		
	public void calculinterets() {
		solde = solde*(1+taux);
		
	}
	}
	

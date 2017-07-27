package com.gtm.comptes.metier;
/**
 * classe de structure Compte
 * @author sin
 *
 */
public class Compte {
	/**
	 * numero de compte
	 * montant restant du compte
	 * taux d'intêret du compte d'épargne
	 */
	private int code;
	protected float solde;
	private float taux;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
/**
 * methode du virement
 * @param mt montant à verser
 */
	public void verser(float mt) {
		if (mt < 0) {
			System.out.println("attention montant négatif");
		} else {
			/* this.solde +=mt */
			this.solde = this.solde + mt;
		}
	}

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
/**
 * methode de retrait
 * @param mt montant à retirer
 */
	public void retirer(float mt) {
		if (mt < 0) {
			System.out.println("attention montant negatif");
		} else {

			if (mt > solde) {
				System.out.println("operation pas possible");
			} else {
				this.solde = this.solde - mt;
			}
		}
	}
/**
 * methode du calcul des intêrets
 */
	public void calculinterets() {
		solde = solde*(1+taux);
	}
		// TODO Auto-generated method stub

public Compte() {
	super();
}
		
	}
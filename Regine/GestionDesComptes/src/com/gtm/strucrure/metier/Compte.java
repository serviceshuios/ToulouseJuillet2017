package com.gtm.strucrure.metier;

/**
 * 
 * @author Adminl
 *
 */
public class Compte {
	private int code;
	protected float solde;
	private static int nbComptes;
	
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

	
	// initialisation 
	//private Compte compte = new Compte();
	//compte.setCode(00.00);
	//compte.setSolde(0.00);
	
	// contructeur
	
	//public Compte(int code, float solde) {
	//	super();
	//	this.code = code;
	//	this.solde = solde;
	
	public static int getNbComptes() {
		return nbComptes;
	}
	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}
	public Compte() {
	super();
	nbComptes++;
	}
	
	// ************************************
	// Methode pour verser de l'argent
	// ************************************
	
	public void verser(float mt)
	
	{
		System.out.println("Quel montant voulez-vous verser?");
		
		if (mt<0) {
			System.out.println("attention montant negatif");
		}
		else
		{
		solde = solde + mt;
		System.out.println("vous avez verser " +mt);
		}
	}
	
	
	
	// ************************************
	// Methode pour retirer de l'argent
	// ************************************ 
	public void retirer(float mt)	
	{
		if(solde<0) {
			System.out.println("Votre compte est à découvert");
			return;
		}
		else{
			solde = solde - mt;
		}
	}
 
	
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde +  "]";
		
	
	}


}

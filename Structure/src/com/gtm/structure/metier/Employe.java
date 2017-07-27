package com.gtm.structure.metier;

/**
 * Classe de structure des employés
 * @author eddy
 *
 */
public class Employe extends Personne {
	private Double salaire;

	
	public Employe(String nom, String prenom, int age, Double salaire) {
		super(nom, prenom, age);
		this.salaire = salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	public void methode9()
	{
		System.out.println("JE SUIS DANS LA CLASSE EMPLOYE");
	}
	
	public void afficheSalaire()
	{
		System.out.println(salaire);
		//impossible de modifier nbJambes car attribut final
		/* nbJambes = 4;*/
	}
	//  essai de redéfinition d'une méthode final
	/*public final void methode()
	{
		System.out.println("essai de redefinition");
	}*/
}

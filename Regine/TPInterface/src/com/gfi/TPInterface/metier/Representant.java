package com.gfi.TPInterface.metier;

import com.gtm.TPInterfaceconstante.Constants;

public class Representant extends Salesman {

	public Representant(String lastName, String firstName, int age, String hireDate,int turnover) {
		super(lastName, firstName, age, hireDate,turnover);
		

	}


	// calcul salaire à partir d'un pourcentage fixe 20% du CA ajoutée d'une prime 800 euros
	
	public float calculateSalary(){
		
		return this.calculateTurnoverPart() + Constants.REPRESANT_PRIME;
		

	}
}

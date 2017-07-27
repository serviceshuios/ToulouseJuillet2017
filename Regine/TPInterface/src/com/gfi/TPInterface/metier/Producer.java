package com.gfi.TPInterface.metier;

public class Producer  extends  Employees{
	
	public Producer(String lastName, String firstName, int age, String entranceDate) {
		super(lastName, firstName, age, entranceDate);
		// TODO Auto-generated constructor stub
	}

	int nbunites  ;
	
	public void calculSalaire(int nbunites) {
		
		float salaire = 5*nbunites;
		
	}

}

package com.gfi.TPInterface.metier;

public class Wharehouseman extends Employees {
	

	public Wharehouseman(String lastName, String firstName, int age, String entranceDate) {
		super(lastName, firstName, age, entranceDate);
		// TODO Auto-generated constructor stub
	}
 int nbheures;
 
	public void calculSalaire(int nbheures) {
		
		float salaries = nbheures*65 ;
		
	}
	
}

package com.gfi.TPInterface.metier;

import com.gtm.TPInterfaceconstante.Constants;

public class Salesman extends Employees {

	// annotation sert à indiquer que l'on surcharge la methode calculate salaries qui est aussi ailleurs
	
	private float turnover;
	
	public Salesman(String lastName, String firstName, int age, String hireDate, int turnover) {
		super(lastName, firstName, age, hireDate);
		// TODO Auto-generated constructor stub
	}
//  calcul salaire à partir d'un pourcentage fixe 20% du CA ajoutée d'une prime 400 euros
	
		

	public float getTurnover() {
		return turnover;
	}

	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	
	protected float calculateTurnoverPart()
	{
		return this.turnover * Constants.TURNOVER_PART;
	}
   public float calculateSalary() {
		
		return this.calculateTurnoverPart() + Constants.SALESMAN_PRIME;
		
	}
		
	}



package com.gfi.TPInterface.metier;

import java.util.ArrayList;
import java.util.Collection;


 public class Staff {
	
	// collection list set map (comme un dictionnaire)

	//private final Collection<Employees> employees = new ArrayList<>();
	
	private final Collection<Employees> employees;
	
	public Staff() {
		
		this.employees = new ArrayList<>();
	}
	
	public void add(final Employees employee) {
		this.employees.add(employee);
	}
	public void displaySalaries() {
		
		System.out.println("Liste des salaires: ");
	// les : servent à parcourir une collection dans la boucle for
		
	for (final Employees employee : this.employees) {
		
		System.out.println("\t- L'employé " + employee.getFirstName()+ " " + employee.getLastName() + " a un salaire de " + employee.calculateSalary() + "euros");
			
	}
		
	}
	
	public void displayAverageSalary() {
		
		long total = 0;
		
		for (final Employees employee : this.employees) {
			
			// total+= égal à total = total + 
			
			total+= employee.calculateSalary();
		}
		
		System.out.println("le salaire moyen est de  : " + (total / employees.size()) + "euros");
	}
}

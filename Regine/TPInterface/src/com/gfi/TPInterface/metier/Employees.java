package com.gfi.TPInterface.metier;

public abstract class Employees {
	
	private String lastName;
	private String firstName;
	private int age;
	private String hireDate;
	
	//protected float salaire;
	
	// Declaration getters et setters
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate=hireDate;
		
		//declaration Constructeurs avec arguments
	}
	public Employees(String lastName, String firstName, int age, String hireDate) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employees [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", entranceDate="
				+ hireDate + "]";
	}
	
	// force les classes enfants à employer la methode calculate //la classe et la methode doivent etre absract
	
	public abstract float calculateSalary();
		
	
	

}

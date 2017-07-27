package com.gfi.TPInterface.presentation;

import com.gfi.TPInterface.metier.Representant;
import com.gfi.TPInterface.metier.Salesman;
import com.gfi.TPInterface.metier.Staff;

public class Lanceur {
	
	
	public static void main(String[] args) {
		
		final Staff myEmployees = new Staff();
		myEmployees.add(new Salesman("Pierre","Business", 45, "1995", 30000));
		myEmployees.add(new Representant("Leon","Ventout", 25, "2001", 20000));
		
		// myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
	   // myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
	   // myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
	   // myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));

		
		
	}

}

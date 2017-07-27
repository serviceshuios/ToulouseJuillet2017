package com.gtm.TestsJunit.tests;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.gtm.TestsUnit.metier.Operation;


public class OperationTests {

	@Test
	public void testAddition() {
		int resultat = Operation.addition(10,12);
		Assert.assertNotEquals("ERREUR ADDITION", 22, resultat, 0);
	}
   // @Ignore
	@Test
	public void testSoustraction() {
    	int resultat = Operation.soustraction(40,30);
    	Assert.assertNotEquals("ERREUR SOUSTRACTION", 10, resultat, 0);

	//	fail("Not yet implemented");
	}
 
	@Test
	public void testMultiplication() {
    	int resultat = Operation.multiplication(2,3);
    	Assert.assertEquals("ERREUR MULTIPLICATION", 6, resultat, 0);
	//	fail("Not yet implemented");
	}
	
	@Test
	public void testDivision() {
		
		int resultat = Operation.division(6,2);
		Assert.assertEquals("ERREUR DIVISION",3, resultat, 0);
		
//		fail("Not yet implemented");
	
	}
	

}

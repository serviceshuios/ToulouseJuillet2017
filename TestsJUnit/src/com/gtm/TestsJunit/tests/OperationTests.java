package com.gtm.TestsJunit.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.gtm.TestsJunit.metier.Operation;

public class OperationTests {

	@Test
	public void testAddition() {
		int resultat = Operation.addition(10, 12);
		Assert.assertEquals("ERREUR ADDITION", 22, resultat, 0);
	}
	
	@Test
	public void testSoustraction() {
		int resultat = Operation.soustraction(10, 12);
		Assert.assertEquals("ERREUR SOUSTRACTION", -2, resultat, 0);
	}
	@Ignore
	@Test
	public void testMultiplication() {
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void testDivision() {
		fail("Not yet implemented");
	}

}

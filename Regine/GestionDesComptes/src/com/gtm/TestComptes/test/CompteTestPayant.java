package com.gtm.TestComptes.test;

import org.junit.Assert;

//import static org.junit.Assert.*;

import org.junit.Test;

import com.gtm.strucrure.metier.ComptePayant;

public class CompteTestPayant {

	@Test
	public void testVerser() {
		
		ComptePayant cp = new ComptePayant();
		cp.setSolde(1000);
		cp.verser(100);
		Assert.assertEquals("MAUVAIS CALCUL DU SOLDE DEDUIT DES FRAIS", 1099, cp.getSolde(), 0);
		
	//	fail("Not yet implemented");
	}

	@Test
	public void testRetirer() {
		
		ComptePayant cp = new ComptePayant();
		cp.setSolde(1000);
		cp.retirer(100);
		Assert.assertEquals("MAUVAIS CALCUL DU SOLDE DEDUIT DES FRAIS", 899, cp.getSolde(), 0);
		
	//	fail("Not yet implemented");
	}

}

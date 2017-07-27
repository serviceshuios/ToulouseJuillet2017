package com.gtm.TestComptes.test;


import org.junit.Assert;
import org.junit.Test;

import com.gtm.strucrure.metier.Compte;

public class CompteTests {

	
	@Test
	public void testVerser() {
		
		Compte c = new Compte();
		c.setSolde(2000);
		c.verser(200);
		Assert.assertEquals("ERREUR DANS VERSER", 2200, c.getSolde(), 0);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testRetirer() {
		
		Compte c = new Compte();
		c.setSolde(2000);
		c.retirer(200);
		Assert.assertEquals("ERREUR DANS RETRAIT", 1800, c.getSolde(), 0);
		
		
		//fail("Not yet implemented");
	}

}

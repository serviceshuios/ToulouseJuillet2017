package com.gtm.TestComptes.test;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.strucrure.metier.CompteSimple;

public class CompteSimpleTest {

	@Test
	public void testRetirer() {
		
		CompteSimple cs = new CompteSimple();
		cs.setSolde(2000);
		cs.retirer(1000);
		cs.setDecouvert(300);
		Assert.assertEquals("ERREUR DANS RETRAIT", 1000, cs.getSolde(), 0);
		
		
	//	fail("Not yet implemented");
	}

	
}

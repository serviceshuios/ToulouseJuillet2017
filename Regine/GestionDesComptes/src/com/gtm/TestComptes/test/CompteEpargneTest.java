package com.gtm.TestComptes.test;

import org.junit.Assert;

//import static org.junit.Assert.*;

import org.junit.Test;

import com.gtm.strucrure.metier.CompteEpargne;

public class CompteEpargneTest {

	@Test
	public void testCalculInterets() {
		
		CompteEpargne ce = new CompteEpargne();
		
		ce.setSolde(1000);
		ce.setTaux(2);
		ce.calculInterets();
		Assert.assertEquals("MAUVAIS CALCUL DE TAUX D'INTERET", 1020, ce.getSolde(), 0);
		
//		fail("Not yet implemented");
	}

		
	}



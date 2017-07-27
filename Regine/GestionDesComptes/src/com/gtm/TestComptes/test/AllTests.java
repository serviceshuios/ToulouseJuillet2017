package com.gtm.TestComptes.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompteEpargneTest.class, CompteSimpleTest.class, CompteTestPayant.class, CompteTests.class })
public class AllTests {

}

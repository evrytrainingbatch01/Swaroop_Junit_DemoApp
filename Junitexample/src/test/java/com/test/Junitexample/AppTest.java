package com.test.Junitexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {  
	  
	@Test  
    public void testsquareroot()
    {
      assertEquals(9, App.squareroot(new int[] {81,25}));
    }

	
}  


package com.ayush.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalTest {

	@Test
	public void addTest() {
	        JenkinsCalc myCalc = new JenkinsCalc();
	        assertEquals(10, (myCalc.addNumbers(5,5)));
	}
	@Test
	public void subTest() {
	         JenkinsCalc mycalc= new JenkinsCalc();
	         assertEquals(5,(mycalc.subNumbers(10, 5)));
	}

}

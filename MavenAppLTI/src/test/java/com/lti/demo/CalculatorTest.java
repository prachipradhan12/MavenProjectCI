package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		int res=new Calculator().add(10,20);
		assertEquals(30, res);
		
	}
	@Test
	public void test2() {
		int res=new Calculator().sub(20,10);
		assertEquals(10, res);
		
	}
	@Test
	public void test3() {
		int res=new Calculator().mul(20,10);
		assertEquals(200, res);
		
	}
	@Test
	public void test4() {
		int res=new Calculator().divide(20,10);
		assertEquals(2, res);
		
	}

}

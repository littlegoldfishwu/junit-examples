package de.mowu.tutorial.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import de.mowu.tutorial.testdriven.MyClass;

public class MyTest {

	@Test
	public void multiplyTest(){
		MyClass myClass = new MyClass();

		assertEquals("10 x 0 must be 0", 0, myClass.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, myClass.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, myClass.multiply(0, 0));
	}
	
}

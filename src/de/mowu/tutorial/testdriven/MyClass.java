package de.mowu.tutorial.testdriven;

public class MyClass {

	public int multiply(int x, int y){
		if(x > 999){
			throw new IllegalArgumentException("x should be less than 1000");
		}
		return x * y;
	}
}

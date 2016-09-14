package de.mowu.tutorial.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * This class can be executed like any other java program on the command line.
 * You only need to add the junit library jar file to the classpath.
 */
public class MyTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyTest.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
	}

}

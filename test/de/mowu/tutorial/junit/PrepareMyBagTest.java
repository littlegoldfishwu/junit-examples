package de.mowu.tutorial.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import de.mowu.tutorial.testdriven.FirstDayAtSchool;

public class PrepareMyBagTest {
	FirstDayAtSchool tester = new FirstDayAtSchool();
	String[] bag1 = new String[]{"Books", "Notebooks", "Pens"};

	@Test
	public void testPrepareMyBag() {
		assertArrayEquals(bag1, tester.prepareMyBag());
	}
}

package de.mowu.tutorial.junit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import de.mowu.tutorial.testdriven.FirstDayAtSchool;

public class FirstDayAtSchoolTest {
	FirstDayAtSchool tester = new FirstDayAtSchool();
	String[] bag1 = new String[]{"Books", "Notebooks", "Pens"};
	String[] bag2 = new String[]{"Books", "Notebooks", "Pens", "Pencils"};

	@Test
	public void testPrepareMyBag() {
		assertArrayEquals(bag1, tester.prepareMyBag());
	}
	
	@Ignore
	@Test
	public void testAddPencils(){
		assertArrayEquals(bag2, tester.addPencils());
	}

}

package de.mowu.tutorial.junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import de.mowu.tutorial.testdriven.FirstDayAtSchool;

public class AddPencilsTest {

	FirstDayAtSchool tester = new FirstDayAtSchool();
	String[] bag2 = new String[]{"Books", "Notebooks", "Pens", "Pencils"};

	@Test
	public void testAddPencils(){
		assertArrayEquals(bag2, tester.addPencils());
	}

}

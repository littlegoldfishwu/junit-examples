package de.mowu.tutorial.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//with the @Suite.SuiteClasses annotation you can define which test classes will be included in the execution
@SuiteClasses({ AddPencilsTest.class, PrepareMyBagTest.class })
public class SuitTest {

}

package Steps;

import com.ozbargain.qa.base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public static void setup() {
		TestBase.initialization();
		
	}
	
	@After
	public static void tearDown() {
		
		TestBase.tearDown();
		
	}
	
}

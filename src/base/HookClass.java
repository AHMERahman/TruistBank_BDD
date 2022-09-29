package base;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {

	Base base;
	@Before
	public void beforHook() {
		base = new Base();
		base.setUp("chrome");
	}
	
	@After
	public void afterHook() {
		base.tearDown();
	}
	
}

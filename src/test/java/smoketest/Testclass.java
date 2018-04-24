package smoketest;

import org.testng.annotations.Test;

import smoke.pageclass;

public class Testclass {
	@Test
	public void testone() throws Exception 
	{
		pageclass  ttt = new pageclass();
		ttt.testone();
	
		ttt.logout();
	}

}

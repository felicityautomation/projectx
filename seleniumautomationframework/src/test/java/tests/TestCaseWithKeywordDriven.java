package tests;

import org.testng.annotations.Test;

import utilities.DriverScript;

public class TestCaseWithKeywordDriven {
	
	@Test
	public void fbTest() throws Exception {
		DriverScript script=new DriverScript();
		script.runScript("testdata/MyTestData.xlsx", "Module1", "TC1");
	}
	
	@Test
	public void googleTest() throws Exception {
		DriverScript script=new DriverScript();
		script.runScript("testdata/MyTestData.xlsx", "Module1", "TC2");
	}
	
	@Test
	public void flipkartTest() throws Exception {
		DriverScript script=new DriverScript();
		script.runScript("testdata/MyTestData.xlsx", "Module1", "TC3");
	}

}

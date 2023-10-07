package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utilities.ExcelUtil;

public class LoginTestData {
	
	
	@DataProvider(name ="loginData")
	public Object[][] getLoginData() {
		
		Object[][] testData=null;
		try {
			testData=ExcelUtil.readDataFromExcelSheet("testdata/Credentials.xlsx","Login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//Added a new comment
		}
		return testData;
	}
	
	@DataProvider(name ="loginData1")
	public Object[][] getLoginData1() {
		Object[][] testData= {{"admin","Welcome1"},{"John","Jlkkjsdlf"}};
		return testData;
	}

}

package tests;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import utilities.LoggerUtil;

public class TestLogging {
	
	
	public static void main(String args[]) {
		Logger log=Logger.getLogger("TestLogging.main()");
//		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug message");
		log.info("Information message");
		log.warn("Warning message");
		log.error("Error occurred");
		log.fatal("Fatal error occurred");
		
		LoggerUtil.getLogger("mytest").debug("testing things");
		
	}

}

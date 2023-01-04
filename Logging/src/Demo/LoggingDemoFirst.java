package Demo;

import org.apache.logging.log4j.*;

public class LoggingDemoFirst {
	
	
	private static Logger logger = LogManager.getLogger(LoggingDemoFirst.class.getName());

	public static void main(String[] args)
	{
		
		logger.trace("This is trace");
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");
		


	}

}
 

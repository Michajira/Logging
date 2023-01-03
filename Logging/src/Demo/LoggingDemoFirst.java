package Demo;

import org.apache.logging.log4j.*;

public class LoggingDemoFirst {
	
	
	private static Logger demologger = LogManager.getLogger(LoggingDemoFirst.class.getName());

	public static void main(String[] args)
	{
		
		demologger.trace("This is trace");
		demologger.debug("This is debug");
		demologger.info("This is info");
		demologger.warn("This is warn");
		demologger.error("This is error");
		demologger.fatal("This is fatal");
		


	}

}
 
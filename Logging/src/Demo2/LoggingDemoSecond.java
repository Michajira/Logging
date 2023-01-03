package Demo2;

import org.apache.logging.log4j.*;

public class LoggingDemoSecond {
	
	
	private static Logger demologger = LogManager.getLogger(LoggingDemoSecond.class.getName());

	public static void main(String[] args) {
		
		demologger.info("This is info");
		demologger.error("This is error");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
		
		demologger.info("This is info");
		demologger.error("This is error");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
		

	}

}
 
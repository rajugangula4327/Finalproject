package utlities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {
	
	public static Logger getLogger(String name) {
		Logger logger=Logger.getLogger(name);
		PropertyConfigurator.configure("log4j.properties");
		return logger;
		
	}

}

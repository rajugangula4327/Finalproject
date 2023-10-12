package utlities;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Browserutilties {

	public static RemoteWebDriver getdriver() {
		String browser="chrome";
		RemoteWebDriver driver;
		Logger logger=Logging.getLogger(Browserutilties.class.getName());
			
			if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				logger.debug("The Google Chrome Browser is called");
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
				logger.debug("The Firefox Browser is called");
			}
			else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
				logger.debug("The Edge Browser is called");
			}
			else {
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			logger.debug("The Browser window Maximzed");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			logger.debug("The Implicit Wait and Page loading timeout has been mentioned");
		return driver;
	}
}

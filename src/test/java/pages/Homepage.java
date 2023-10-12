package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Homepage {

	RemoteWebDriver Homedriver;
	public Homepage(RemoteWebDriver driver) {
		this.Homedriver=driver;
	}
	 By Userinfo=By.xpath("//a[@id='nameofuser']");
	
	 public boolean isuserinfoDisplayed() {
		 return Homedriver.findElement(Userinfo).isDisplayed();
	 }
	 
}

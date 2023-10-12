package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignupPage {
	RemoteWebDriver sdriver;
	public SignupPage(RemoteWebDriver driver) {
		this.sdriver=driver;
	}
	By SignupWindow=By.cssSelector("#signInModal > div > div > div.modal-header");
	By InputUsername=By.id("sign-username");
	 
	 public boolean isSignupWindowDisplyed() {
		 return sdriver.findElement(SignupWindow).isDisplayed();
	 }
	
	 public void UsernameisEditable(String Username) {
		sdriver.findElement(InputUsername).sendKeys(Username);
	 }
	 public boolean  usernameisDisplyed() {
		return sdriver.findElement(InputUsername).isDisplayed();
	 }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Loginpage {
 RemoteWebDriver logindriver;
 
 public Loginpage(RemoteWebDriver driver) {
	this.logindriver=driver;
 }
 By Login=By.xpath("//a[text()='Log in']");
 By InputUsername=By.xpath("//input[@id='loginusername']");
 By InputPassword=By.xpath("//input[@id='loginpassword']");
 By loginButton=By.xpath("//button[text()='Log in']");
 By buttonsignup=By.id("signin2");
 
 public void clicklogin() {
	 logindriver.findElement(Login).click();
 }
 public void logincredentials(String Username,String Password) {
	 logindriver.findElement(InputUsername).sendKeys(Username);
	 logindriver.findElement(InputPassword).sendKeys(Password);
 }
 public void clickloginbutton() {
	 logindriver.findElement(loginButton).click();
 }
 public void clickOnsignupButton() {
	 logindriver.findElement(buttonsignup).click();
 }
 
}

package step.difinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.Loginpage;
import pages.SignupPage;
import utlities.Browserutilties;
import utlities.Logging;

public class Steps {
	RemoteWebDriver driver;
	Logger logger=Logging.getLogger(Steps.class.getName());
	
	@Given("user open the browser")
	public void user_open_the_browser() {
	    driver=Browserutilties.getdriver();
	}

	@When("user navigates to the URL")
	public void user_navigates_to_the_url() {
	    driver.get("https://www.demoblaze.com/index.html");
	}
	
	@When("get URL & title of the Wabpage")
	public void get_url_title_of_the_wabpage() {
		String title=driver.getTitle(); //To get the title of the page
		logger.debug("The title of the page is := "+title);
		//System.out.println("The title of the page " +title);
		String url=driver.getCurrentUrl(); //To get the current url of the page
		logger.debug("The Current Url of the Page := "+url);
		//System.out.println("The Current Url of the Page " +url);
	}

	@When("clicks on login")
	public void clicks_on_login() {
	  Loginpage loginpage=new Loginpage(driver);
	  loginpage.clicklogin();
	}

	@When("user inputs valid {string} and {string}")
	public void user_inputs_valid_and(String Username, String Password) throws InterruptedException {
		Thread.sleep(2000);
	    Loginpage loginpage=new Loginpage(driver);
	    loginpage.logincredentials(Username, Password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.clickloginbutton();
	}
	@Then("the home page is displayed with welcome Username")
	public void the_home_page_is_displayed_with_welcome_username() throws InterruptedException {
		Thread.sleep(5000);
		Homepage homepage=new Homepage(driver);
		boolean flag=homepage.isuserinfoDisplayed();
		Assert.assertEquals(flag, true);
	}
	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.clickOnsignupButton();
	}

	@Then("signup dialog box should be displayed")
	public void signup_dialog_box_should_be_displayed() throws InterruptedException {
		Thread.sleep(5000);
	    SignupPage signuppage=new SignupPage(driver);
	    boolean flag= signuppage.isSignupWindowDisplyed();
	    Assert.assertEquals(flag, true);
	}
	
	@Then("user inputs valid {string}")
	public void user_inputs_valid(String Username) throws InterruptedException {
		Thread.sleep(5000);
		 SignupPage signuppage=new SignupPage(driver);
		 signuppage.UsernameisEditable(Username);
	}
	
	@Then("Name field has to be visible")
	public void name_field_has_to_be_visible() {
		 SignupPage signuppage=new SignupPage(driver);
		 boolean flag=signuppage.usernameisDisplyed();
		 Assert.assertEquals(flag, true);
	}
	
	@After()
	public void closeBrowser() {
	       driver.quit();
	   }
}

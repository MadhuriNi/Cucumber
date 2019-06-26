package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination {
	WebDriver driver;
	
	@Given("^User is on Bank Of America landing page$")
	public void user_is_on_net_banking_page()
	{
		//User is on bank of America Landing Page
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com/online-banking/mobile-and-online-banking-features/overview/");
		
		By signIn=By.xpath("//a[@id='signinOnlineBankingBtnOverview']");
		driver.findElement(signIn).click();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	}
	
	
	@When("^when user logs in with username and password$")
	public void user_logs_in_with_username_password()
	{
		
		By oid=By.xpath("//input[@id='oid']");
		driver.findElement(oid).sendKeys("madhuri5255");
		
		By pwd=By.cssSelector("input[type=password]");
		driver.findElement(pwd).sendKeys("jan2015@");
		
		By logIn=By.cssSelector("a[id='secure-signin-submit']");
		driver.findElement(logIn).submit();
		
		
	}
	
	@Then("^Account Summary Page appears$")
	public void accout_summary_page()
	{
		System.out.println("This is Account Summary Page");
	}

	
	@And("^All the transactions are displayed$")
	 public void all_the_transactions_are_displayed()
	{
      System.out.println("We can see all the transactions");
    }
	
	
}

package stepps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDef {
	
	public static WebDriver driver;
	
	
	//Cucumber Hooks
	//Before and After class
	
	@Before
	public void beforeSetup() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdhasan/eclipse-workspace/m.Cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
	}

	@Given("user in Facebook home page")
	public void facebook_homepage() {
		driver.get("https://www.facebook.com/");
		
	}
	@When("user click on create account tab")
	public void createAcctTab() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
	}
	
	@Then("user enters first name")
	public void user_enters_first_name(){
		WebElement Fname =  driver.findElement(By.name("firstname"));
    	Fname.sendKeys("Dave");
	}
	
	@And("user enters last name")
	public void user_enters_last_name() throws InterruptedException{
		WebElement Fname =  driver.findElement(By.name("lastname"));
	 	Fname.sendKeys("Maga");
	 
	}
	
	@After
	public void tearDown() {
		driver.quit();
		driver=null;
	}


}

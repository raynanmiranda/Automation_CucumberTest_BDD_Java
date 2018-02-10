package Tests;


import org.mockito.internal.matchers.Contains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.*;


public class StepRegistrationDescription {

	WebDriver driver = new ChromeDriver();
	
	//*
	//*
	//Scenario: Verify that user is able to register
	//*
	//*
	
	@Given("^User (?:goes to) (http.*)$")
	public void goToRegistrationPage(String page) throws Throwable {
		driver.manage().window().maximize();
		driver.get(page);
	    
	}

	@When("^the user fill in the given details on the form$")
	public void fillTheform(DataTable testData) throws Throwable {
		int numberListCheckBox = 0;
		
		Map<String,String> testDataAsMap = testData.asMap(String.class, String.class);
		
		driver.findElement(By.id("name_3_firstname")).sendKeys(testDataAsMap.get("FirstName"));
		driver.findElement(By.id("name_3_lastname")).sendKeys(testDataAsMap.get("LastName"));
		
		
		
		List<WebElement> elements = driver.findElements(By.className("checkbox_5"));		
		numberListCheckBox = elements.size();
		for(int i = 0;i <= numberListCheckBox;i++) {
			elements = driver.findElements(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]"));
			elements.get(i).click();
			
		}
		
		driver.findElement(By.id("phone_9")).sendKeys(testDataAsMap.get("PhoneNumber"));
		driver.findElement(By.id("username")).sendKeys(testDataAsMap.get("userName"));
		driver.findElement(By.id("email_1")).sendKeys(testDataAsMap.get("Email"));
		driver.findElement(By.id("password_2")).sendKeys(testDataAsMap.get("password"));
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(testDataAsMap.get("ConfirmPassword"));
		
		
		
		System.out.println(testDataAsMap.toString());
		
		
	}
	
	
	@Then("^The user will be able to registrated sucessfully$")
	public void the_user_will_be_able_to_registrated_sucessfully() throws Throwable {
	    WebElement submitBtn = driver.findElement(By.cssSelector("input[name='pie_submit']"));
	    submitBtn.click();
	    
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.close();
	}
	
	//*
		//*
		//Scenario: Verify that user already exists to register
		//*
		//*
	
	
	@Given("^The User goes to (.*)$")
	public void alreadyRegistrationPage(String page) throws Throwable {
		driver.manage().window().maximize();
		driver.get(page);
	}
	
	@When("^the user fill in  the given details on the form that already exist$")
	public void fillTheformExist(DataTable testData) throws Throwable {
		int numberListCheckBox = 0;
		
		Map<String,String> testDataAsMap = testData.asMap(String.class, String.class);
		
		driver.findElement(By.id("name_3_firstname")).sendKeys(testDataAsMap.get("FirstName"));
		driver.findElement(By.id("name_3_lastname")).sendKeys(testDataAsMap.get("LastName"));
		
		
		
		List<WebElement> elements = driver.findElements(By.className("checkbox_5"));		
		numberListCheckBox = elements.size();
		for(int i = 0;i <= numberListCheckBox;i++) {
			elements = driver.findElements(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]"));
			elements.get(i).click();
			
		}
		
		driver.findElement(By.id("phone_9")).sendKeys(testDataAsMap.get("PhoneNumber"));
		driver.findElement(By.id("username")).sendKeys(testDataAsMap.get("userName"));
		driver.findElement(By.id("email_1")).sendKeys(testDataAsMap.get("Email"));
		driver.findElement(By.id("password_2")).sendKeys(testDataAsMap.get("password"));
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(testDataAsMap.get("ConfirmPassword"));
		
		
		WebElement submitBtn = driver.findElement(By.cssSelector("input[name='pie_submit']"));
	    submitBtn.click();
		
		
		
	}
	
	@Then("^The user will validate tha already been registrated$")
	public void the_user_will_validate_tha_already_been_registrated() throws Throwable {
		
	    
	    
	    Assert.assertTrue(driver.findElement(By.xpath(".//*[.='Error: Username already exists']")).isDisplayed());
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.close();
		
	}
	
}

package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;


public class StepRegistrationDescription {

	WebDriver driver = new ChromeDriver();
	
	
	@Given("^User goes to http://demoqa\\.com/registration/$")
	public void goToRegistrationPage() throws Throwable {
		
		driver.get("http://demoqa.com/registration/");
	    
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
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.close();
	}
}

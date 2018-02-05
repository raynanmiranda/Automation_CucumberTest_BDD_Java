package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
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
		
		List<String> testDataList = testData.asList(String.class);
		
		driver.findElement(By.id("name_3_firstname")).sendKeys(testDataList.get(0));
		driver.findElement(By.id("name_3_lastname")).sendKeys(testDataList.get(1));
		
		
		
		List<WebElement> elements = driver.findElements(By.className("checkbox_5"));		
		numberListCheckBox = elements.size();
		for(int i = 0;i <= numberListCheckBox;i++) {
			elements = driver.findElements(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]"));
			elements.get(i).click();
			
		}
		
		driver.findElement(By.id("phone_9")).sendKeys(testDataList.get(3));
		driver.findElement(By.id("username")).sendKeys(testDataList.get(4));
		driver.findElement(By.id("email_1")).sendKeys(testDataList.get(5));
		driver.findElement(By.id("password_2")).sendKeys(testDataList.get(6));
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(testDataList.get(7));
		
		System.out.println(testDataList.toString());
	}
}

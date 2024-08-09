package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.BaseTest;
import io.cucumber.java.en.*;

public class Agency_Resources extends BaseTest {

	
	@When("I click on  Agency Resources button")
	public void i_click_on_agency_resources_button() {
		 driver = getDriver();
		 driver.findElement(By.xpath("//a[@href='https://shoutab.us/toolsresources']")).click();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I  should be naviagted to Tools & Resources  page")
	public void i_should_be_naviagted_to_tools_resources_page() {
		 String actualToolsResources  = driver.findElement(By.xpath("//div[@class='col-md-12']/h2[text()='Tools & Resources']")).getText();
	       String expectedToolsResources = "Tools & Resources";      
	       Assert.assertEquals(actualToolsResources, expectedToolsResources);
	       System.out.println("I am successfully landed on Tools & Resources page ");
	       driver.close();
}
	} 

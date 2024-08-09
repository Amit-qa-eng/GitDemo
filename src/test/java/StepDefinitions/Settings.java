package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.BaseTest;
import io.cucumber.java.en.*;

public class Settings extends BaseTest {

	@When("I click on Settings button")
	public void i_click_on_settings_button() {
		 driver = getDriver();
		 driver.findElement(By.xpath("//a[@href='https://shoutab.us/users_accounts ']")).click();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I should be naviagted to Settings  page")
	public void i_should_be_naviagted_to_settings_page() {
		String actualSettings  = driver.findElement(By.xpath("//div[@class='col-md-12']/h2[text()='Settings']")).getText();
	       String expectedSettings = "Settings";      
	       Assert.assertEquals(actualSettings, expectedSettings);
	       System.out.println("I am successfully landed on Settings page");
	       driver.close();
	}
}

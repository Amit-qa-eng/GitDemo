package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.BaseTest;
import io.cucumber.java.en.*;

public class Error_Notification extends BaseTest {

	@When("I clicks on Error Notifications button")
	public void i_clicks_on_error_notifications_button() {
		 driver = getDriver();
		 driver.findElement(By.xpath("//a[@href='https://shoutab.us/email_notification_list']")).click();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I should be naviagted to Manage Error Notifications  page")
	public void i_should_be_naviagted_to_manage_error_notifications_page() {
		String actualManageErrorNotification = driver.findElement(By.xpath("//h2/b[text()='Manage Error Notifications']")).getText();
	       String expectedManageErrorNotification = "Manage Error Notifications";      
	       Assert.assertEquals(actualManageErrorNotification, expectedManageErrorNotification);
	       System.out.println("I am successfully landed Manage Error Notification page");
	       driver.close();
	}
	
	
}

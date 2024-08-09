package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	protected static WebDriver driver;
	  public static void initializeDriver() {
	        if (driver == null) {
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        }
	    }

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            initializeDriver();
	        }
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	    }


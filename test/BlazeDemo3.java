import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class BlazeDemo3 {

	final String URL = "http://www.BlazeDemo.com";
	final String DRIVER_PATH = "C:\\chromedriver.exe";
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// Setup Selenium + Chrome
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
		driver = new ChromeDriver();
		
		// Tell Selenium what page to test
		driver.get(URL);
	}

	@After
	public void tearDown() throws Exception {
		// At end of test case, wait for a few seconds, then close the browser
		Thread.sleep(8000);				// OPTION 1
		driver.close();

	}

	@Test
	public void test() {
		//testcase to check the departure cities
		// driver.findElement(By.name("fromPort")).getSize();
		
		
		//testcase to select the destination
		driver.findElement(By.name("toPort")).sendKeys("New York");

		//testcase check the flight
		driver.findElement(By.className("btn btn-primary")).click();
		String urlPage2 = driver.getCurrentUrl();
	
		assertEquals("http://www.blazedemo.com/reserve.php", urlPage2);
		
	}
	
	
	

}

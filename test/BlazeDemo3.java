import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		Thread.sleep(2000);				// OPTION 1
		driver.close();

	}

	@Test
	public void test() {
		assertTrue(true);
	}
	
	
	

}

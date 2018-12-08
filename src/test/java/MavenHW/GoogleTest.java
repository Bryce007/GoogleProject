package MavenHW;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/Bryce/eclipse-workspace/HomePage/Drivers/chromedriver");
		
		driver= new ChromeDriver();
		String url="https//www.google.com/search?q=google&oq=goo&aqs=chrome.1.69i57j0l5.4562j0j4&sourceid=chrome&ie=UTF-8";
		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void Page() {
	String PageTitle=driver.getTitle();
	System.out.println("Page title is "+PageTitle);
}
	
	@AfterMethod
	public void Close() {
		driver.quit();
	}
}

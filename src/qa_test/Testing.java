package qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Done!!!");
	}
	
	
	@Test(priority=1)
	public void userName() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("testing");
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("testing");
		Thread.sleep(2000);
	}
	
	
	
	
	

}

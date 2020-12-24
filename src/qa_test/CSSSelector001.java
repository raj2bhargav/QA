package qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSSSelector001 {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
	}

	@Test
	public void test() throws InterruptedException {
		System.out.println(driver.findElement(By.cssSelector("p#para1")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p#para2")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#para1")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#para2")).getText());
		Thread.sleep(2000);
	}
	
	
	@Test
	public void moreTest() throws InterruptedException {
		System.out.println("-------------------");
		System.out.println(driver.findElement(By.cssSelector("*:first-child")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("*:last-child")).getText());
		Thread.sleep(2000);
		System.out.println("-------------");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Done!!!");
	}

}

package qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImFeelingLucky {

	private WebDriver driver;
	private String baseUrl;
	private String title = "https://www.google.com/doodles/";

	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnI']")).click();
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		String titles = driver.getTitle();
		if (titles.equals(title)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title didn't matched");
		}
		Thread.sleep(2000);
		driver.close();
	}

}

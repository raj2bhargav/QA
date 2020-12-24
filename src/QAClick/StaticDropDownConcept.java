package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		select.selectByIndex(2);
		Thread.sleep(3000L);
		
		select.selectByValue("option1");
		
		driver.close();
		
		System.out.println("Test Completed");
		
	}

}

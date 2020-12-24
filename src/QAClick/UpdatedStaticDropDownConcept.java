package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedStaticDropDownConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Thread.sleep(2000L);
		adult.selectByValue("4");
		
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		Thread.sleep(2000L);
		child.selectByVisibleText("2");
		
		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Thread.sleep(2000L);
		infant.selectByIndex(1);
		
		System.out.println("Test Completed");
		
	}

}

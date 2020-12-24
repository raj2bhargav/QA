package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //Implicit Wait
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Limited offer")))).click();
		
		System.out.println("Pass");
		
		driver.close();
		

		
	}

}

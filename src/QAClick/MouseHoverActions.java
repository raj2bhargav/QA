package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); //Implicit Wait
		
		driver.get("https://www.amazon.ca/");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		//a.moveToElement(driver.findElement(By.cssSelector(".nav-a.nav-a-2.nav-truncate"))).build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		Thread.sleep(2000);
		
		System.out.println("Pass");
		

	}

}

package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("autocomplete")).sendKeys("Hello World");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		
		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		System.out.println("Test Completed");
		
		
	}

}



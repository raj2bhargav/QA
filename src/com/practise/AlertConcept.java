package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Raj");
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		System.out.println("Pass");
		
		driver.close();

	}

}

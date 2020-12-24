package com.finals.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("Raj");
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		Thread.sleep(2000L);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000L);
		driver.switchTo().alert().accept();
		Thread.sleep(2000L);
		driver.findElement(By.id("name")).sendKeys("Raj");
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		Thread.sleep(2000L);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000L);
		
		
		System.out.println("Pass");
		driver.close();
	}

}

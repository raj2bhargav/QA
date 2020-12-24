package com.finals.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Raj");
		
		Thread.sleep(2000);
		
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		Thread.sleep(2000);
		select.selectByValue("option3");
		
		Thread.sleep(2000);
		driver.findElement(By.name("checkBoxOption2")).click();
		
		Thread.sleep(2000);
		System.out.println("Pass");
		
		driver.close();
			

	}

}

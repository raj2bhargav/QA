package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("testing");
		
		Thread.sleep(2000);
		
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByIndex(2);
		
		Thread.sleep(2000);
		driver.findElement(By.name("checkBoxOption3")).click();
		
		Thread.sleep(2000);
		System.out.println("Pass");
		
		driver.close();
		

	}

}

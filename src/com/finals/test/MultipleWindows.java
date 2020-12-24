package com.finals.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'terms and conditions')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentId);
		driver.close();
		
		

	}

}

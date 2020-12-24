package com.finals.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksCountConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Total No of links  = " + driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> footerPageLinks = footerDriver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println("Links on the footer section of the page = " + footerPageLinks.size());
		
		
		WebElement footerSection = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]/ul"));
		List<WebElement> footerSectionLinks = footerSection.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println("Links on the footer section of 1st row of the page  = " + footerPageLinks.size());
		
	
		
	}

}

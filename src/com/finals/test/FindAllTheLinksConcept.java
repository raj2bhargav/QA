package com.finals.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllTheLinksConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number Of Links = " + linkList.size());
		
		for(int i=1; i<=linkList.size(); i++) {
			String linkListName = linkList.get(i).getText();
			System.out.println(linkListName);
		}
		
		System.out.println("Passed");
		
		driver.close();
		

	}

}

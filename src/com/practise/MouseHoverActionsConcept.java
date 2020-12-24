package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.get("https://www.amazon.ca/");

		Actions action = new Actions(driver);

		Thread.sleep(2000);

		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

		Thread.sleep(2000);

		System.out.println("Pass");

		driver.close();

	}

}

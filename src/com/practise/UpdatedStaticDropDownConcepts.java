package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedStaticDropDownConcepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);

		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Thread.sleep(2000);
		adult.selectByVisibleText("3");

		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		Thread.sleep(2000);
		child.selectByValue("2");

		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Thread.sleep(2000);
		infant.selectByIndex(2);

		System.out.println("Pass");

		driver.close();

	}

}

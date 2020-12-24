package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownConcepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		Select select = new Select(driver.findElement(By.id("country")));

		select.selectByIndex(2);
		Thread.sleep(2000);

		select.selectByVisibleText("Bahamas");
		Thread.sleep(2000);

		select.selectByValue("25");
		Thread.sleep(2000);

		System.out.println("Pass");

		driver.close();

	}

}

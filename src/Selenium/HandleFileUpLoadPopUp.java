package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpLoadPopUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Selenium\\raj.txt");

        System.out.println("Test Complete");
		
	}

}

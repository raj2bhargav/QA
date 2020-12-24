package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys("Raj Bhargav");
		
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		
		Thread.sleep(3000L);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000L);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000L);
		
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys("Raj Bhargav");
		
		Thread.sleep(3000L);
		
		driver.findElement(By.cssSelector("input[value='Confirm']")).click();
		
		Thread.sleep(3000L);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000L);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000L);
		
		driver.close();
		
		System.out.println("Pass");
		
		
	}

}

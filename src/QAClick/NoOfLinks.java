package QAClick;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println("Total No Of Links  = " + linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			System.out.println(linkList.get(i).getText());
		}
		
		driver.close();
		
		System.out.println("Pass");
		
		

	}

}

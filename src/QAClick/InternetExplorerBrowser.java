package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\SeleniumJars\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		System.out.println("Test Complete");
		
	}

}

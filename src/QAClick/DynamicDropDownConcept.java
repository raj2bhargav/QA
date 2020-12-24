package QAClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropDownConcept {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\SeleniumJars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);

        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        
        driver.close();

        System.out.println("Test Completed");

	}

}

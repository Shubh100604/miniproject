package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logout {
	@Test
    public void logoutverify() {
 	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		   email.sendKeys("kiran@gmail.com");
		   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("123456");
		   WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		   submitbutton.click();
		   WebElement logOutButton=driver.findElement(By.xpath("//a[@href='logout.html']"));
		   logOutButton.click();
		   String currentUrl=driver.getCurrentUrl();
		   System.out.println(currentUrl);
		   Assert.assertEquals(currentUrl, "file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/logout.html");
		   driver.close();
	}


}

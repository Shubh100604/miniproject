package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logintestcase {
	 @Test
		public void Urltestver () {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			String actHead= driver.findElement(By.xpath("//a[@href='index2.html']")).getText();
			System.out.println(actHead);
			Assert.assertEquals(actHead, "AdminLTE");
			driver.close();
		}
		 
		    @Test
		    public void loginboxtitle() {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
				String TextatEmail= driver.findElement(By.xpath("//p[@class='login-box-msg']")).getText();
				System.out.println(TextatEmail);
				Assert.assertEquals(TextatEmail, "Sign in to start your session");
				driver.close();
		    }
		    @Test
		    public void emiltextbox() {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
				String textatemail=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("placeholder");
				System.out.println(textatemail);
				Assert.assertEquals(textatemail, "Email");
				driver.close();
		    }
	       @Test
	       public void loginwithNocredential() {
	    	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
			   WebDriver driver= new ChromeDriver();
			   driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
			   email.sendKeys("    ");
			   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("   ");
			   WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
			   submitbutton.click();
			   String curl=driver.getCurrentUrl();
			   Assert.assertEquals(curl,"file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html" );
			   driver.close();
	       }
	       @Test
	       public void errormessage() {
	    	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
			   WebDriver driver= new ChromeDriver();
			   driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
			   email.sendKeys("    ");
			   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("   ");
			   WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
			   submitbutton.click();
			   String errormessage= driver.findElement(By.xpath("//div[@id='email_error']")).getText();
			   System.out.println(errormessage);
			   Assert.assertEquals(errormessage, "Please enter email as kiran@gmail.com");
			   driver.close();
	       }
	       @Test
	       public void correctCredential() {
	    	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
			   WebDriver driver= new ChromeDriver();
			   driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
			   email.sendKeys("kiran@gmail.com");
			   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
			   password.sendKeys("123456");
			   WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
			   submitbutton.click();
			   String currentUrl=driver.getCurrentUrl();
			   Assert.assertEquals(currentUrl, "file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");
			   driver.close();
	       }

}

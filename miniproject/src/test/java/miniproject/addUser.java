package miniproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addUser {
	@Test
    public void navigatetOaddUser() {
 	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		   email.sendKeys("kiran@gmail.com");
		   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("123456");
		   WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		   submitbutton.click();
		   WebElement user= driver.findElement(By.xpath("//a[@href='users.html']"));
		   user.click();
		   WebElement addUser= driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-sm pull-right']"));
		   addUser.click();
		   String url=driver.getCurrentUrl();
		   Assert.assertEquals(url, "file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");
		   driver.close();
		   }
	@Test
    public void addUser() {
 	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		   email.sendKeys("kiran@gmail.com");
		   WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		   password.sendKeys("123456");
		   WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		   submitbutton.click();
		   WebElement user= driver.findElement(By.xpath("//a[@href='users.html']"));
		   user.click();
		   WebElement addUser= driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-sm pull-right']"));
		   addUser.click();
		   WebElement userNamenew= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		   userNamenew.sendKeys("sourabh");
		   WebElement mobilebox= driver.findElement(By.xpath("//input[@id='mobile']"));
	       mobilebox.sendKeys("9374749599");
	       WebElement emailtbox= driver.findElement(By.xpath("//input[@id='email']"));
		   emailtbox.sendKeys("shubham@test.com");
		   WebElement genderbutton= driver.findElement(By.xpath("//input[@value='Male']"));
		   genderbutton.click();
		   System.out.println(genderbutton.isSelected());
		   WebElement dropdownB= driver.findElement(By.tagName("select"));
		   Select selectDropDown= new Select(dropdownB);
		   selectDropDown.selectByVisibleText("Maharashtra");
		   WebElement passwordB= driver.findElement(By.xpath("//input[@type='password']"));
		   passwordB.sendKeys("asddfdsff@122");
		   WebElement submitt= driver.findElement(By.xpath("//button[@id='submit']"));
		   submitt.click();
		   Alert alert= driver.switchTo().alert();
		   String actMessage=alert.getText();
		   System.out.println(actMessage);
		   Assert.assertEquals(actMessage, "User Added Successfully. You can not see added user.");
		   alert.accept();
		   driver.close();
	}

}

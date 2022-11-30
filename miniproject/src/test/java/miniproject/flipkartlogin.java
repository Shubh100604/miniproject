package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		/*Actions act = new Actions(driver);

		act.sendKeys(Keys.ESCAPE).build().perform();*/
		
	    WebElement logId= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		logId.sendKeys("7788991010");
		WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("sdfa@dsv");
		WebElement submitt= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		submitt.click();
		
    
	}

}

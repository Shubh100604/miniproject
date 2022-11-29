package miniproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartautomation {

	

		public static void main(String[] args) throws InterruptedException {
		

				

					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

					WebDriver driver = new ChromeDriver();

					driver.manage().window().maximize();

					driver.get("https://www.flipkart.com/");

					Actions act = new Actions(driver);

					act.sendKeys(Keys.ESCAPE).build().perform();

					WebElement electronicsOption = driver.findElement(By.xpath("//div[text()='Electronics']"));

					act.moveToElement(electronicsOption).build().perform();

					WebElement camerasOption = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));

					act.moveToElement(camerasOption).build().perform();

					WebElement sportsOptions = driver.findElement(By.xpath("//a[text()='Sports & action']"));

					act.moveToElement(sportsOptions).click().build().perform();

					Thread.sleep(5000);

					List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

					List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

					String firstProductPrice = priceList.get(0).getText();

					String parentWindow = driver.getWindowHandle();

					productNames.get(0).click();

					Set<String> childWindows = driver.getWindowHandles();

					Iterator i1 = childWindows.iterator();

					while (i1.hasNext()) {
						String cdWindow = (String) i1.next();

						if (!parentWindow.equalsIgnoreCase(cdWindow)) {
							driver.switchTo().window(cdWindow);

							WebElement productPrice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));

							String priceOfProduct = productPrice.getText();

							if (priceOfProduct.equalsIgnoreCase(firstProductPrice)) {
								System.out.println("Product price is same..");
							} else {
								System.out.println("Product price is different..");
							}

						}

					}

					driver.quit();

				

		}

	}


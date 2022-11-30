package miniproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSortedornot {

	public static void main(String[] args) {
		
		System.setProperty("weddriver.chrome,driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Selenium/websiteoffline/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");
		WebElement dropdown= driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select select= new Select(dropdown);
		List<WebElement> alldropdown=select.getOptions();
		
         List originalList = new ArrayList();    
		
		for(WebElement ele: alldropdown) {
			originalList.add(ele.getText());
		}
		
         System.out.println("Options in dropdown" +originalList);
         
		List tempList = new ArrayList(originalList);
		
		Collections.sort(originalList);   
		//System.out.println("original drop down" + tempList);
		System.out.println("Sorted List" +originalList);
		
		if (originalList.equals(tempList)) {
			System.out.println("DropDown is sorted");
			
		}
		else {
			System.out.println("DropDown is not sorted");
		}
		
	}

}

package freecrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDynamicSearch {
public static void main (String[] args) throws InterruptedException {
		
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    driver.get("https://www.google.co.in/");
	    driver.findElement(By.xpath("//input[@id=\"lst-ib\"]")).sendKeys("testing");
	    
	    List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	    System.out.println(list.size());
	    System.out.println("The total number of suggestion displayed is  " + list.size());
                                                                    
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().contains("tools")) {
        		list.get(i).click();
        		break;
        	}
        	
        	
        }

}
}
//This Test script explains frame handling,parent sibling relation and dynamic x-path

package freecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentSiblingPropertyExample {
	public static void main (String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Android\\Updated Drivers\\chromedriver.exe");
	    //WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Android\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		
	    String baseurl="https://www.freecrm.com/";
	    driver.get(baseurl);
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("soumyamishra");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Fastlane1");
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	    Thread.sleep(5000);
	    driver.switchTo().frame("mainpanel");
	    driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[contains(text(),'MMM')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	    Thread.sleep(5000);
	    System.out.println("Test Case is passed");
	}

}

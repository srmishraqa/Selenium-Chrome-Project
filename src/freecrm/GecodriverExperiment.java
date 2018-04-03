package freecrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GecodriverExperiment {
	
	public static void main(String[] args) {
	                                       
	//1.Launching Firefox browser
    //Gecokdriver we have to use.It is a class.We have to create an object.
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Android\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.co.in/");
		
	//2.Launching Chrome Browser
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Android\\Updated Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("Correct Title is displayed");
		}
		else {
			System.out.println("Incorrect Title is displayed");
		}
		
	
	}
	



}



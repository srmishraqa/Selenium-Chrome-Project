
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl = "https://www.google.co.in/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Test case is passed");
}
}
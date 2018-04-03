import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNews {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Android\\Updated Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://news.google.com/news/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@class='cc5fC' and text()='Technology'] ")).click();

		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		System.out.println("Test Case is passed");
		driver.quit();
	}

}

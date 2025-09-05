package Day_39.com.BrokenLinks_ShadowDoms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDoms {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://books-pwakit.appspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		SearchContext shadowRoot = driver.findElement(By.cssSelector("[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadowRoot.findElement(By.cssSelector("#input")).sendKeys("Hello");

	}

}

package Day_38.com.HeadleeTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisbleAutomationMessageOnScreen {

	public static void main(String[] args) {

		//Its don't show the message in browser "chrome is controlled by automation software)
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		
		
		if(title.equals("Automation Testing Practice")) {
			System.out.println(title+"  ..TestPassed...!");
		} else {
		System.out.println("Failed");
		}
		driver.quit();
	}

}

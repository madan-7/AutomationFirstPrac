package Day_38.com.HeadleeTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanchBroswerInIncongnitoMode {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);

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

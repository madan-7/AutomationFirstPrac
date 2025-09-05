package Day_38.com.HeadleeTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		
		//handling the In secure certifications by below methods accepting 
		options.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");   
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		
		
		if(title.equals("expired.badssl.com")) {
			System.out.println(title+"  ..TestPassed...!");
		} else {
		System.out.println("Failed");
		}
		driver.quit();
	}

}

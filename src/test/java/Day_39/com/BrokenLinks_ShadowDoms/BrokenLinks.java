package Day_39.com.BrokenLinks_ShadowDoms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	/*1) get all url = "//abcxyz.com" (its in String formate we will get
	 * 
	 * 2) if we hit above URL --> in server we will get status code
	 * 
	 * 3) if status code >=400 then broken link
	 * 		else (<400) not broken link
	 */


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		//Capture all links on webPage
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Num.of Links in WEBPage: "+links.size());
		
		
		int Broken=0;
		int NotBroken=0;
		
		//Looping to get all links
		for(WebElement all:links) {
		
		//get the links	(this will provide the attribute values from the dom (like href="error-page.asp?e=400")
		String hrefValues =	all.getAttribute("href");
		
		//condition to check if that link not available means no link present after href="Empty"
		if(hrefValues==null || hrefValues.isEmpty()) {
			System.out.println("This links are empty and no href, so not possible to check");
			continue;
		}
		
		try {
		
		URL url = new URL(hrefValues); //Converting all href values String to URL format
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();  //open Connection to Servers
		conn.connect(); //connect to server and send request to servers
		
		//getResponseCode will return the response of code.
		if(conn.getResponseCode()>=400) {
			System.out.println(hrefValues+"--------> Broken Link");
			
			Broken++;
		}else {
			System.out.println(hrefValues+"--------> Not Broken Link");
			NotBroken++;
		}
		
		
		}catch (Exception e) {
			
		}
		
	}
		System.out.println("Broken Links: "+Broken);
		System.out.println("Not Broken Links: "+NotBroken);
	}
}

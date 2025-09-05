package com.HandlingMouseActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Actions class
			Actions actions = new Actions(driver);
			
			WebElement cli = driver.findElement(By.xpath("//a[@class='ico-register']"));
			
			//OpenTheLinkInNewTab the (ctrl+click)
			actions.keyDown(Keys.CONTROL).click(cli).keyUp(Keys.CONTROL).perform();
			
			//getting the windows id's
			
			//List<String> all = new ArrayList<>(driver.getWindowHandles());
			
			//or
			Set<String> windowHandles2 = driver.getWindowHandles();			
			List<String> windowHandles =new ArrayList(windowHandles2);
			
			
			
			Thread.sleep(5000);
			
			//switch to second window by index
			driver.switchTo().window(windowHandles.get(1));
			driver.findElement(By.id("small-searchterms")).sendKeys("Iphone");
			
			//switch to again main window
			driver.switchTo().window(windowHandles.get(0));
			driver.findElement(By.id("small-searchterms")).sendKeys("Iphone");
			
			
	}

	

}

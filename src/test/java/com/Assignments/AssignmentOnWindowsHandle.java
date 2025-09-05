package com.Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWindowsHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Sending key's on search box
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");

		//Clicking the search button
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

		//Count of links (After clicking)
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		System.out.println("Number of Links: "+findElements.size());


		//click on each link

		for(int i=0;i<findElements.size();i++) {

			 findElements.get(i).click();			

				
		}

		//After opening all the pages, capture windowid's
		Set<String> windowIds=driver.getWindowHandles();

		System.err.println("Switching to each browser window and getting the titles........"); 
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}

		//driver.quit();

	}

}



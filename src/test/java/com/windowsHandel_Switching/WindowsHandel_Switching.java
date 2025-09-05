package com.windowsHandel_Switching;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandel_Switching {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//get() used to load the driver
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	    
	    String currentUrl = driver.getCurrentUrl();
	    
	//  System.out.println("Current URL"+ currentUrl);
	    
	    
	   WebElement findElement = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
	    findElement.click();
	   
	   Set<String> windowHandles = driver.getWindowHandles();
	   
	/* //Approach 1 to get single element/web page id
	   
	   ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
	   
	   String ParentID = arrayList.get(0);
	   String ChaildId = arrayList.get(1);
	   
	 //System.out.println(arrayList.get(0));
	 //System.out.println(arrayList.get(1));
	    
	   //Now we can switch b/w windows by using 
	   
	   driver.switchTo().window(ChaildId);
	   System.out.println(driver.getTitle());
	   
	   driver.switchTo().window(ParentID);
	   System.out.println(driver.getTitle());
	   
	*/
	   
	   
	   //Approach 2 to get single element/web page id
	   
	   
	/*   for (String string : windowHandles) {
		
		   String title = driver.switchTo().window(string).getTitle();
		   
		   if(title.equals("OrangeHRM")){
			   System.out.println(driver.getCurrentUrl());
			  
		  
		   }
		   else if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
			   System.out.println(driver.getTitle());
			   driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("Madan");
		   }
	}*/
	}

} 

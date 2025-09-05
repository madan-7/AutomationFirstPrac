package com.HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDropDowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
				
		//click on PIM
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		
		//click on drop down
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]"))
		.click();
		Thread.sleep(5000);
		
		//select any one element in drop down list
			//driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();  //Use  "//span[normalize-space()='Automation']"
		
		//count all 
		List<WebElement> findElement = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(findElement.size());
		
		//printing all drop down texts
		for(WebElement out : findElement) {
			System.out.println(out.getText());
		}  
		
		
	}

}

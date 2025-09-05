package com.FilesUploades;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesUploads {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		//1)Single file uploads
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\madan\\OneDrive\\Desktop\\FilesToTest\\Test1\\Heelo.txt");
		
		
		

		
		
		
	
	}

}

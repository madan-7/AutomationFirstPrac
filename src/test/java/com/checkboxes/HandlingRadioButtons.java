package com.checkboxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			
			WebElement maleId = driver.findElement(By.xpath("//input[@id='male']"));
			WebElement femalId = driver.findElement(By.xpath("//input[@id='female']"));
			
			System.out.println("Before clicking radio buttons");
			System.out.println(maleId.isSelected());
			System.out.println(femalId.isSelected());
			
			//here clicking one button
			maleId.click();
			
			System.out.println("After clicking radio buttons");
			System.out.println(maleId.isSelected());
			System.out.println(femalId.isSelected());
			
			
			


	}

}

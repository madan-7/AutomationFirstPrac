package com.HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='country']"));		
		
		//passing web element to the Select ref. 
		Select slectDropDwonEle= new Select(findElement);
		
		
		//selecting element by Value
			//slectDropDwonEle.selectByValue("india");
		
		//selecting element by VisibleText		
			//slectDropDwonEle.selectByContainsVisibleText("India");
		
		//selecting element by index
			//slectDropDwonEle.selectByIndex(2);
		
		//here we using getOptions() to get all drop down elements
		List<WebElement> options = slectDropDwonEle.getOptions();
		
		//printing size
		System.out.println("Number of options in drop down: "+options.size());
		
		//Retrieving all elements
		for(WebElement s: options ) {
			System.out.println(s.getText());
		}
		
		
	}
	

}

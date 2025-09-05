package com.HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDowns {

	public static void main(String[] args) {
		

	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	
	//opening drop down options
	driver.findElement(By.xpath("pass xpath for dropdown box")).click();
	
	//1)selecting single option in drop dwon list(take that particular xpath and run)
	
	driver.findElement(By.xpath("")).click();
	
	//2) Capturing all the options to find out the size.
	
	List<WebElement> findElements = driver.findElements(By.xpath(""));
	
	System.out.println(findElements.size());
	
	//printing options from the drop down (all visible list)
	
	for(WebElement all: findElements) {
		System.out.println(all.getText());
	}
	
	//4) selecting multiple options in drop down
	for(WebElement all: findElements) {
		
		String text = all.getText();
		if(text.equals(text.equals("JAVA") || text.equals("C++"))){
			all.click();
		}
		
	}
}

}
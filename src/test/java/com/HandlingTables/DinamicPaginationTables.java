package com.HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinamicPaginationTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		int rows = driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr")).size();
		System.out.println(rows);
		
		int col = driver.findElements(By.xpath("//div[@class='table-container']//thead//th")).size();
		System.out.println(col);
		
		Thread.sleep(3000);
	/*	
		//clicking each number to change table
		for(int r=1;r<=4;r++) {
			
		WebElement findElement = driver.findElement(By.xpath("//ul[@id='pagination']//li//a[contains(text(),'"+r+"')]"));
		findElement.click();
		}
		
	*/	
	
		
		//clicking each number to change table
				for(int r=1;r<=4;r++) {
					
				WebElement findElement = driver.findElement(By.xpath("//ul[@id='pagination']//li//a[contains(text(),'"+r+"')]"));
				
				    String sno = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+ r+"]//td[1]")).getText();
					String name = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]//td[2]")).getText();
					String Price = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]//td[3]")).getText();
					System.out.print(sno+"\t"+name+"/t"+Price+"/t");
					
			
			System.out.println(" ");
		
		
		findElement.click();
		}
				
				
	}
		
	}



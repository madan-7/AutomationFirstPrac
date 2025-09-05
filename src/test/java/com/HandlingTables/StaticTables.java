package com.HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1) Finding the total number of rows in table(right to left)

		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //single table
		System.out.println("the number of rows in table: "+row);
		//or by tag name(CSS selector)
		int s = driver.findElements(By.tagName("tr")).size(); //all tables
		System.out.println("the total number of rows in tables: "+s);

		//2) Find total columns table(top to bottom)

		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //single table
		System.out.println("the total number of cloumns in table: "+col);
		//or
		int colus = driver.findElements(By.tagName("th")).size(); //all tables
		System.out.println("the total number of columns in tables: "+colus);


		//3) read data from specific row and columns
			//String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
			//System.out.println(text);

		/*	//4) Reading all table data

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {

				String text2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();

				System.out.print(text2+"/t");
			}
			System.out.println(" ");
		}

		 */	

		//5)printing book name who's author name is mukesh.

		/*for(int i=2;i<row;i++) {
			String text2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(text2.equals("Mukesh")) {
				String text3 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				System.out.println(text3);
			}

		}

		 */


		//6) Calculating all prices in table (sum of prices)
		int sum=0;
		for(int i=2;i<=row;i++) {
			
			String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			sum=sum+Integer.parseInt(data);
		
		}
		System.out.println(sum);
	}


}

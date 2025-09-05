package com.Assignments;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssessmentOnStaticTables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();

		//Selecting box		
		WebElement findElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/select[1]"));
		findElement.click();

		//passing object to select interface
		Select select = new Select(findElement);

		//selecting any one in drop down		
		select.selectByValue("Boston");

		//Selecting 2box		
		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select1 = new Select(findElement1);
		findElement1.click();		   
		select1.selectByValue("London");

		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//rows
		int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("number of rows in table:"+rows); //5


		//capture prices then store in array and get all the prices to check which was in our budget...

		String pricesArr[]=new String[rows]; 

		for(int i=1;i<=rows;i++) {

			String out = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();

			pricesArr[i-1]= out; //adding price into array

		}	

		//Sort prices then find lower price value

		for(String arrvalue:pricesArr)
		{
			System.out.println(arrvalue);
		}
		// this will able to sort strings. so no need to convert to number

		Arrays.sort(pricesArr);
		String lowestPrice=pricesArr[1];
		System.out.println("Lower price:"+lowestPrice);

		
		//8- Find record in table having lower price

		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();

			if(price.equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;
			}

		}

		//9 - Fill the details then click on Purchase Flight button

		driver.findElement(By.id("inputName")).sendKeys("John");
		driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
		driver.findElement(By.id("city")).sendKeys("Columbus");
		driver.findElement(By.id("state")).sendKeys("OH");
		driver.findElement(By.id("zipCode")).sendKeys("43240");
		driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

		//10 - validation
		String msg=driver.findElement(By.xpath("//h1")).getText();

		if(msg.contains("Thank you for your purchase"))
		{
			System.out.println("Success !! Passed");
		}
		else
		{
			System.out.println("Failed");	
		}

		//driver.quit();



	}

}

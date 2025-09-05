package com.checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1)Select Check Box and click it

		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		//2)Capture the all check boxes and finding the size	
		List<WebElement> findElements = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));	
		System.out.println("Size of check boxes: "+findElements.size());

		//3)Now clicking all the check boxes which are selected using loops or for advanced loop.	

		/*
		 * for(int i=0;i<findElements.size();i++) {
		findElements.get(i).click();
					}
										//--------Use any one loop's condition's-----------

		for(WebElement ac:findElements) {
			ac.click();
					}
		 */

		//4)How select last 3 check boxes.

		/*
		 * for(int i=0;i<findElements.size();i++) {
		 *  findElements.get(i).click();
			}
		 */


		//5)how to select first 3 check boxes (or use break statement)

		/*for(int i=0;i<=2;i++) { 
		 * findElements.get(i).click();
		 * }
		 */

		/*6) select the unselected check boxes, keep above for loop it will select first 3 check boxes and 
		below one will unselect above and check boxes and it will select the unselect check boxes. */
		/*
		 * for(WebElement se: findElements) {
		 * 
		 * if(se.isSelected()) {
		 *  se.click();
		 *   }
		 *   else { 
		 *   se.click(); } }
		 */

		//Note: If you want to de-select all check boxes, first select all check box and in again write loop to select all check boxes.


		//7) if we want to select particular check boxes

		for(int j=0;j< findElements.size();j++) {
			if(j==0||j==3||j==6) {

				findElements.get(j).click();

			}
		}
		
		//8) Checking based on elements name.
		
		String element ="Sanday";
		
		switch(element) {
		
		case "Sunday": driver.findElement(By.xpath("//input[@id='sunday']")).click();
					break;
		case "Monday": driver.findElement(By.xpath("//input[@id='monday']")).click();
					break;
		case "Tuesday": driver.findElement(By.xpath("//input[@id='tuesday']")).click();
					break;
		case "Wednessday": driver.findElement(By.xpath("//input[@id='wednessday']")).click();
					break;
		case "Thursay": driver.findElement(By.xpath("//input[@id='thursay']")).click();
					break;
		case "Friday": driver.findElement(By.xpath("//input[@id='friday']")).click();
					break;
		case "Saturday": driver.findElement(By.xpath("//input[@id='saturday']")).click();
					break;
				
		default : System.out.println("Missmatch element or no element found");			
			
		
		}


	}


}

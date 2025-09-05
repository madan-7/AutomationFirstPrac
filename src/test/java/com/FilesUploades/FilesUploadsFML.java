package com.FilesUploades;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesUploadsFML {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
	/*	//1)Single file uploads
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\madan\\OneDrive\\Desktop\\FilesToTest\\Test1\\Heelo.txt");
		
		WebElement findElement = driver.findElement(By.xpath("//ul[@id='fileList']//li"));
		
		if(findElement.getText().equals("Heelo.txt")){
			
			System.out.println("FileUploaded success");
		}else {
			System.out.println("Not uploaded........!");
		}
		
	*/
		
		//2) upload multiple files	
		
		Thread.sleep(5000);
		
		//path for one file to upload from local
		String file1="C:\\Users\\madan\\OneDrive\\Desktop\\FilesToTest\\Test1\\Heelo.txt";
		Thread.sleep(3000);
		//path for second file to upload from local
		CharSequence file2="C:\\Users\\madan\\OneDrive\\Desktop\\FilesToTest\\Test2\\text2.txt";
		
		//passing two paths by sendKeys
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);	
		
	
	    //Checking file was uploaded or not on file by getText()
		List<WebElement> findElement1 = driver.findElements(By.xpath("//ul[@id='fileList']//li"));
		
		for(WebElement element:findElement1 ) {
			
			System.out.println(element.getText());
			
			
		}
		
		
	
	}

}

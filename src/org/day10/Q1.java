package org.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String all = driver.getWindowHandle();
		System.out.println(all);
						
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone X, 64GB,')]")).click();
		
		System.out.println();
		
		WebElement prt = driver.findElement(By.xpath("(//span[text()='$299.00'])[2]"));
		
		System.out.println(prt.getText());
		
		
		
		
		
		
		
	}
	

}

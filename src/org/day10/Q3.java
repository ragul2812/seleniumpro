package org.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("celling fan");
		
		driver.findElement(By.xpath("//button[@id='headerSearchButton']")).click();
		
		String prt = driver.getWindowHandle();
		System.out.println(prt);
		
		driver.switchTo().window(prt);
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'LED Indoor')])[1]")).click();
		
		
		
	}

}

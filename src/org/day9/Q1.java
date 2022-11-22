package org.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		
		
		
		

	}

}

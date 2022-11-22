package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));

		List<WebElement> allData = table.findElements(By.tagName("tr"));
		
		System.out.println("no of rows : "+allData.size());
		
		
	}

}

package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q11 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("ragul2812");
		

		driver.findElement(By.id("password")).sendKeys("123321");

		driver.findElement(By.id("login")).click();
		
		WebElement types = driver.findElement(By.id("adult_room"));

		Select s = new Select(types);

		List<WebElement> list = s.getOptions();

		 System.out.println(list.size());

		
		
		
	}

}

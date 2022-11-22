package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		WebElement frts = driver.findElement(By.id("fruits"));
		
		Select s = new Select(frts);
		
		List<WebElement> list = s.getOptions();
		for (int i = 0; i < list.size(); i++) {
			
			if (i%2!=0) {
				s.selectByIndex(i);
				
			}
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			System.out.println(list.size()-allSelectedOptions.size());
			
		}
		
		
	}

}

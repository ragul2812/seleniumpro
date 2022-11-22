package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();
		
		WebElement con = driver.findElement(By.xpath("//select[@name='country']"));
		
		Thread.sleep(3000);
		
		Select s = new Select(con);

		s.selectByValue("ALBANIA");
		
		List<WebElement> list = s.getOptions();

		//System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
			WebElement prt = list.get(i);
			System.out.println(prt.getAttribute("value"));
			
			 					
		}

				
		
	}

}

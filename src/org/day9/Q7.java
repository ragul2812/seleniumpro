package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q7 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();
		
		WebElement con = driver.findElement(By.xpath("//select[@name='country']"));
		
		Thread.sleep(3000);
		
		Select s = new Select(con);

		s.selectByValue("INDIA");
		
		List<WebElement> list = s.getOptions();

		//System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
			WebElement prt = list.get(i);
			System.out.println(prt.getAttribute("value"));
			
			 
			 
			 WebElement first = driver.findElement(By.name("firstName"));
			 			 
			// Select s1 = new Select(first);
			 //s1.selectByVisibleText("ragul");
			 
			 driver.findElement(By.name("lastName")).sendKeys("d");
			 
			 driver.findElement(By.name("phone")).sendKeys("9444500928");
			 
			 driver.findElement(By.name("userName")).sendKeys("ragul28@gmail.com");
			 
			 driver.findElement(By.name("address1")).sendKeys("no 13 vandipalyathamman koil street mattanaodai");
			 
			 driver.findElement(By.name("city")).sendKeys("chennai");
			 
			 driver.findElement(By.name("state")).sendKeys("TN");
			 
			 driver.findElement(By.name("postalCode")).sendKeys("603204");
			 
			 driver.findElement(By.name("email")).sendKeys("ragul");
			 
			 driver.findElement(By.name("password")).sendKeys("123321");
			 
			 driver.findElement(By.name("confirmPassword")).sendKeys("123321");
			 
			 driver.findElement(By.name("submit")).click();
			 
					
		}

				
		
	}
	

}

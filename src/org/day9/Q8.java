package org.day9;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8 {
	
	public static void main(String[] args) throws InterruptedException {
		
					System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://adactinhotelapp.com/");

			driver.manage().window().maximize();

			driver.findElement(By.id("username")).sendKeys("ragul2812");

			driver.findElement(By.id("password")).sendKeys("123321");

			driver.findElement(By.id("login")).click();

			WebElement loc = driver.findElement(By.id("location"));
			Select s1=new Select(loc);
			s1.selectByVisibleText("Adelaide");

			Thread.sleep(3000);

			driver.findElement(By.xpath("//option[text()='New York']")).click();

			driver.findElement(By.id("hotels")).click();

			driver.findElement(By.xpath("//option[text()='Hotel Sunshine']")).click();

			driver.findElement(By.id("room_type")).click();

			driver.findElement(By.xpath("//option[text()='Deluxe']")).click();

			driver.findElement(By.id("Submit")).click();

			Thread.sleep(5000);

			driver.findElement(By.id("radiobutton_0")).click();

			driver.findElement(By.id("continue")).click();

			Thread.sleep(4000);

			driver.findElement(By.id("first_name")).sendKeys("ragul");

			driver.findElement(By.id("last_name")).sendKeys("d");

			driver.findElement(By.id("address")).sendKeys("mattanaodai");

			driver.findElement(By.id("cc_num")).sendKeys("1800018736549826");

			driver.findElement(By.id("cc_type")).click();

			driver.findElement(By.xpath("//option[text()='VISA']")).click();

			driver.findElement(By.id("cc_exp_month")).click();

			driver.findElement(By.xpath("//option[text()='May']")).click();

			driver.findElement(By.id("cc_exp_year")).click();

			driver.findElement(By.xpath("//option[text()='2022']")).click();

			driver.findElement(By.id("cc_cvv")).sendKeys("932");

			WebElement click = driver.findElement(By.id("book_now"));

			click.click();

			Thread.sleep(3000);

			WebElement no = driver.findElement(By.id("order_no"));

			Select s = new Select(no);

			
			

		
	}

}

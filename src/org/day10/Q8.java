package org.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("hand sanitizer");

		driver.findElement(By.xpath("//span[text()='Search']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//p[contains(text(),'Hand Sanitizer 100 mL ')])[1]")).click();

		Set<String> child = driver.getWindowHandles();

		List<String> prt = new ArrayList<>(child);

		driver.switchTo().window(prt.get(1));

		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}

}

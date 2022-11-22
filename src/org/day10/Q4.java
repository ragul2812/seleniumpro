
package org.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("heading303")).click();

		Thread.sleep(3000);

		WebElement clk = driver.findElement(By.xpath("(//a[text()=' DAY 10 TASK'])[1]"));
		
		clk.click();

		Set<String> child = driver.getWindowHandles();

		List<String> prt = new ArrayList<>(child);

		driver.switchTo().window(prt.get(1));

		//driver.findElement(By.xpath("//pre[contains(text(),'puropose')]"));
		
		
		
		

	}

}

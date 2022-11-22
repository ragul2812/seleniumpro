package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s1 = new Select(day);
		
		s1.selectByValue("5");
		
		List<WebElement> list = s1.getOptions();
		for (int i = 0; i < list.size(); i++) {
			
			if (i%2!=0) {
				WebElement prt = list.get(i);
				
				System.out.println(prt.getText());
				
			}
			
		}

	

}
}
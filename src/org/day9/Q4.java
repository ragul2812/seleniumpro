package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement click= driver.findElement(By.xpath("//a[text()='Create New Account']"));

		click.click();
		
		Thread.sleep(3000);
		
		WebElement mon = driver.findElement(By.id("month"));
		
		mon.click();
		
		Select s = new Select(mon);

		List<WebElement> list = s.getOptions();

		//System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
			WebElement prt = list.get(i);
			System.out.println(prt.getText());
			
		}
	
	
	
	
	
	
	
	
}

}

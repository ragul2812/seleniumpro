package ord.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/retail/login.htm");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		
		
		
	}

}

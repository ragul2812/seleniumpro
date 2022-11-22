package ord.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptops");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Hexa Core')])[1]")).click();
		
		Set<String> child = driver.getWindowHandles();

		List<String> prt = new ArrayList<>(child);

		driver.switchTo().window(prt.get(1));

		WebElement cost = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		System.out.println(cost.getText());
		
	}

}

package ord.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("masks");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),' 3 layered')]")).click();
		
		Set<String> child = driver.getWindowHandles();

		List<String> prt = new ArrayList<>(child);

		driver.switchTo().window(prt.get(1));
		
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("603204");
	}

}

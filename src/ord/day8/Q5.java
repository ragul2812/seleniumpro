package ord.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();

	}

}

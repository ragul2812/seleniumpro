package ord.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

		driver.manage().window().maximize();


		driver.switchTo().frame("login_page");
	
		WebElement fram = driver.findElement(By.xpath("//a[text()='CONTINUE']"));

		fram.click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();

	}

}

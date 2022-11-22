package ord.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumClassTask\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='DUMMY1']")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("123654789");
		
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("123321");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='Submit'])[1]")).click();
	}

}

package selenlium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInFb {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("0123456789");

		driver.findElement(By.id("pass")).sendKeys("xxxxxx");

		driver.findElement(By.id("u_0_l")).click();
		driver.close();
	}

}

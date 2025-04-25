package demopractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class datepickertest {

	@Test
	
	void datepick() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/datepicker");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	WebElement date = driver.findElement(By.id("datepicker"));
	
	Thread.sleep(3000);
	
	date.sendKeys("14/10/2024");
	
	date.sendKeys(Keys.RETURN);
	
	driver.quit();

	
}
}
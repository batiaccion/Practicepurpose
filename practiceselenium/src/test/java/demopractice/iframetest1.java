package demopractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframetest1 {


	@Test
	
	void frametest() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement frametop = driver.findElement(By.xpath("//iframe[@id='pact1']"));
	
	driver.switchTo().frame(frametop);
	
	driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("test");
	
	driver.quit();
	
	
	
}
}
package TestNGpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class alerttest {
	
	@Test
	
	public void alerttest1()
	{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoqa.com/alerts");	
	
	driver.manage().window().maximize();
	
	
	//driver.findElement(By.xpath("//span[text()='Alerts']")).click();
	
	Actions act =  new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//button[@id='confirmButton']"))).click().perform();
	
	//Alert a1 = driver.switchTo().alert();
	//a1.dismiss();
	
	//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	
	
}
}



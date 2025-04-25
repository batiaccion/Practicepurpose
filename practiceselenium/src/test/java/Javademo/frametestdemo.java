package Javademo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frametestdemo {

@Test
	
	public void frametest()
	{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");	
	
	driver.manage().window().maximize();
	
	WebElement frametop = driver.findElement(By.xpath("//frame[@src='/frame_top']"));
	
	driver.switchTo().frame(frametop);
	
	
	driver.switchTo().frame("frame-middle");
	
	WebElement element = driver.findElement(By.id("content"));
	
	System.out.println(element.getText());
	driver.switchTo().defaultContent();

	
}
}
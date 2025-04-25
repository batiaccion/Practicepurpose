package Javademo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frmestest {
	
@Test
	
	public void frametest()
	{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://the-internet.herokuapp.com/iframe");	
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("mce_0_ifr");
	
	driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
	driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("test");
	
	driver.quit();

}
}


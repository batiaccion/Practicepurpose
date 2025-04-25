package Javademo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	
@Test
	
	public void alerttest2() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://the-internet.herokuapp.com/add_remove_elements/");	
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement element = driver.findElement(By.xpath("//button[text()='Add Element']"));

	for(int i=0;i<=4; i++)
	{
		element.click();
		
	}

	Thread.sleep(3000);
	
	List<WebElement> deletebutton = driver.findElements(By.xpath("//button[text()='Delete']"));
	int len = deletebutton.size();
	
	System.out.println(len);
	
	for(int j=len-1;j>=0;j--)
	{
		deletebutton.remove(j);
	}
	
	
	
	driver.quit();
}
}

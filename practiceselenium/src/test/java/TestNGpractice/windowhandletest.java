package TestNGpractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class windowhandletest {

	
	@Test
	public void windowtest()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();//return ids of multiple browsers windows
		
		List<String> windowsidslist = new ArrayList(windowIds);
		
		//driver.getWindowHandle(); return id of the single browser window
		
		for(String winids:windowsidslist)
		{
			String titles = driver.switchTo().window(winids).getTitle();
			
			System.out.println("title of the pages:"+titles);
		}
		
		driver.quit();
		
	}
	
}

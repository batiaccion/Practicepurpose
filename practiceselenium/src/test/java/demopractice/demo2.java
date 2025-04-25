package demopractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2 {

	
	@Test
	public void adapt()
	{
		WebDriver driver =  new ChromeDriver();
		
		//driver.navigate().to("https://adactinhotelapp.com/");		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		boolean logo = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();

		if (logo == true) {
			System.out.println("logo is available");
			} else {
			System.out.println("logo is not available");
			}
	}
}

package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class submitform {
	
	@Test
	
	public void sform()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		webform wf = new webform();
		webform.formpage(driver);
		
		confirmpage cp = new confirmpage();
		
		confirmpage.confirpge(driver);
		
		assertEquals("The form was successfully submitted!", confirmpage.bannertext(driver));
		
		driver.quit();
		
	}

}

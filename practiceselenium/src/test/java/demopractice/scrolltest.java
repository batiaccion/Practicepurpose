package demopractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scrolltest {
	
	@Test
	
	void srolldowntest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement model_button = driver.findElement(By.id("modal-button"));
		
		model_button.click();
		
		Thread.sleep(1000);
		
		WebElement close_button = driver.findElement(By.id("close-button"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", close_button);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.accept();
		
//		name.sendKeys("Test");
//		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(name);
//		
//		WebElement date = driver.findElement(By.id("date"));
//		
//		date.sendKeys("01/01/2023");
		
		driver.quit();
		
	}

}

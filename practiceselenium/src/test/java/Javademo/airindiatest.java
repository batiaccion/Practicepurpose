package Javademo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class airindiatest {

@Test
public void airindiatest()
{
WebDriver driver =  new ChromeDriver();

driver.get("https://www.airindia.com/");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Actions act =  new Actions(driver);
act.moveToElement(driver.findElement(By.name("dpFromDate"))).click().perform();



}
}

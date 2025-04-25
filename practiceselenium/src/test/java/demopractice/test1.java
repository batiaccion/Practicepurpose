package demopractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String  text = driver.findElement(By.id("pah")).getText(); //gettext() to retrieve the text between the tags
		System.out.println(text);
		System.out.println("page title is" +driver.getTitle());
		String textonsearch = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("type");
					
		System.out.println(textonsearch);
		
		driver.quit();
	}

}

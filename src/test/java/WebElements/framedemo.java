package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/frame.xhtml");
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[1]/iframe"));
		
		//method
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		
		
		
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		//to come back to main window
		driver.switchTo().defaultContent();
		
		//to find number of frames ----->stored/return datatype as list<WebElements
		
		List<WebElement> no_of_frames = driver.findElements(By.tagName("iframe"));
		Thread.sleep(3000);
		System.out.println ( "number of frames" +no_of_frames.size());
		
	}

}

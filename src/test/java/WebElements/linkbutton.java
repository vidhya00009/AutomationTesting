package WebElements;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkbutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		//linktext
		
		WebElement link1 = driver.findElement(By.linkText("Images"));
		Actions act = new Actions(driver);
		act.moveToElement(link1);
		link1.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//partial-linktext
		
		WebElement link2 = driver.findElement(By.partialLinkText("mail"));
		link2.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		//movet-to-element ---->method
		/*
		 * WebElement link3 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[2]/h5"));
		 * 
		 * act.moveToElement(link3).build().perform(); act.contextClick();
		 * act.sendKeys(Keys.ESCAPE);
		 */
		
		
		//to find how many links----->save / store it in list
		List<WebElement> no_of_links = driver.findElements(By.tagName("a"));
		System.out.println("number of links : "+no_of_links.size());
				
		
	}

}

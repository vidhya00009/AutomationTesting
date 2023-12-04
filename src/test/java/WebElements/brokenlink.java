package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlink {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		WebElement link = driver.findElement(By.partialLinkText("Broken"));
		link.click();
		String titl1 = driver.getTitle();
		if(titl1.contains("404"))
		{
			System.out.println(" Broken link");
		}
		else {
			System.out.println("not a broken link");
		}

	}

}

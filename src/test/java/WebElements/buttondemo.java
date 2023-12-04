package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttondemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get ----> one way navigation
		//navigate method---->move both forward and backward
		//again comeback to button---->driver.navigate().back();
		
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		WebElement button_1 = driver.findElement(By.id("j_idt88:j_idt90"));
		button_1.click();
		String title = driver.getTitle();
		System.out.println("show me the title" +title);
		
		//to slow down process
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		WebElement checking = driver.findElement(By.id("j_idt88:j_idt90"));
		boolean status = checking.isEnabled();
		System.out.println("checking enabled or not....?" +status);
		
		WebElement measuring = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = measuring.getSize().getHeight();
		int width =measuring.getSize().getWidth();
		
		System.out.println("heidht is: " +height  +  "  width is:" +width);
		
		
		
	}

}

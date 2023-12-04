package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplebuttondemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/select-menu");
		//javascript to driver ---> type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
	
		WebElement dd1 = driver.findElement(By.id("cars"));
		dd1.click();
		Thread.sleep(3000);
		
		Select sel1 = new Select (dd1);
		boolean status =sel1.isMultiple();
		System.out.println("Is multiple....?"+status);
		sel1.selectByIndex(0);
		Thread.sleep(3000);
		sel1.deselectByVisibleText("Saab");
		sel1.selectByValue("Opel");
		
		sel1.deselectAll();
		
	}

}

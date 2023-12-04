package WebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		
		WebElement alertbtn1 = driver.findElement(By.id("j_idt88:j_idt91"));
		alertbtn1.click();
		Alert alert1 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert1.accept();
		
		WebElement alertbtn2 = driver.findElement(By.id("j_idt88:j_idt104"));
		alertbtn2.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("DANGEROUS ME");
		Thread.sleep(3000);
		alert2.accept();
		
		WebElement alertbtn3 = driver.findElement(By.id("j_idt88:j_idt93"));
		alertbtn3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();
		

	}

}

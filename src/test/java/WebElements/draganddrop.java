package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement ele1 = driver.findElement(By.id("column-a"));
		WebElement ele2 = driver.findElement(By.id("column-b"));
		
		//mouse actions
		
		Actions act = new Actions(driver);
		act.dragAndDrop(ele2, ele1).build().perform();
		Thread.sleep(3000);
		
		act.clickAndHold(ele2).release(ele1).build().perform();
		
		
	}

}

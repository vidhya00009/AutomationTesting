package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxtesting {

	public static void main(String[] args) {
		
		//initializing wendriver manager
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		// maxmize the window
		driver.manage().window().maximize();
		
		//inspecting web-element and searching for locator
		//WebElement is a datatype
		
		WebElement CB1 = driver.findElement(By.id("j_idt87:j_idt89"));
		CB1.click();
		
		WebElement ajax = driver.findElement(By.id("j_idt87:j_idt91"));
		ajax.click();
		
		WebElement toggle  = driver.findElement(By.id("j_idt87:j_idt100"));
		toggle.click();
		
		WebElement verify = driver.findElement(By.id("j_idt87:j_idt102"));
		boolean to_check_enabledornot = verify.isEnabled();
		System.out.println("Check the status:" +to_check_enabledornot);
		
		
	}

}

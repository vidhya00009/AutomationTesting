package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	public static void main(String[] args) {
	
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/radio.xhtml");
		WebElement radio_button_1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
		radio_button_1.click();
		
		WebElement default_button = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
		boolean status = default_button.isSelected();
		System.out.println("is selected or not...?" +status);
	}

}
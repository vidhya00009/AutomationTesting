package WebElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/select.xhtml");
		PageFactory.initElements(driver,DropDownRepository.class);
		//WebElement dd1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select")) ;
		DropDownRepository.dd1.click();
		//dd1.click();
		Thread.sleep(3000);
		
		//we can't use drop down directly --->using the "select tag" --->3 options select by value,select by index, select by visible text
		
		Select sel1 = new Select(DropDownRepository.dd1);
		sel1.selectByIndex(2);
		Thread.sleep(3000);
		
		sel1.selectByVisibleText("Cypress");
		
		DropDownRepository.dd1.sendKeys("S");//known as auto-complete
		

	}

}

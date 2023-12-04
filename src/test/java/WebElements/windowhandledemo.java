package WebElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandledemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		String parent_handle = driver.getWindowHandle();
		WebElement btn1 = driver.findElement(By.id("j_idt88:new"));
		btn1.click();
		Thread.sleep(3000);
		driver.switchTo().window(parent_handle);
		WebElement btn2 = driver.findElement(By.id("j_idt88:j_idt93"));
		btn2.click();
		
		Set<String> all_handles = driver.getWindowHandles();
		List<String> handles_list = new ArrayList<>(all_handles);
		System.out.println("umber of windows opened"+handles_list.size());
		for (String h : handles_list) {
			if (h.equals(parent_handle)) {
				continue;
				
			}else {
				driver.switchTo().window(h);
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		}
	}

package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenimgdemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/broken_images");
		
		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
		     if(img1.getAttribute("naturalWidth").equals("0"))
		       {
			System.out.println("images is broken");
			
		     } else {
			 System.out.println("images is not brokenn");
		    }

	}

}

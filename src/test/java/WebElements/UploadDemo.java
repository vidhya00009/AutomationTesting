package WebElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		WebElement Button1 = driver.findElement(By.xpath("//*[@id='pickfiles']"));
		Button1.click();
		Runtime.getRuntime().exec("C:\\Users\\New\\Documents\\upload.exe");

	}

}





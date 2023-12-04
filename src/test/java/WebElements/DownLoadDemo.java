package WebElements;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownLoadDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"content\"]"));
	
		link1.click();
		
		int flag =0;
		File file_loc = new File("C:\\Users\\New\\Downloads");
		File[] list_files = file_loc.listFiles();
		
		

		Thread.sleep(3000);
		for (File f: list_files) {
			System.out.println("File name ="+f.getName());
			if(f.getName().equals("download png.png"))
			{
				System.out.println("File Downloaded");
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("File not found");
		}
	}
}

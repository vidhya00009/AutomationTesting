package pageobjmodelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {
	WebDriver driver;
	@BeforeTest
	void init() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	@Test(priority = 1)
		void Login() throws InterruptedException {
			
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			PageFactory.initElements(driver,LoginRepoDemo.class);
			Thread.sleep(3000);
			
			LoginRepoDemo.uname.sendKeys("Admin");
			LoginRepoDemo.pwd.sendKeys("admin123");
			LoginRepoDemo.login_btn.click();
		}
	
	@Test(priority = 2)
	void dashboard_access() throws InterruptedException {
		Thread.sleep(3000);
		PageFactory.initElements(driver,DashBoardRep.class);
		DashBoardRep.Admin_Link.click();
	}
}


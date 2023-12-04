package DataDrivenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjmodelDemo.LoginRepoDemo;

public class Bothincorrect {

	WebDriver driver;
	@BeforeTest
	void init() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
}
	@Test(priority = 1)
	@Parameters({"uname", "pwd"})
	
	void Login(String uname1, String pwd1) throws InterruptedException {
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver,LoginRepoDemo.class);
		Thread.sleep(3000);
		
		LoginRepoDemo.uname.sendKeys(uname1);
		LoginRepoDemo.pwd.sendKeys(pwd1);
		LoginRepoDemo.login_btn.click();
	}

}


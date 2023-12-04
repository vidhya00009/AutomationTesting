package DataDrivenDemo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjmodelDemo.LoginRepoDemo;

public class UsingDataProvider {
	
	String[][] credentials = { 
			{"Admin", "admin123"},
			{"amin", "admi123"},
			{"Admin", "amin12"},
			{"adm", "admin123"}
	};
	@DataProvider(name = "Data1")
	String[][] return_credentials() {
		return credentials;
	}
	
	WebDriver driver;
	
    @Test(dataProvider = "Data1")
	void Login(String uname1, String pwd1) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver,LoginRepoDemo.class);
		Thread.sleep(3000);
		LoginRepoDemo.uname.sendKeys(uname1);
		LoginRepoDemo.pwd.sendKeys(pwd1);
		LoginRepoDemo.login_btn.click();
	}
    }

     package pageobjmodelDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRepoDemo {

		@FindBy (xpath = "//*[@name ='username']")
		public static WebElement uname;
		
		@FindBy (name = "password")
		public static WebElement pwd;
		
		@FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
		public static WebElement login_btn;
		
}

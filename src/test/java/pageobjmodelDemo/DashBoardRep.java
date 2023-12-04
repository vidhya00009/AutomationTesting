package pageobjmodelDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardRep {
	
	@FindBy(xpath = "//*[@class = \"oxd-main-menu-item\"]")
	public static WebElement Admin_Link;

}

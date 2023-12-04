package WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownRepository {
	
		@FindBy(xpath ="//*[@id=\\\"j_idt87\\\"]/div/div[1]/div[1]/div/div/select")
		public static WebElement dd1;  // i can able to call using the class name ....without creating the object
}

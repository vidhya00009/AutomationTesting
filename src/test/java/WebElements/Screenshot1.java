package WebElements;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Robot robot = new Robot();
		Dimension scr_size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(scr_size);
		BufferedImage scrshot = robot.createScreenCapture(rect);
		File dest = new File ("E//scrsht.png");
		ImageIO.write(scrshot, "png", dest);
		/*
		 TakesScreenshot sch;
		 sch = ((TakesScrrenshot)driver);
		 File src = sch.getScrrenshotAs(OutputType.FILE);
		 File dest = new File("E://scsht1.png");
		 FileHandler.copy(src,dest);
		 */
	}

}

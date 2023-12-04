package DataDrivenDemo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjmodelDemo.LoginRepoDemo;

public class UsingExcel {
	WebDriver driver;
	
	public class UsingDataProvider {
		
	String credentials[][];
	@DataProvider(name = "Data1")
	String[][] return_credentials() throws IOException {
	   return credentials = read_excel();
	}
	
	 	String[][] read_excel() throws IOException {
				
	 		    
	 		    String filepath = "DataDrivenDemoSelenium.xls";
				File file = new File(filepath);
				FileInputStream fis = new FileInputStream(file);
			    try (HSSFWorkbook wkbook = new HSSFWorkbook(fis)) {
					HSSFSheet sheet = wkbook.getSheet("Sheet1");
					
					int rowCount  = sheet.getLastRowNum()-sheet.getFirstRowNum();
					String[][] cred1 = new String[rowCount][2];
					System.out.println(rowCount);
					
					for (int i=1; i<rowCount+1; i++) {
						HSSFRow row = sheet.getRow(i);
						for(int j=0; j <row.getLastCellNum(); j++) {
						
						cred1[i-1][j] = row.getCell(j).getStringCellValue();
						System.out.println( cred1[i][j] +"||");
						}
					
					}
			    
	
	 	
	   return cred1;
	
}
	}
				

	 
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
}

	
	


	
		


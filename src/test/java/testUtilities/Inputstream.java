package testUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Inputstream {
	
	String path="C:\\Users\\DELL\\Desktop\\Inputstream.xlsx";
	WebDriver driver;
	@BeforeTest
	
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverToday.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://mylpg.pmpframe.com/login");
		Workbook workbook = null;
		
	}
	
	@Test
	
	public void test1() throws IOException {
		
		FileInputStream input=new FileInputStream(path);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet s=w.getSheetAt(0);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div[2]/input")).sendKeys();
	}
}

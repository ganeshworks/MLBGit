package transactions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class insugoo {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.findElement(By.xpath("//input[@placeholder='Mobile no./Email ID']")).sendKeys("8179170294");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//button[@id='#submitButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[1]/div[1]/button")).click();
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class=' css-19bb58m']")).click();
		  Thread.sleep(2000);
			WebElement ss = driver.findElement(By.xpath("//div[@class=' css-19bb58m']"));
			Select s = new Select(ss);
			s.selectByIndex(1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div[2]")).click();
			WebElement ss1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div[2]"));
			Select s1 = new Select(ss1);
			s.selectByIndex(1);
			Thread.sleep(2000);
			 WebElement fileInput = driver.findElement(By.xpath("//p[@class='chakra-text css-82y2th']"));

		        // Provide the path of the file to be uploaded
		        String filePath = "C:\\Users\\DELL\\Downloads\\pkpadmin,+1091-5090-1-CE.pdf";
		        fileInput.sendKeys(filePath);

	}

	@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver44.exe");
	  driver=new ChromeDriver();
	  driver.get("https://digi.pmpframe.com/");
	  driver.manage().window().maximize();
	  
  }

}

package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testPageObjects.*;

public class Tc_00_Registration extends BaseClass {

	@Test

	public void Registration() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Registration R = new Registration(driver);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[7]/div[2]")).click();
		
		R.Enteragencid(RandomInt+RandomInt.charAt(2));
		R.EnterDistrbnName("Test"+Randomstring.substring(3,5)+"Case");
		R.EnterMobile("76739193"+RandomInt.charAt(1)+RandomInt.charAt(2));
		R.EnterEmailid("test"+Randomstring.substring(2,6)+"@gmail.com");
		R.EnterGst("36AANFV21"+RandomInt.charAt(1)+RandomInt.charAt(1)+"Q1ZA");
		R.SelectState();
		R.Selectomctype();
		R.SelectFirmType();
		R.SelectRefillQuantity();
		R.SelectAnnualTurn();
		R.SelectPayroll();
		R.EnterPassword("Test@123");
		R.EnterConfPassword("Test@123");
		R.ClickOnCheck();
		
		
	}
}

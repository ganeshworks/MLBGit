package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver d) {
		driver=d;
		
	}
	By Agencyid=By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div[2]/input");
	By passwd=By.xpath("//*[@id=\"root\"]/div[1]/div/div[4]/div[2]/input");
	By Sbmit=By.xpath("//*[@id=\"root\"]/div[1]/div/div[6]/div");
	By Profileclck=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[1]/div/div[2]/div[2]/div/div");
	By Signout=By.xpath("/html/body/div/div[1]/div[3]/div[1]/div/div[2]/div[2]/div/div[2]/div[3]");
	By ClickonSignout=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/div/div[2]/div[2]/div[2]");
	
	
	
	public void AgencyId(String name) {
		driver.findElement(Agencyid).sendKeys(name);
	}
	
	public void password(String name) {
		driver.findElement(passwd).sendKeys(name);
	}
	
	public void submitclick() {
		driver.findElement(Sbmit).click();
	}
	
	public void ClickOnProfile() {
		driver.findElement(Profileclck).click();
	}
	public void ClickOnSinout() {
		driver.findElement(Signout).click();
	}
	public void ClickingOnSinout() {
		driver.findElement(ClickonSignout).click();
	}
}

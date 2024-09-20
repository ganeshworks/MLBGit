package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {


	WebDriver driver;
	
	public Registration(WebDriver d) {
		driver=d;
		
	}
	By AgencyId=By.xpath("//input[@placeholder='ENTER AGENCY ID']");
	By DistName=By.xpath("//input[@placeholder='DISTRIBUTORSHIP NAME']");
	By Delmbile=By.xpath("//input[@placeholder='DEALER MOBILE']");
	By Emailid=By.xpath("//input[@placeholder='EMAIL ID']");
	By Gst=By.xpath("//input[@placeholder='GSTIN']");
	By State=By.xpath("//div[5]//div[2]//select[1]");
	By Firmtype=By.xpath("//div[6]//div[1]//select[1]");
	By omctype=By.xpath("//div[6]//div[2]//select[1]");
	By Refillsale=By.xpath("//*[@id=\"root\"]/div[1]/div/div[7]/div/div[1]/div/select");
	By AnnualTurn=By.xpath("//div[8]//div[1]//select[1]");
	By Payroll=By.xpath("//div[8]//div[2]//select[1]");
	By Password=By.xpath("//input[@placeholder='PASSWORD']");
	By ConfrmPassword=By.xpath("//input[@placeholder='CONFIRM PASSWORD']");
	By Checkbox=By.xpath("//input[@type='checkbox']");
	By Regiter=By.xpath("//*[@id=\"root\"]/div[1]/div/div[11]/div");
	
	
	public void Enteragencid(String num) {
		driver.findElement(AgencyId).sendKeys(num);
	}
	public void EnterDistrbnName(String name) {
		driver.findElement(DistName).sendKeys(name);
	}
	public void EnterMobile(String num) {
		driver.findElement(Delmbile).sendKeys(num);
	}
	public void EnterEmailid(String name) {
		driver.findElement(Emailid).sendKeys(name);
	}
	public void EnterGst(String num) {
		driver.findElement(Gst).sendKeys(num);
	}
	public void SelectState() {
		driver.findElement(State).click();
		WebElement ss = driver.findElement(State);
		Select s = new Select(ss);
		s.selectByIndex(33);
	}
	public void SelectFirmType() {
		driver.findElement(Firmtype).click();
		WebElement ss = driver.findElement(Firmtype);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectomctype() {
		driver.findElement(omctype).click();
		WebElement ss = driver.findElement(omctype);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectRefillQuantity() {
		driver.findElement(Refillsale).click();
		WebElement ss = driver.findElement(Refillsale);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectAnnualTurn() {
		driver.findElement(AnnualTurn).click();
		WebElement ss = driver.findElement(AnnualTurn);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectPayroll() {
		driver.findElement(Payroll).click();
		WebElement ss = driver.findElement(Payroll);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterPassword(String name) {
		driver.findElement(Password).sendKeys(name);
	}
	public void EnterConfPassword(String name) {
		driver.findElement(ConfrmPassword).sendKeys(name);
	}
	public void ClickOnCheck() {
		driver.findElement(Checkbox).click();
	}
	public void ClickOnRegister() {
		driver.findElement(Regiter).click();
	}
	
	
	
}

package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Set_Alert {

	WebDriver driver;
	
	public  Set_Alert(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By SetAlertMaster=By.xpath("//div[contains(text(),'Set Alert')]");
	By Addbtn=By.xpath("//div[@class='btn btn-success']");
	By ItemDrp=By.xpath("//td[1]//div[1]//select[1]");
	By RefNo=By.xpath("//input[@value='NA']");
	By Date=By.xpath("//input[@type='date']");
	By RemindDrop=By.xpath("//td[4]//div[1]//select[1]");
	By Remarks=By.xpath("//input[@placeholder='Enter Remarks']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	By Delete=By.xpath("//tr[2]//td[6]");
	By ConfrmDelte=By.xpath("//div[normalize-space()='Delete']");
	
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonSetAlert() {
		driver.findElement(SetAlertMaster).click();
	}
	public void ClickonAdd() {
		driver.findElement(Addbtn).click();
	}
	public void SelectItem() {
		driver.findElement(ItemDrp).click();
		WebElement ss = driver.findElement(ItemDrp);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterRefNo(String num) {
		driver.findElement(RefNo).sendKeys(num);	
	}
	public void EnterDate(String date) {
		driver.findElement(Date).sendKeys(date);
	}
	public void SelectRemindDays() {
		driver.findElement(RemindDrop).click();
		WebElement ss = driver.findElement(RemindDrop);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterRemarks(String name) {
		driver.findElement(Remarks).sendKeys(name);	
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonDelete() {
		driver.findElement(Delete).click();
	}
	public void ClickonConfrmDelete() {
		driver.findElement(ConfrmDelte).click();
	}
	
}

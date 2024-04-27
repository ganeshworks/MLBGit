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
	By Remarks=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[5]/div/div/input");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	By Delete=By.xpath("//tr[2]//td[6]");
	By ConfrmDelte=By.xpath("//div[normalize-space()='Delete']");
	
	//2nd
	
	By ItemDrp2=By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By RefNo2=By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By Date2=By.xpath("//tr[3]//td[3]//div[1]//div[1]//input[1]");
	By RemindDrop2=By.xpath("//tr[3]//td[4]//div[1]//select[1]");
	By Remarks2=By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	
	//3rd
	
		By ItemDrp3=By.xpath("//tr[4]//td[1]//div[1]//select[1]");
		By RefNo3=By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
		By Date3=By.xpath("//tr[4]//td[3]//div[1]//div[1]//input[1]");
		By RemindDrop3=By.xpath("//tr[4]//td[4]//div[1]//select[1]");
		By Remarks3=By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
	
		//4th
		
		By ItemDrp4=By.xpath("//tr[5]//td[1]//div[1]//select[1]");
		By RefNo4=By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
		By Date4=By.xpath("//tr[5]//td[3]//div[1]//div[1]//input[1]");
		By RemindDrop4=By.xpath("//tr[5]//td[4]//div[1]//select[1]");
		By Remarks4=By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");
		
	
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
		s.selectByIndex(2);
	}
	public void EnterRefNo(String num) {
		driver.findElement(RefNo).clear();	
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
	
	public void SelectItem2() {
		driver.findElement(ItemDrp2).click();
		WebElement ss = driver.findElement(ItemDrp2);
		Select s=new Select(ss);
		s.selectByIndex(3);
	}
	public void EnterRefNo2(String num) {
		driver.findElement(RefNo2).clear();
		driver.findElement(RefNo2).sendKeys(num);	
	}
	public void EnterDate2(String date) {
		driver.findElement(Date2).sendKeys(date);
	}
	public void SelectRemindDays2() {
		driver.findElement(RemindDrop2).click();
		WebElement ss = driver.findElement(RemindDrop2);
		Select s=new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterRemarks2(String name) {
		driver.findElement(Remarks2).sendKeys(name);	
	}
	
	public void SelectItem3() {
		driver.findElement(ItemDrp3).click();
		WebElement ss = driver.findElement(ItemDrp3);
		Select s=new Select(ss);
		s.selectByIndex(4);
	}
	public void EnterRefNo3(String num) {
		driver.findElement(RefNo3).clear();
		driver.findElement(RefNo3).sendKeys(num);	
	}
	public void EnterDate3(String date) {
		driver.findElement(Date3).sendKeys(date);
	}
	public void SelectRemindDays3() {
		driver.findElement(RemindDrop3).click();
		WebElement ss = driver.findElement(RemindDrop3);
		Select s=new Select(ss);
		s.selectByIndex(3);
	}
	public void EnterRemarks3(String name) {
		driver.findElement(Remarks3).sendKeys(name);	
	}

	public void SelectItem4() {
		driver.findElement(ItemDrp4).click();
		WebElement ss = driver.findElement(ItemDrp4);
		Select s=new Select(ss);
		s.selectByIndex(4);
	}
	public void EnterRefNo4(String num) {
		driver.findElement(RefNo4).clear();
		driver.findElement(RefNo4).sendKeys(num);	
	}
	public void EnterDate4(String date) {
		driver.findElement(Date4).sendKeys(date);
	}
	public void SelectRemindDays4() {
		driver.findElement(RemindDrop4).click();
		WebElement ss = driver.findElement(RemindDrop4);
		Select s=new Select(ss);
		s.selectByIndex(3);
	}
	public void EnterRemarks4(String name) {
		driver.findElement(Remarks4).sendKeys(name);	
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

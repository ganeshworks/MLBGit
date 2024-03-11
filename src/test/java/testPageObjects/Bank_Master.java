package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Bank_Master {

	WebDriver driver;
	
	public  Bank_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By bankMaster=By.xpath("//div[contains(text(),'Bank Master')]");
	By EnterPin=By.xpath("//input[contains(@placeholder,'Enter Pin Here')]");
	By SubmitPin=By.xpath("//div[contains(text(),'SUBMIT')]");
	By AddBtn=By.xpath("//div[@class='btn btn-success']");
	By NickName=By.xpath("//input[@placeholder='NICK NAME']");
	By bankList=By.xpath("//td[2]//div[1]//select[1]");
	By typeOfAccount=By.xpath("//td[3]//div[1]//select[1]");
	By AccNum=By.xpath("//input[contains(@placeholder,'ACCOUNT NUMBER')]");
	By Accbranch=By.xpath("//input[@placeholder='BRANCH']");
	By Ifsc=By.xpath("//input[@placeholder='IFSC CODE']");
	By Addres=By.xpath("//input[@placeholder='ADDRESS']");
	By OpBlnce=By.xpath("//input[@placeholder='OPENING BALANCE']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	By DrpDown=By.xpath("//select[contains(@class,'AO-2nd-ent-select')]");
	
	By Deletebank=By.xpath("//tr[5]//td[11]");
	
	By EditData=By.xpath("//p[normalize-space()='AKOLA JANATA COMMERCIAL COOPERATIVE BANK']");
	By Branch=By.xpath("//input[contains(@value,'rdcfgffgdgfd')]");
	By IfscCode=By.xpath("//input[@value='SBIN0000000']");
	By AddressEdit=By.xpath("//input[@value='yusfdzgyasudygyausgduygay']");
	By EditCRedLimit=By.xpath("//input[@placeholder='CREDIT LIMIT']");
	By SaveEdit=By.xpath("//div[@class='Modal_modalHeader__+kCAr']//div[@role='button'][normalize-space()='SAVE']");
	
	
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonBankmaster() {
		driver.findElement(bankMaster).click();
	}
	public void EnterSecretPin(String num) {
		driver.findElement(EnterPin).sendKeys(num);	
	}
	public void ClickonSubmitPin() {
		driver.findElement(SubmitPin).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterNickName(String name) {
		driver.findElement(NickName).sendKeys(name);	
	}
	public void BankListSelect() {
		driver.findElement(bankList).click();
		WebElement ss = driver.findElement(bankList);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void BankTypeSelect() {
		driver.findElement(typeOfAccount).click();
		WebElement ss = driver.findElement(typeOfAccount);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterAccNum(String num) {
		driver.findElement(AccNum).sendKeys(num);	
	}
	public void EnterAccBrnach(String name) {
		driver.findElement(Accbranch).sendKeys(name);	
	}
	public void EnterIfsc(String num) {
		driver.findElement(Ifsc).sendKeys(num);	
	}
	public void EnterAddress(String name) {
		driver.findElement(Addres).sendKeys(name);	
	}
	public void EnterOpBlnce(String num) {
		driver.findElement(OpBlnce).sendKeys(num);	
	}
	public void ClickOnSave() {
		driver.findElement(Save).click();
	}
	
	public void Dropdown() {
		driver.findElement(DrpDown).click();
		WebElement ss = driver.findElement(DrpDown);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickonEditBank() {
		driver.findElement(EditData).click();
	}
	public void EditBranch(String name) {
		driver.findElement(Branch).clear();	
		driver.findElement(Branch).sendKeys(name);	
	}
	public void EditIfsc(String num) {
		driver.findElement(IfscCode).clear();	
		driver.findElement(IfscCode).sendKeys(num);	
	}
	public void EditAddress(String name) {
		driver.findElement(AddressEdit).clear();	
		driver.findElement(AddressEdit).sendKeys(name);	
	}
	public void EditCLimit(String num) {
		driver.findElement(EditCRedLimit).clear();	
		driver.findElement(EditCRedLimit).sendKeys(num);	
	}
	public void ClickOnEditSave() {
		driver.findElement(SaveEdit).click();
	}
	
	
}

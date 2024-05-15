package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Staff_Master {

	WebDriver driver;

	public Staff_Master(WebDriver d) {
		driver = d;
	}

	By MasterClick = By.xpath("//div[contains(text(),'Master Data')]");
	By StaffMaster = By.xpath("//div[contains(text(),'Staff Master')]");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By EMPcode = By.xpath("//input[@placeholder='EMPLOYEE CODE']");
	By Empname = By.xpath("//input[@placeholder='EMPLOYEE NAME']");
	By Dob = By.xpath("//td[3]//div[1]//div[1]//input[1]");
	By EmpDesg = By.xpath("//input[contains(@placeholder,'EMPLOYEE DESIGNATION')]");
	By Role = By.xpath("//select[@class='drop-select']");
	By Doj = By.xpath("//td[6]//div[1]//div[1]//input[1]");
	By Save = By.xpath("//div[normalize-space()='SAVE']");
	By DownExcel = By.xpath("//div[normalize-space()='DOWNLOAD EXCEL']");
	By UpExcel = By.xpath("//div[normalize-space()='UPLOAD EXCEL']");
	By BackButton = By.xpath("//div[contains(@class,'btn btn-info')]");
	By Delete = By.xpath("//div[contains(@class,'layout-body')]//div[3]//div[1]//table[1]//tr[2]//td[6]");
	By ConfrmDelete = By.xpath("//div[normalize-space()='Delete']");
	By EditEmp = By.xpath("//td[normalize-space()='@##$%%']");
	By Aadhar = By.xpath("//input[contains(@placeholder,'AADHAR NUMBER')]");
	By Pan = By.xpath("//input[@placeholder='PAN NUMBER']");
	By BankAcc = By.xpath("//input[@placeholder='BANK ACCOUNT']");
	By Contact = By.xpath("//input[@placeholder='CONTACT NUMBER']");
	By uan = By.xpath("//input[@placeholder='UAN NUMBER']");
	By BldGrp = By.xpath("//div[@class='credit-limit']//div//div//select[@class='drop-select']");
	By EmNumber = By.xpath("//input[@placeholder='EMERGENCY NUMBER']");
	By Email = By.xpath("//input[@placeholder='EMAIL ID']");
	By Address = By.xpath("//input[@placeholder='ADDRESS']");
	By EsicCheck = By.xpath("//div[@class='Modal_modalContent__rRYZG']//div//div[1]//span[2]//input[1]");
	By EsicNum = By.xpath("//input[contains(@placeholder,'ESIC NUMBER')]");
	By PfCheck = By.xpath("//div[contains(@class,'credit-limit')]//div[2]//span[2]//input[1]");
	By pfNum = By.xpath("//input[@placeholder='PF NUMBER']");
	By EditSave = By.xpath(
			"//div[contains(@class,'Modal_modalContent__rRYZG')]//div//div//div[contains(@role,'button')][normalize-space()='SAVE']");

	// 2nd

	By EMPcode2 = By.xpath("//tr[3]//td[1]//div[1]//div[1]//input[1]");
	By Empname2 = By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By Dob2 = By.xpath("//tr[3]//td[3]//div[1]//div[1]//input[1]");
	By EmpDesg2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By Role2 = By.xpath("//tr[3]//td[5]//div[1]//select[1]");
	By Doj2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");

	// 3rd

	By EMPcode3 = By.xpath("//tr[4]//td[1]//div[1]//div[1]//input[1]");
	By Empname3 = By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
	By Dob3 = By.xpath("//tr[4]//td[3]//div[1]//div[1]//input[1]");
	By EmpDesg3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By Role3 = By.xpath("//tr[4]//td[5]//div[1]//select[1]");
	By Doj3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");

	// 4th

	By EMPcode4 = By.xpath("//tr[5]//td[1]//div[1]//div[1]//input[1]");
	By Empname4 = By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
	By Dob4 = By.xpath("//tr[5]//td[3]//div[1]//div[1]//input[1]");
	By EmpDesg4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By Role4 = By.xpath("//tr[5]//td[5]//div[1]//select[1]");
	By Doj4 = By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");

	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}

	public void ClickonStaffmaster() {
		driver.findElement(StaffMaster).click();
	}

	public void ClickonAdd() {
		driver.findElement(AddBtn).click();
	}

	public void EnterEmpCode(String name) {
		driver.findElement(EMPcode).sendKeys(name);
	}

	public void EnterEmpName(String name) {
		driver.findElement(Empname).sendKeys(name);
	}

	public void EnterDob(String num) {
		driver.findElement(Dob).sendKeys(num);
	}

	public void EnterDesignation(String name) {
		driver.findElement(EmpDesg).sendKeys(name);
	}

	public void SelectRole() {
		driver.findElement(Role).click();
		WebElement ss = driver.findElement(Role);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterDoj(String num) {
		driver.findElement(Doj).sendKeys(num);
	}
	
	public void EnterEmpCode2(String name) {
		driver.findElement(EMPcode2).sendKeys(name);
	}

	public void EnterEmpName2(String name) {
		driver.findElement(Empname2).sendKeys(name);
	}

	public void EnterDob2(String num) {
		driver.findElement(Dob2).sendKeys(num);
	}

	public void EnterDesignation2(String name) {
		driver.findElement(EmpDesg2).sendKeys(name);
	}

	public void SelectRole2() {
		driver.findElement(Role2).click();
		WebElement ss = driver.findElement(Role2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterDoj2(String num) {
		driver.findElement(Doj2).sendKeys(num);
	}

	public void EnterEmpCode3(String name) {
		driver.findElement(EMPcode3).sendKeys(name);
	}

	public void EnterEmpName3(String name) {
		driver.findElement(Empname3).sendKeys(name);
	}

	public void EnterDob3(String num) {
		driver.findElement(Dob3).sendKeys(num);
	}

	public void EnterDesignation3(String name) {
		driver.findElement(EmpDesg3).sendKeys(name);
	}

	public void SelectRole3() {
		driver.findElement(Role3).click();
		WebElement ss = driver.findElement(Role3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}

	public void EnterDoj3(String num) {
		driver.findElement(Doj3).sendKeys(num);
	}
	
	public void EnterEmpCode4(String name) {
		driver.findElement(EMPcode4).sendKeys(name);
	}

	public void EnterEmpName4(String name) {
		driver.findElement(Empname4).sendKeys(name);
	}

	public void EnterDob4(String num) {
		driver.findElement(Dob4).sendKeys(num);
	}

	public void EnterDesignation4(String name) {
		driver.findElement(EmpDesg4).sendKeys(name);
	}

	public void SelectRole4() {
		driver.findElement(Role4).click();
		WebElement ss = driver.findElement(Role4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}

	public void EnterDoj4(String num) {
		driver.findElement(Doj4).sendKeys(num);
	}
	
	public void ClickonSave() {
		driver.findElement(Save).click();
	}

	public void ClickonDelete() {
		driver.findElement(Delete).click();
	}

	public void ClickonConfrmDelete() {
		driver.findElement(ConfrmDelete).click();
	}

	public void EditEmployee() {
		driver.findElement(EditEmp).click();
	}

	public void EnterAadhar(String name) {
		driver.findElement(Aadhar).sendKeys(name);
	}

	public void EnterPan(String name) {
		driver.findElement(Pan).sendKeys(name);
	}

	public void EnterBankacc(String num) {
		driver.findElement(BankAcc).sendKeys(num);
	}

	public void EnterContact(String num) {
		driver.findElement(Contact).sendKeys(num);
	}

	public void EnterUan(String num) {
		driver.findElement(uan).sendKeys(num);
	}

	public void SelectBloodGrp() {
		driver.findElement(BldGrp).click();
		WebElement ss = driver.findElement(BldGrp);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterEmeNum(String num) {
		driver.findElement(EmNumber).sendKeys(num);
	}

	public void EnterEmail(String name) {
		driver.findElement(Email).sendKeys(name);
	}

	public void EnterAddress(String name) {
		driver.findElement(Address).sendKeys(name);
	}

	public void ClickonEsicheck() {
		driver.findElement(EsicCheck).click();
	}

	public void EnterEsic(String name) {
		driver.findElement(EsicNum).sendKeys(name);
	}

	public void ClickonPfcheck() {
		driver.findElement(PfCheck).click();
	}

	public void EnterPf(String name) {
		driver.findElement(PfCheck).sendKeys(name);
	}

	public void EditSave() {
		driver.findElement(EditSave).click();
	}
}

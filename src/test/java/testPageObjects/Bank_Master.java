package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Bank_Master {

	WebDriver driver;

	public Bank_Master(WebDriver d) {
		driver = d;
	}

	By MasterClick = By.xpath("//div[contains(text(),'Master Data')]");
	By bankMaster = By.xpath("//div[contains(text(),'Bank Master')]");
	By EnterPin = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div/div[1]/div[1]/div/div/div/input");
	By SubmitPin = By.xpath("//div[contains(text(),'SUBMIT')]");
	By AddBtn = By.xpath("//div[@class='btn btn-success']");
	By NickName = By.xpath("//input[@placeholder='NICK NAME']");
	By bankList = By.xpath("//td[2]//div[1]//select[1]");
	By typeOfAccount = By.xpath("//td[3]//div[1]//select[1]");
	By AccNum = By.xpath("//input[contains(@placeholder,'ACCOUNT NUMBER')]");
	By Accbranch = By.xpath("//input[@placeholder='BRANCH']");
	By Ifsc = By.xpath("//input[@placeholder='IFSC CODE']");
	By Addres = By.xpath("//input[@placeholder='ADDRESS']");
	By OpBlnce = By.xpath("//input[@placeholder='OPENING BALANCE']");
	By Save = By.xpath("//div[normalize-space()='SAVE']");

	By DrpDown = By.xpath("//select[contains(@class,'AO-2nd-ent-select')]");

	By Deletebank = By.xpath("//tr[5]//td[11]");

	By EditData = By.xpath("//p[normalize-space()='AKOLA JANATA COMMERCIAL COOPERATIVE BANK']");
	By Branch = By.xpath("//input[contains(@value,'rdcfgffgdgfd')]");
	By IfscCode = By.xpath("//input[@value='SBIN0000000']");
	By AddressEdit = By.xpath("//input[@value='yusfdzgyasudygyausgduygay']");
	By EditCRedLimit = By.xpath("//input[@placeholder='CREDIT LIMIT']");
	By SaveEdit = By.xpath("//div[@class='Modal_modalHeader__+kCAr']//div[@role='button'][normalize-space()='SAVE']");

	// 2nd bank

	By Nicknme2 = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/table[1]/tr[3]/td[1]/div[1]/div[2]/input[1]");
	By Bankname2 = By.xpath("//tr[3]//td[2]//div[1]//select[1]");
	By AccType2 = By.xpath("//tr[3]//td[3]//div[1]//select[1]");
	By Acc2 = By.xpath("//tr[3]//td[4]//div[1]//div[2]//input[1]");
	By Branch2 = By.xpath("//tr[3]//td[5]//div[1]//div[2]//input[1]");
	By Ifsc2 = By.xpath("//tr[3]//td[6]//div[1]//div[2]//input[1]");
	By Addrs2 = By.xpath("//tr[3]//td[7]//div[1]//div[2]//input[1]");
	By OpeBlance2 = By
			.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[3]/td[8]/div/div[2]/input");

	// 3rd Bank

	By Nicknme3 = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/table[1]/tr[4]/td[1]/div[1]/div[2]/input[1]");
	By Bankname3 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
	By AccType3 = By.xpath("//tr[4]//td[3]//div[1]//select[1]");
	By Acc3 = By.xpath("//tr[4]//td[4]//div[1]//div[2]//input[1]");
	By Branch3 = By.xpath("//tr[4]//td[5]//div[1]//div[2]//input[1]");
	By Ifsc3 = By.xpath("//tr[4]//td[6]//div[1]//div[2]//input[1]");
	By Addrs3 = By.xpath("//tr[4]//td[7]//div[1]//div[2]//input[1]");
	By OpeBlance3 = By
			.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[4]/td[8]/div/div[2]/input");

	// 4th Bank

	By Nicknme4 = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/table[1]/tr[5]/td[1]/div[1]/div[2]/input[1]");
	By Bankname4 = By.xpath("//tr[5]//td[2]//div[1]//select[1]");
	By AccType4 = By.xpath("//tr[5]//td[3]//div[1]//select[1]");
	By Acc4 = By.xpath("//tr[5]//td[4]//div[1]//div[2]//input[1]");
	By Branch4 = By.xpath("//tr[5]//td[5]//div[1]//div[2]//input[1]");
	By Ifsc4 = By.xpath("//tr[5]//td[6]//div[1]//div[2]//input[1]");
	By Addrs4 = By.xpath("//tr[5]//td[7]//div[1]//div[2]//input[1]");
	By OpeBlance4 = By
			.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[5]/td[8]/div/div[2]/input");

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
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void BankTypeSelect() {
		driver.findElement(typeOfAccount).click();
		WebElement ss = driver.findElement(typeOfAccount);
		Select s = new Select(ss);
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
		driver.findElement(OpBlnce).clear();
		driver.findElement(OpBlnce).sendKeys(num);
	}

	// 2nd

	public void EnterNickName2(String name) {
		driver.findElement(Nicknme2).sendKeys(name);
	}

	public void BankListSelect2() {
		driver.findElement(Bankname2).click();
		WebElement ss = driver.findElement(Bankname2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void BankTypeSelect2() {
		driver.findElement(AccType2).click();
		WebElement ss = driver.findElement(AccType2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterAccNum2(String num) {
		driver.findElement(Acc2).sendKeys(num);
	}

	public void EnterAccBrnach2(String name) {
		driver.findElement(Branch2).sendKeys(name);
	}

	public void EnterIfsc2(String num) {
		driver.findElement(Ifsc2).sendKeys(num);
	}

	public void EnterAddress2(String name) {
		driver.findElement(Addrs2).sendKeys(name);
	}

	public void EnterOpBlnce2(String num) {
		driver.findElement(OpeBlance2).clear();
		driver.findElement(OpeBlance2).sendKeys(num);
	}

	// 3rd

	public void EnterNickName3(String name) {
		driver.findElement(Nicknme3).sendKeys(name);
	}

	public void BankListSelect3() {
		driver.findElement(Bankname3).click();
		WebElement ss = driver.findElement(Bankname3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void BankTypeSelect3() {
		driver.findElement(AccType3).click();
		WebElement ss = driver.findElement(AccType3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterAccNum3(String num) {
		driver.findElement(Acc3).sendKeys(num);
	}

	public void EnterAccBrnach3(String name) {
		driver.findElement(Branch3).sendKeys(name);
	}

	public void EnterIfsc3(String num) {
		driver.findElement(Ifsc3).sendKeys(num);
	}

	public void EnterAddress3(String name) {
		driver.findElement(Addrs3).sendKeys(name);
	}

	public void EnterOpBlnce3(String num) {
		driver.findElement(OpeBlance3).clear();
		driver.findElement(OpeBlance3).sendKeys(num);
	}

	// 4th

	public void EnterNickName4(String name) {
		driver.findElement(Nicknme4).sendKeys(name);
	}

	public void BankListSelect4() {
		driver.findElement(Bankname4).click();
		WebElement ss = driver.findElement(Bankname4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void BankTypeSelect4() {
		driver.findElement(AccType4).click();
		WebElement ss = driver.findElement(AccType4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterAccNum4(String num) {
		driver.findElement(Acc4).sendKeys(num);
	}

	public void EnterAccBrnach4(String name) {
		driver.findElement(Branch4).sendKeys(name);
	}

	public void EnterIfsc4(String num) {
		driver.findElement(Ifsc4).sendKeys(num);
	}

	public void EnterAddress4(String name) {
		driver.findElement(Addrs4).sendKeys(name);
	}

	public void EnterOpBlnce4(String num) {
		driver.findElement(OpeBlance4).clear();
		driver.findElement(OpeBlance4).sendKeys(num);
	}

	public void ClickOnSave() {
		driver.findElement(Save).click();
	}

	public void Dropdown() {
		driver.findElement(DrpDown).click();
		WebElement ss = driver.findElement(DrpDown);
		Select s = new Select(ss);
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

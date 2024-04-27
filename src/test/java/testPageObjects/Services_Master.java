package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Services_Master {

	WebDriver driver;

	public Services_Master(WebDriver d) {
		driver = d;
	}

	By MasterClick = By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick = By.xpath("//div[contains(text(),'Product Master')]");
	By Servicesmster = By.xpath("//div[contains(text(),'Services Master')]");
	By Dropdwn = By.xpath("//select[@class='drop-select']");
	By SelectDrp = By
			.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/select/option[3]");
	By Submtbtn = By.xpath("//div[contains(text(),'SUBMIT')]");

	By Addbutton = By.xpath("//div[@class='flex aic jcsb gap10']//div[1]");
	By ServiceName = By.xpath("//input[@placeholder='SERVICE NAME']");
	By SACCode = By.xpath("//input[@placeholder='SAC CODE']");
	By Dropdown = By.xpath("//td[3]//div[1]//select[1]");
	By Charges = By.xpath("//input[@placeholder='CHARGES']");
	By GstDrpdown = By.xpath("//td[5]//div[1]//select[1]");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By EffDate = By.xpath("//input[@type='date']");
	By SaveButton = By.xpath("//div[normalize-space()='SAVE']");
	By Deleteservice = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[7]");
	By ConfmDelete = By.xpath("//div[normalize-space()='Delete']");

	By EditService = By.xpath("//td[normalize-space()='Qatest']");
	By EditServiceName = By.xpath("//input[contains(@value,'Qatest')]");
	By EditSACCode = By.xpath("//input[@placeholder='SAC CODE']");
	By EditUom = By.xpath("//div[@class='layout-body']//div[3]//div[1]//select[1]");
	By EditCharges = By.xpath("//input[contains(@placeholder,'CHARGES')]");
	By EditGst = By.xpath("//div[5]//div[1]//select[1]");
	By CalculateEdit = By.xpath("//div[normalize-space()='CALCULATE']");
	By SaveEdit = By.xpath("//div[normalize-space()='SAVE']");

	// For 2nd Add
	By ServiceName2 = By.xpath("//tr[3]//td[1]//div[1]//div[1]//input[1]");
	By SACCode2 = By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By Dropdown2 = By.xpath("//tr[3]//td[3]//div[1]//select[1]");
	By Charges2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By GstDrpdown2 = By.xpath("//tr[3]//td[5]//div[1]//select[1]");
	By Calculate2 = By.xpath("//div[normalize-space()='CALCULATE']");
	By EffDate2 = By.xpath("//tr[3]//td[8]//div[1]//div[1]//input[1]");

	// For 3rd Add
	By ServiceName3 = By.xpath("//tr[4]//td[1]//div[1]//div[1]//input[1]");
	By SACCode3 = By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
	By Dropdown3 = By.xpath("//tr[4]//td[3]//div[1]//select[1]");
	By Charges3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By GstDrpdown3 = By.xpath("//tr[4]//td[5]//div[1]//select[1]");
	By Calculate3 = By.xpath("//div[normalize-space()='CALCULATE']");
	By EffDate3 = By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
	// For 4th Add
	By ServiceName4 = By.xpath("//tr[5]//td[1]//div[1]//div[1]//input[1]");
	By SACCode4 = By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
	By Dropdown4 = By.xpath("//tr[5]//td[3]//div[1]//select[1]");
	By Charges4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By GstDrpdown4 = By.xpath("//tr[5]//td[5]//div[1]//select[1]");
	By Calculate4 = By.xpath("//div[normalize-space()='CALCULATE']");
	By EffDate4 = By.xpath("//tr[5]//td[8]//div[1]//div[1]//input[1]");

	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}

	public void ClickonProductmaster() {
		driver.findElement(ProductClick).click();
	}

	public void ClickOnServiceMaster() {
		driver.findElement(Servicesmster).click();
	}

	public void dropdownselect() {
		driver.findElement(Dropdwn).click();
		WebElement ss = driver.findElement(Dropdwn);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}

	public void ClickOnSubmit() {
		driver.findElement(Submtbtn).click();
	}

	public void ClickOnAdd() {
		driver.findElement(Addbutton).click();
	}

	public void SetServiceName(String name) {
		driver.findElement(ServiceName).sendKeys(name);
	}

	public void SetServiceName2(String name) {
		driver.findElement(ServiceName2).sendKeys(name);
	}

	public void SetServiceName3(String name) {
		driver.findElement(ServiceName3).sendKeys(name);
	}
	public void SetServiceName4(String name) {
		driver.findElement(ServiceName4).sendKeys(name);
	}
	public void SetSACCode(String name) {
		driver.findElement(SACCode).sendKeys(name);
	}
	public void SetSACCode2(String name) {
		driver.findElement(SACCode2).sendKeys(name);
	}
	public void SetSACCode3(String name) {
		driver.findElement(SACCode3).sendKeys(name);
	}
	public void SetSACCode4(String name) {
		driver.findElement(SACCode4).sendKeys(name);
		;
	}

	public void dropdownUOM() {
		driver.findElement(Dropdown).click();
		WebElement ss = driver.findElement(Dropdown);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void dropdownUOM2() {
		driver.findElement(Dropdown2).click();
		WebElement ss = driver.findElement(Dropdown2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void dropdownUOM3() {
		driver.findElement(Dropdown3).click();
		WebElement ss = driver.findElement(Dropdown3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void dropdownUOM4() {
		driver.findElement(Dropdown4).click();
		WebElement ss = driver.findElement(Dropdown4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SetCharges(String name) {
		driver.findElement(Charges).clear();
		driver.findElement(Charges).sendKeys(name);
	}
	public void SetCharges2(String name) {
		driver.findElement(Charges2).clear();
		driver.findElement(Charges2).sendKeys(name);
	}
	public void SetCharges3(String name) {
		driver.findElement(Charges3).clear();
		driver.findElement(Charges3).sendKeys(name);
	}
	public void SetCharges4(String name) {
		driver.findElement(Charges4).clear();
		driver.findElement(Charges4).sendKeys(name);
	}
	public void dropdownGST() {
		driver.findElement(GstDrpdown).click();
		WebElement ss = driver.findElement(GstDrpdown);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void dropdownGST2() {
		driver.findElement(GstDrpdown2).click();
		WebElement ss = driver.findElement(GstDrpdown2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void dropdownGST3() {
		driver.findElement(GstDrpdown3).click();
		WebElement ss = driver.findElement(GstDrpdown3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void dropdownGST4() {
		driver.findElement(GstDrpdown4).click();
		WebElement ss = driver.findElement(GstDrpdown4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void ClickOnCalculate() {
		driver.findElement(Calculate).click();
	}

	public void SetDate(String name) {
		driver.findElement(EffDate).sendKeys(name);
	}
	public void SetDate2(String name) {
		driver.findElement(EffDate2).sendKeys(name);
	}
	public void SetDate3(String name) {
		driver.findElement(EffDate3).sendKeys(name);
	}
	public void SetDate4(String name) {
		driver.findElement(EffDate4).sendKeys(name);
	}
	public void ClickOnSaveButton() {
		driver.findElement(SaveButton).click();
	}

	public void DeleteService() {
		driver.findElement(Deleteservice).click();
	}

	public void ConfrmDeleteService() {
		driver.findElement(ConfmDelete).click();
	}

	public void EditServices() {
		driver.findElement(EditService).click();
	}

	public void EditServiceNames(String name) {
		driver.findElement(EditServiceName).clear();
		driver.findElement(EditServiceName).sendKeys(name);
	}

	public void EditSACCODE(String num) {
		driver.findElement(EditSACCode).clear();
		driver.findElement(EditSACCode).sendKeys(num);
	}

	public void EditDropdownUOM() {
		driver.findElement(EditUom).click();
		WebElement ss = driver.findElement(EditUom);
		Select s = new Select(ss);
		s.selectByIndex(5);
	}

	public void EditCharge(String name) {
		driver.findElement(EditCharges).clear();
		driver.findElement(EditCharges).sendKeys(name);
	}

	public void EditGst() {
		driver.findElement(EditGst).click();
		WebElement ss = driver.findElement(EditGst);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}

	public void ClickCalculateEdit() {
		driver.findElement(CalculateEdit).click();
	}

	public void ClickOnEditSaveButton() {
		driver.findElement(SaveEdit).click();
	}
}

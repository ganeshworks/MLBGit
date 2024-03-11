package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Services_Master {

	WebDriver driver;
	
	public  Services_Master(WebDriver d) {
		driver=d;
	}
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick=By.xpath("//div[contains(text(),'Product Master')]");
	By Servicesmster=By.xpath("//div[contains(text(),'Services Master')]");
	By Dropdwn=By.xpath("//select[@class='drop-select']");
	By SelectDrp=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/select/option[3]");
	By Submtbtn=By.xpath("//div[contains(text(),'SUBMIT')]");
	
	By Addbutton=By.xpath("//div[@class='flex aic jcsb gap10']//div[1]");
	By ServiceName=By.xpath("//input[@placeholder='SERVICE NAME']");
	By SACCode=By.xpath("//input[@placeholder='SAC CODE']");
	By Dropdown=By.xpath("//td[3]//div[1]//select[1]");
	By Charges=By.xpath("//input[@placeholder='CHARGES']");
	By GstDrpdown=By.xpath("//td[5]//div[1]//select[1]");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By EffDate=By.xpath("//input[@type='date']");
	By SaveButton=By.xpath("//div[normalize-space()='SAVE']");
	By Deleteservice=By.xpath("//tr[2]//td[7]");
	By ConfmDelete=By.xpath("//div[normalize-space()='Delete']");
	
	By EditService=By.xpath("//td[normalize-space()='Qatest']");
	By EditServiceName=By.xpath("//input[contains(@value,'Qatest')]");
	By EditSACCode=By.xpath("//input[@placeholder='SAC CODE']");
	By EditUom=By.xpath("//div[@class='layout-body']//div[3]//div[1]//select[1]");
	By EditCharges=By.xpath("//input[contains(@placeholder,'CHARGES')]");
	By EditGst=By.xpath("//div[5]//div[1]//select[1]");
	By CalculateEdit=By.xpath("//div[normalize-space()='CALCULATE']");
	By SaveEdit=By.xpath("//div[normalize-space()='SAVE']");
	
	
	
	
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
		Select s=new Select(ss);
		s.selectByIndex(2);
	}
	public void ClickOnSubmit() {
		driver.findElement(Submtbtn).click();
	}
	
	public void ClickOnAdd() {
		driver.findElement(Addbutton).click();
	}
	public void SetServiceName(String name) {
		driver.findElement(ServiceName).sendKeys(name);;
	}
	public void SetSACCode(String name) {
		driver.findElement(SACCode).sendKeys(name);;
	}
	public void dropdownUOM() {
		driver.findElement(Dropdown).click();
		WebElement ss = driver.findElement(Dropdown);
		Select s=new Select(ss);
		s.selectByIndex(2);
	}
	
	public void SetCharges(String name) {
		driver.findElement(Charges).clear();
		driver.findElement(Charges).sendKeys(name);
	}
	
	public void dropdownGST() {
		driver.findElement(GstDrpdown).click();
		WebElement ss = driver.findElement(GstDrpdown);
		Select s=new Select(ss);
		s.selectByIndex(2);
	}
	public void ClickOnCalculate() {
		driver.findElement(Calculate).click();
	}
	public void SetDate(String name) {
		driver.findElement(EffDate).sendKeys(name);;
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
		Select s=new Select(ss);
		s.selectByIndex(5);
	}
	public void EditCharge(String name) {
		driver.findElement(EditCharges).clear();
		driver.findElement(EditCharges).sendKeys(name);
	}
	public void EditGst() {
		driver.findElement(EditGst).click();
		WebElement ss = driver.findElement(EditGst);
		Select s=new Select(ss);
		s.selectByIndex(3);
	}
	public void ClickCalculateEdit() {
		driver.findElement(CalculateEdit).click();
	}
	public void ClickOnEditSaveButton() {
		driver.findElement(SaveEdit).click();
	}
}

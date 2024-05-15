package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cust_Vendor_Master {

	WebDriver driver;
	
	public  Cust_Vendor_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By CustVendor=By.xpath("//div[contains(text(),'Cust/Vend Master')]");
	By AddBtn=By.xpath("//div[contains(@class,'flex aic jcsb gap10')]//div[1]");
	By partyType=By.xpath("//div[contains(@class,'credit-limit')]//div[1]//div[1]//select[1]");
	By GstReg=By.xpath("//div[contains(@class,'Modal_modalContent__rRYZG')]//div[2]//div[1]//select[1]");
	By Gst=By.xpath("//input[@placeholder='GSTIN']");
	By Pan=By.xpath("//input[@placeholder='PAN']");
	By Partyname=By.xpath("//input[@placeholder='Party Name']");
	By Less10cr=By.xpath("//div[7]//div[1]//div[3]//div[1]");
	By Great10Cr=By.xpath("//div[7]//div[1]//div[2]//div[1]");
	By CheckPurchaseSales=By.xpath("//body//div[@id='root']//div[@class='flex aic gap10']//div[@class='flex aic gap10']//div[2]//span[1]//input[1]");
	By EstimateAnnualGreat50=By.xpath("//div[8]//div[1]//div[2]//div[1]");
	By EstimateAnnualLess50=By.xpath("//div[8]//div[1]//div[3]//div[1]");
	By opBalance=By.xpath("//input[@placeholder='0.0']");
	By Address=By.xpath("//div[contains(@class,'credit-limit')]//div//input[contains(@placeholder,'ADDRESS')]");
	By Statedrp=By.xpath("//div[11]//div[1]//select[1]");
	By District=By.xpath("//div[12]//div[1]//select[1]");
	By Location=By.xpath("//div[14]//div[1]//select[1]");
	By pincode=By.xpath("//div[@class='credit-limit']//div//input[@placeholder='PINCODE']");
	By Email=By.xpath("//input[@placeholder='EMAIL']");
	By Contact=By.xpath("//input[@placeholder='CONTACT NO']");
	By CheckYes=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[1]");
	By CheckNo=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]");
	
	By UnitName=By.xpath("//input[@placeholder='UNIT NAME']");
	By Address2=By.xpath("//div[@class='tableScroll']//input[@placeholder='ADDRESS']");
	By State2=By.xpath("//td[3]//div[1]//select[1]");
	By District2=By.xpath("//td[4]//div[1]//select[1]");
	By Location2=By.xpath("//td[6]//div[1]//select[1]");
	By pincode2=By.xpath("//div[contains(@class,'tableScroll')]//input[contains(@placeholder,'PINCODE')]");
	
	//For Unit-2
	
	By UnitName3=By.xpath("//tr[3]//td[1]//div[1]//div[1]//input[1]");
	By Address3=By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By State3=By.xpath("//tr[3]//td[3]//div[1]//select[1]");
	By District3=By.xpath("//tr[3]//td[4]//div[1]//select[1]");
	By Location3=By.xpath("//tr[3]//td[6]//div[1]//select[1]");
	By pincode3=By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	
	//For Unit-3
	
	By UnitName4=By.xpath("//tr[4]//td[1]//div[1]//div[1]//input[1]");
	By Address4=By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
	By State4=By.xpath("//tr[4]//td[3]//div[1]//select[1]");
	By District4=By.xpath("//tr[4]//td[4]//div[1]//select[1]");
	By Location4= By.xpath("//tr[4]//td[6]//div[1]//select[1]");
	By pincode4=By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
	
	//For Unit-4
	
	By UnitName5=By.xpath("//tr[5]//td[1]//div[1]//div[1]//input[1]");
	By Address5=By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
	By State5=By.xpath("//tr[5]//td[3]//div[1]//select[1]");
	By District5=By.xpath("//tr[5]//td[4]//div[1]//select[1]");
	By Location5=By.xpath("//tr[5]//td[6]//div[1]//select[1]");
	By pincode5=By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");
	
	
	
	
	By AddRow=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[4]/div[1]");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	By DownloadExcel=By.xpath("//div[normalize-space()='DOWNLOAD EXCEL']");
	By uploadExcel=By.xpath("//div[normalize-space()='UPLOAD EXCEL']");
	

	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonCustVendmaster() {
		driver.findElement(CustVendor).click();
	}
	public void ClickonAddButton() {
		driver.findElement(AddBtn).click();
	}
	public void Selectparttypefromlist() throws Exception {
		driver.findElement(partyType).click();
		WebElement ss = driver.findElement(partyType);
		Select s = new Select(ss);
		s.selectByIndex(1);
		
	}
	public void SelectGstfromlist() {
		driver.findElement(GstReg).click();
		WebElement ss = driver.findElement(GstReg);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterGst(String name) {
		driver.findElement(Gst).sendKeys(name);
	}
	public void EnterPan(String name) {
		driver.findElement(Pan).sendKeys(name);
	}
	public void EnterPartyname(String name) {
		driver.findElement(Partyname).sendKeys(name);
	}
	public void EnterOpBalance(String num) {
		driver.findElement(opBalance).sendKeys(num);
	}
	public void TurnOverLess10cr() {
		driver.findElement(Less10cr).click();
	}
	public void TurnOvergreat10cr() {
		driver.findElement(Great10Cr).click();
	}
	public void SelectPreferedSales() {
		driver.findElement(CheckPurchaseSales).click();
		driver.findElement(By.xpath("//div[@class='layout-body']//div[3]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='Modal_centered__qwdvX']//div[4]//span[1]//input[1]")).click();
	}
	public void SelectGreat50() {
		driver.findElement(EstimateAnnualGreat50).click();
		
	}
	public void SelectLess50() {
		driver.findElement(EstimateAnnualLess50).click();
		
	}
	public void EnterAddress(String name) {
		driver.findElement(Address).sendKeys(name);
	}
	public void Selectstatefromlist() {
		driver.findElement(Statedrp).click();
		WebElement ss = driver.findElement(Statedrp);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectDistctfromlist() throws Exception {
		driver.findElement(District).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District);
		Select s = new Select(ss);
		s.selectByIndex(5);
	}
	public void EnterLocation() {
		driver.findElement(Location).click();
		WebElement ss = driver.findElement(Location);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterPincode(String num) {
		driver.findElement(pincode).sendKeys(num);
	}
	public void Enteremail(String name) {
		driver.findElement(Email).sendKeys(name);
	}
	public void EnterMobile(String num) {
		driver.findElement(Contact).sendKeys(num);
	}
	public void Entercheck() {
		driver.findElement(CheckYes).click();;
	}
	public void EnterUnitname(String name) {
		driver.findElement(UnitName).sendKeys(name);
	}
	public void EnterUnitname2(String name) {
		driver.findElement(UnitName3).sendKeys(name);
	}
	public void EnterUnitname3(String name) {
		driver.findElement(UnitName4).sendKeys(name);
	}
	public void EnterUnitname4(String name) {
		driver.findElement(UnitName5).sendKeys(name);
	}
	
	public void EnterBillAddress(String name) {
		driver.findElement(Address2).sendKeys(name);
	}
	public void EnterBillAddress2(String name) {
		driver.findElement(Address3).sendKeys(name);
	}
	public void EnterBillAddress3(String name) {
		driver.findElement(Address4).sendKeys(name);
	}
	public void EnterBillAddress4(String name) {
		driver.findElement(Address5).sendKeys(name);
	}
	public void SelectBillstatefromlist() {
		driver.findElement(State2).click();
		WebElement ss = driver.findElement(State2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectBillstatefromlist2() {
		driver.findElement(State3).click();
		WebElement ss = driver.findElement(State3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectBillstatefromlist3() {
		driver.findElement(State4).click();
		WebElement ss = driver.findElement(State4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectBillstatefromlist4() {
		driver.findElement(State5).click();
		WebElement ss = driver.findElement(State5);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectBillDistctfromlist() throws Exception {
		driver.findElement(District2).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District2);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void SelectBillDistctfromlist2() throws Exception {
		driver.findElement(District3).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District3);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void SelectBillDistctfromlist3() throws Exception {
		driver.findElement(District4).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District4);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void SelectBillDistctfromlist4() throws Exception {
		driver.findElement(District5).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District5);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void EnterBillLocation() {
		driver.findElement(Location2).click();
		WebElement ss = driver.findElement(Location2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterBillLocation2() {
		driver.findElement(Location3).click();
		WebElement ss = driver.findElement(Location3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterBillLocation3() {
		driver.findElement(Location4).click();
		WebElement ss = driver.findElement(Location4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterBillLocation4() {
		driver.findElement(Location5).click();
		WebElement ss = driver.findElement(Location5);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterBillPincode(String num) {
		driver.findElement(pincode2).sendKeys(num);
	}
	public void EnterBillPincode2(String num) {
		driver.findElement(pincode3).sendKeys(num);
	}
	public void EnterBillPincode3(String num) {
		driver.findElement(pincode4).sendKeys(num);
	}
	public void EnterBillPincode4(String num) {
		driver.findElement(pincode5).sendKeys(num);
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	
	
	
	
}


















package transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Def_Return_Data {

	WebDriver driver;

	public Def_Return_Data(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases = By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By DefReturn = By.xpath("//div[contains(text(),'Defective/Pur return')]");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By PoInvoice = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[1]/div[1]/select");
	By InvDate = By.xpath("//input[@type='date']");
	By VendNmeDrp = By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By Narration = By.xpath("//input[@placeholder='NARRATION']");
	By ReturnDte = By.xpath("//div[6]//div[2]//input[1]");
	By ProdDrop = By
			.xpath("//div[contains(@class,'tableScroll')]//table//tr//td//div//select[contains(@class,'drop-select')]");
	By Reason = By.xpath("//td[2]//div[1]//select[1]");
	By FetchGst = By.xpath("//div[normalize-space()='FETCH GST']");
	By RetuQunty = By.xpath("//input[@placeholder='RETURN QUANTITY']");
	By CylTrewt = By.xpath("//td[7]//div[1]//div[1]//input[1]");
	By CylGrsWt = By.xpath("//input[@placeholder='CYL. GROSS WEIGHT']");
	By CylSrNo = By.xpath("//input[@placeholder='CYL. SR. NO.']");
	By NetWeght = By.xpath("//input[@placeholder='NET WEIGHT(KGS)']");
	By VehcleNo = By.xpath("//input[@placeholder='VEHICAL NUMBER']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");

	// For 2nd
	By ProdDrop2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By RetuQunty2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");
	By CylTrewt2 = By.xpath("//tr[3]//td[7]//div[1]//div[1]//input[1]");
	By CylGrsWt2 = By.xpath("//tr[3]//td[8]//div[1]//div[1]//input[1]");
	By CylSrNo2 = By.xpath("//tr[3]//td[9]//div[1]//div[1]//input[1]");
	By NetWeght2 = By.xpath("//tr[3]//td[10]//div[1]//div[1]//input[1]");
	By VehcleNo2 = By.xpath("//tr[3]//td[16]//div[1]//div[1]//input[1]");

	// For 3rd
	By ProdDrop3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By RetuQunty3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
	By CylTrewt3 = By.xpath("//tr[4]//td[7]//div[1]//div[1]//input[1]");
	By CylGrsWt3 = By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
	By CylSrNo3 = By.xpath("//tr[4]//td[9]//div[1]//div[1]//input[1]");
	By NetWeght3 = By.xpath("//tr[4]//td[10]//div[1]//div[1]//input[1]");
	By VehcleNo3 = By.xpath("//tr[4]//td[16]//div[1]//div[1]//input[1]");

	// For 4th
	By ProdDrop4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By RetuQunty4 = By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");
	By CylTrewt4 = By.xpath("//tr[5]//td[7]//div[1]//div[1]//input[1]");
	By CylGrsWt4 = By.xpath("//tr[5]//td[8]//div[1]//div[1]//input[1]");
	By CylSrNo4 = By.xpath("//tr[5]//td[9]//div[1]//div[1]//input[1]");
	By NetWeght4 = By.xpath("//tr[5]//td[10]//div[1]//div[1]//input[1]");
	By VehcleNo4 = By.xpath("//tr[5]//td[16]//div[1]//div[1]//input[1]");

	By Save = By.xpath("//div[normalize-space()='SAVE']");
	By Addrow = By
			.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");

	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonDefRetrn() {
		driver.findElement(DefReturn).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void SelectPO() {
		driver.findElement(PoInvoice).click();
		WebElement ss = driver.findElement(PoInvoice);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterInvDate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}

	public void EnterVendName() {
		driver.findElement(VendNmeDrp).click();
		WebElement ss = driver.findElement(VendNmeDrp);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterNarration(String name) {
		driver.findElement(Narration).sendKeys(name);
	}

	public void EnterReturnDate(String name) {
		driver.findElement(ReturnDte).sendKeys(name);
	}

	public void SelectProdDrop() {
		driver.findElement(ProdDrop).click();
		WebElement ss = driver.findElement(ProdDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectReason() {
		driver.findElement(Reason).click();
		WebElement ss = driver.findElement(Reason);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterRetrnQnty(String num) {
		driver.findElement(RetuQunty).sendKeys(num);
	}

	public void EnterCylTareWt(String num) {
		driver.findElement(CylTrewt).sendKeys(num);
	}

	public void EnterCylGrossWt(String num) {
		driver.findElement(CylGrsWt).sendKeys(num);
	}

	public void EnterCylSrNo(String num) {
		driver.findElement(CylSrNo).sendKeys(num);
	}

	public void EnterNetWeight(String num) {
		driver.findElement(NetWeght).sendKeys(num);
	}

	public void EntervehclName(String name) {
		driver.findElement(VehcleNo).sendKeys(name);
	}

	// for2nd

	public void SelectProdDrop2() {
		driver.findElement(ProdDrop2).click();
		WebElement ss = driver.findElement(ProdDrop2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterRetrnQnty2(String num) {
		driver.findElement(RetuQunty2).sendKeys(num);
	}

	public void EnterCylTareWt2(String num) {
		driver.findElement(CylTrewt2).sendKeys(num);
	}

	public void EnterCylGrossWt2(String num) {
		driver.findElement(CylGrsWt2).sendKeys(num);
	}

	public void EnterCylSrNo2(String num) {
		driver.findElement(CylSrNo2).sendKeys(num);
	}

	public void EnterNetWeight2(String num) {
		driver.findElement(NetWeght2).sendKeys(num);
	}

	public void EntervehclName2(String name) {
		driver.findElement(VehcleNo2).sendKeys(name);
	}

	// for 3rd

	public void SelectProdDrop3() {
		driver.findElement(ProdDrop3).click();
		WebElement ss = driver.findElement(ProdDrop3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterRetrnQnty3(String num) {
		driver.findElement(RetuQunty3).sendKeys(num);
	}

	public void EnterCylTareWt3(String num) {
		driver.findElement(CylTrewt3).sendKeys(num);
	}

	public void EnterCylGrossWt3(String num) {
		driver.findElement(CylGrsWt3).sendKeys(num);
	}

	public void EnterCylSrNo3(String num) {
		driver.findElement(CylSrNo3).sendKeys(num);
	}

	public void EnterNetWeight3(String num) {
		driver.findElement(NetWeght3).sendKeys(num);
	}

	public void EntervehclName3(String name) {
		driver.findElement(VehcleNo3).sendKeys(name);
	}

	// for 4th

	public void SelectProdDrop4() {
		driver.findElement(ProdDrop4).click();
		WebElement ss = driver.findElement(ProdDrop4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterRetrnQnty4(String num) {
		driver.findElement(RetuQunty4).sendKeys(num);
	}

	public void EnterCylTareWt4(String num) {
		driver.findElement(CylTrewt4).sendKeys(num);
	}

	public void EnterCylGrossWt4(String num) {
		driver.findElement(CylGrsWt4).sendKeys(num);
	}

	public void EnterCylSrNo4(String num) {
		driver.findElement(CylSrNo4).sendKeys(num);
	}

	public void EnterNetWeight4(String num) {
		driver.findElement(NetWeght4).sendKeys(num);
	}

	public void EntervehclName4(String name) {
		driver.findElement(VehcleNo4).sendKeys(name);
	}

	public void ClickOnFetchGst() {
		driver.findElement(FetchGst).click();
	}

	public void ClickOnCalculate() {
		driver.findElement(Calculate).click();
	}

	public void ClickOnsave() {
		driver.findElement(Save).click();
	}

	public void ClickOnAddRow() {
		driver.findElement(Addrow).click();
	}
}

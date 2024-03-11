package transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Other_Purchases {


	WebDriver driver;
	
	public  Other_Purchases(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases=By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By OtherPurchase=By.xpath("//div[contains(@class,'list-title fs12')][normalize-space()='Other Purchases']");
	By ExpenseYes=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div");
	By ExpenseNo=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[3]/div");
	By ItcYes=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[2]/div[1]/div");
	By ItcNo=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[2]/div[2]/div");
	By AddBtn=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By InvNo=By.xpath("//input[@placeholder='INV REF NO']");
	By InvDate=By.xpath("//input[@type='date']");
	By VendNme=By.xpath("//input[@placeholder='VENDER NAME']");
	By RevCharge=By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By PurchaseType=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]");
	By Prodname= By.xpath("//div[contains(@class,'tableScroll')]//input[contains(@placeholder,'NAME')]");
	By HSn=By.xpath("//input[@placeholder='HSN/SAC CODE']");
	By GstDrop=By.xpath("//td[3]//div[1]//select[1]");
	By MinorheadDrop=By.xpath("//td[4]//div[1]//select[1]");
	By AccountHeadDrop=By.xpath("//td[5]//div[1]//select[1]");
	By Qunty=By.xpath("//input[contains(@placeholder,'Quantity')]");
	By UOmDrop=By.xpath("//td[7]//div[1]//select[1]");
	By UnitRate=By.xpath("//input[contains(@placeholder,'UNIT RATE')]");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[@class='flex aic gap10']//div[@role='button'][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	
	By voucherNo=By.xpath("//input[@placeholder='VOUCHER NO']");
	By VocDate=By.xpath("//input[@type='date']");
	By fetchVchr=By.xpath("//div[normalize-space()='FETCH VOUCHER NUMBER']");
	By Expensename= By.xpath("//input[@placeholder='NAME']");
	By MinorheadDropd=By.xpath("//td[2]//div[1]//select[1]");
	By AccountHeadDropd=By.xpath("//td[3]//div[1]//select[1]");
	By Quntity=By.xpath("//input[@placeholder='Quantity']");
	By UOmDropd=By.xpath("//td[5]//div[1]//select[1]");
	By UnitRte=By.xpath("//input[contains(@placeholder,'UNIT RATE')]");
	By Calculte=By.xpath("//div[normalize-space()='CALCULATE']");
	By payterms=By.xpath("//td[8]//div[1]//select[1]");
	By Bank=By.xpath("//td[9]//div[1]//select[1]");
	By Saveexp=By.xpath("//div[normalize-space()='SAVE']");
	
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonOtherPurch() {
		driver.findElement(OtherPurchase).click();
	}
	public void ClickonExpNo() {
		driver.findElement(ExpenseNo).click();
	}
	public void ClickonExpYes() {
		driver.findElement(ExpenseYes).click();
	}
	public void ClickonItcYes() {
		driver.findElement(ItcYes).click();
	}
	public void ClickonItcNo() {
		driver.findElement(ItcNo).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterInvNo(String num) {
		driver.findElement(InvNo).sendKeys(num);
	}
	public void EnterInvDate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}
	public void EnterVendName(String name) {
		driver.findElement(VendNme).sendKeys(name);
	}
	
	
	public void SelectRevCharge() {
		driver.findElement(RevCharge).click();
		WebElement ss = driver.findElement(RevCharge);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnPurchType() {
		driver.findElement(PurchaseType).click();
	}
	public void EnterProdName(String name) {
		driver.findElement(Prodname).sendKeys(name);
	}
	public void EnterHsn(String num) {
		driver.findElement(HSn).sendKeys(num);
	}
	public void SelectGstDrop() {
		driver.findElement(GstDrop).click();
		WebElement ss = driver.findElement(GstDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectMinorHeadDrop() {
		driver.findElement(MinorheadDrop).click();
		WebElement ss = driver.findElement(MinorheadDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectAccheadDrop() {
		driver.findElement(AccountHeadDrop).click();
		WebElement ss = driver.findElement(AccountHeadDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterQanty(String num) {
		driver.findElement(Qunty).sendKeys(num);
	}
	
	public void SelectUomfromlist() {
		driver.findElement(UOmDrop).click();
		WebElement ss = driver.findElement(UOmDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	
	public void EnterUnitRate(String num) {
		driver.findElement(UnitRate).sendKeys(num);
	}
	
	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}
	
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	
	
	public void EnterVochExpNo() {
		driver.findElement(voucherNo).click();
	}
	public void EntervouchDate(String date) {
		driver.findElement(VocDate).sendKeys(date);
	}
	public void ClickonFetch() {
		driver.findElement(fetchVchr).click();
	}
	public void EnterExpeName(String name) {
		driver.findElement(Expensename).sendKeys(name);
	}
	public void SelectMinorHeadDropd() {
		driver.findElement(MinorheadDropd).click();
		WebElement ss = driver.findElement(MinorheadDropd);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectAccheadDropd() {
		driver.findElement(AccountHeadDropd).click();
		WebElement ss = driver.findElement(AccountHeadDropd);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterQuntity(String num) {
		driver.findElement(Quntity).sendKeys(num);
	}
	
	public void SelectUomdropd() {
		driver.findElement(UOmDropd).click();
		WebElement ss = driver.findElement(UOmDropd);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	
	public void EnterUnitRte(String num) {
		driver.findElement(UnitRte).sendKeys(num);
	}
	
	public void ClickonCalculte() {
		driver.findElement(Calculte).click();
	}
	public void SelectPayTerms() {
		driver.findElement(payterms).click();
		WebElement ss = driver.findElement(payterms);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectbank() {
		driver.findElement(Bank).click();
		WebElement ss = driver.findElement(Bank);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickonSaveexp() {
		driver.findElement(Saveexp).click();
	}
}

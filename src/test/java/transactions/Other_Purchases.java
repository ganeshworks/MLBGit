package transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Other_Purchases {

	WebDriver driver;

	public Other_Purchases(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[1]/div[2]");
	By OtherPurchase = By.xpath("//div[contains(@class,'list-title fs12')][normalize-space()='Other Purchases']");
	By ExpenseYes = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div");
	By ExpenseNo = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[3]/div");
	By ItcYes = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[2]/div[1]/div");
	By ItcNo = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div[2]/div[2]/div");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By InvNo = By.xpath("//input[@placeholder='INV REF NO']");
	By InvDate = By.xpath("//input[@type='date']");
	By VendNme = By.xpath("//input[@placeholder='VENDOR NAME']");
	By CustList = By.id("custvend");
	By RevCharge = By.xpath("//div[@class='flex aic gap10 credit-limit']//div//select[@class='drop-select']");
	By PurchaseType = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]");
	
	By Prodname = By.xpath("//input[@placeholder='NAME']");
	By Prodname2 = By.xpath("//tr[3]//td[1]//div[1]//div[1]//input[1]");
	By Prodname3 = By.xpath("//tr[4]//td[1]//div[1]//div[1]//input[1]");
	By Prodname4 = By.xpath("//tr[5]//td[1]//div[1]//div[1]//input[1]");
	
	By HSn = By.xpath("//input[@placeholder='HSN CODE']");
	By HSn2 = By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By HSn3 = By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
	By HSn4 = By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
	
	By GstDrop = By.xpath("//td[3]//div[1]//select[1]");
	By GstDrop2 = By.xpath("//tr[3]//td[3]//div[1]//select[1]");
	By GstDrop3 = By.xpath("//tr[4]//td[3]//div[1]//select[1]");
	By GstDrop4 = By.xpath("//tr[5]//td[3]//div[1]//select[1]");
	
	By MinorheadDrop = By.xpath("//td[4]//div[1]//select[1]");
	By MinorheadDrop2 = By.xpath("//tr[3]//td[4]//div[1]//select[1]");
	By MinorheadDrop3 = By.xpath("//tr[4]//td[4]//div[1]//select[1]");
	By MinorheadDrop4 = By.xpath("//tr[5]//td[4]//div[1]//select[1]");
	
	By AccountHeadDrop = By.xpath("//td[5]//div[1]//select[1]");
	By Qunty = By.xpath("//input[@placeholder='QUANTITY']");
	By Qunty2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");
	By Qunty3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
	By Qunty4 = By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");
	
	By UOmDrop = By.xpath("//td[7]//div[1]//select[1]");
	By UOmDrop2 = By.xpath("//tr[3]//td[7]//div[1]//select[1]");
	By UOmDrop3 = By.xpath("//tr[4]//td[7]//div[1]//select[1]");
	By UOmDrop4 = By.xpath("//tr[5]//td[7]//div[1]//select[1]");
	
	By UnitRate = By.xpath("//input[@placeholder='UNIT RATE']");
	By UnitRate2 = By.xpath("//tr[3]//td[8]//div[1]//div[1]//input[1]");
	By UnitRate3 = By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
	By UnitRate4 = By.xpath("//tr[5]//td[8]//div[1]//div[1]//input[1]");
	
	
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow = By.xpath("//div[@class='flex aic gap10']//div[@role='button'][normalize-space()='ADD']");
	
	//itcyes2
	
	
	
	
	
	
	By Save = By.xpath("//div[normalize-space()='SAVE']");

	By voucherNo = By.xpath("//input[@placeholder='VOUCHER NO']");
	By VocDate = By.xpath("//input[@type='date']");
	By fetchVchr = By.xpath("//div[normalize-space()='FETCH VOUCHER NUMBER']");
	
	By Expensename = By.xpath("//input[@placeholder='NAME']");
	By Expensename2 = By.xpath("//tr[3]//td[1]//div[1]//div[1]//input[1]");
	By Expensename3 = By.xpath("//tr[4]//td[1]//div[1]//div[1]//input[1]");
	By Expensename4 = By.xpath("//tr[5]//td[1]//div[1]//div[1]//input[1]");
	
	By TDSApp=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[1]/div[4]/select");
	
	By MinorheadDropd = By.xpath("//td[2]//div[1]//select[1]");
	By MinorheadDropd2 = By.xpath("//tr[3]//td[2]//div[1]//select[1]");
	By MinorheadDropd3 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
	By MinorheadDropd4 = By.xpath("//tr[5]//td[2]//div[1]//select[1]");
	
	By AccountHeadDropd = By.xpath("//td[3]//div[1]//select[1]");
	By Quntity = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div/div/table/tr[2]/td[4]/div/div/input");
	By Quntity2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By Quntity3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By Quntity4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	
	
	By UOmDropd = By.xpath("//td[5]//div[1]//select[1]");
	By UOmDropd2 = By.xpath("//tr[3]//td[5]//div[1]//select[1]");
	By UOmDropd3 = By.xpath("//tr[4]//td[5]//div[1]//select[1]");
	By UOmDropd4 = By.xpath("//tr[5]//td[5]//div[1]//select[1]");
	
	By UnitRte = By.xpath("//input[contains(@placeholder,'UNIT RATE')]");
	By UnitRte2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");
	By UnitRte3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
	By UnitRte4 = By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");
	
	
	By Calculte = By.xpath("//div[normalize-space()='CALCULATE']");
	By payterms = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div/div/table/tr[2]/td[9]/div/select");
	By payterms2 = By.xpath("//tr[3]//td[9]//div[1]//select[1]");
	By payterms3 = By.xpath("//tr[4]//td[9]//div[1]//select[1]");
	By payterms4 = By.xpath("//tr[5]//td[9]//div[1]//select[1]");
	
	By Bank = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div/div/table/tr[2]/td[10]/div/select");
	By Bank2 = By.xpath("//tr[3]//td[10]//div[1]//select[1]");
	By Bank3 = By.xpath("//tr[4]//td[10]//div[1]//select[1]");
	By Bank4 = By.xpath("//tr[5]//td[10]//div[1]//select[1]");
	
	By RecvdBy=By.xpath("//td[11]//div[1]//select[1]");
	By RecvdBy2=By.xpath("//tr[3]//td[11]//div[1]//select[1]");
	By RecvdBy3=By.xpath("//tr[4]//td[11]//div[1]//select[1]");
	By RecvdBy4=By.xpath("//tr[5]//td[11]//div[1]//select[1]");
	
	By Narration=By.xpath("//input[@placeholder='NARRATION']");
	By Narration2=By.xpath("//tr[3]//td[12]//div[1]//div[1]//input[1]");
	By Narration3=By.xpath("//tr[4]//td[12]//div[1]//div[1]//input[1]");
	By Narration4=By.xpath("//tr[5]//td[12]//div[1]//div[1]//input[1]");
	
	By Saveexp = By.xpath("//div[normalize-space()='SAVE']");

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

	public void EnterVendName(String num) {
		driver.findElement(VendNme).click();
		driver.findElement(VendNme).sendKeys(num);
		/*
		 * WebElement inputField = driver.findElement(By.xpath("//*[@id='custvend']"));
		 * 
		 * Actions A=new Actions(driver);
		 * 
		 * A.moveToElement(driver.findElement(By.xpath("//*[@id=\"custvend\"]/option[1]"
		 * ))).sendKeys(Keys.ENTER).build().perform();
		 * 
		 * // Use JavaScript Executor to set the value of the input field
		 */       /* String value = "test";
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", inputField, value);
*/
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
	
	public void EnterProdName2(String name) {
		driver.findElement(Prodname2).sendKeys(name);
	}
	public void EnterProdName3(String name) {
		driver.findElement(Prodname3).sendKeys(name);
	}
	public void EnterProdName4(String name) {
		driver.findElement(Prodname4).sendKeys(name);
	}

	public void EnterHsn(String num) {
		driver.findElement(HSn).sendKeys(num);
	}
	public void EnterHsn2(String num) {
		driver.findElement(HSn2).sendKeys(num);
	}

	public void EnterHsn3(String num) {
		driver.findElement(HSn3).sendKeys(num);
	}
	public void EnterHsn4(String num) {
		driver.findElement(HSn4).sendKeys(num);
	}
	
	public void SelectGstDrop() {
		driver.findElement(GstDrop).click();
		WebElement ss = driver.findElement(GstDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectGstDrop2() {
		driver.findElement(GstDrop2).click();
		WebElement ss = driver.findElement(GstDrop2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectGstDrop3() {
		driver.findElement(GstDrop3).click();
		WebElement ss = driver.findElement(GstDrop3);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void SelectGstDrop4() {
		driver.findElement(GstDrop4).click();
		WebElement ss = driver.findElement(GstDrop4);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}

	public void SelectMinorHeadDrop() {
		driver.findElement(MinorheadDrop).click();
		WebElement ss = driver.findElement(MinorheadDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectMinorHeadDrop2() {
		driver.findElement(MinorheadDrop2).click();
		WebElement ss = driver.findElement(MinorheadDrop2);
		Select s = new Select(ss);
		s.selectByIndex(5);
	}
	public void SelectMinorHeadDrop3() {
		driver.findElement(MinorheadDrop3).click();
		WebElement ss = driver.findElement(MinorheadDrop3);
		Select s = new Select(ss);
		s.selectByIndex(9);
	}
	public void SelectMinorHeadDrop4() {
		driver.findElement(MinorheadDrop4).click();
		WebElement ss = driver.findElement(MinorheadDrop4);
		Select s = new Select(ss);
		s.selectByIndex(15);
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
	public void EnterQanty2(String num) {
		driver.findElement(Qunty2).sendKeys(num);
	}
	public void EnterQanty3(String num) {
		driver.findElement(Qunty3).sendKeys(num);
	}
	public void EnterQanty4(String num) {
		driver.findElement(Qunty4).sendKeys(num);
	}

	public void SelectUomfromlist() {
		driver.findElement(UOmDrop).click();
		WebElement ss = driver.findElement(UOmDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectUomfromlist2() {
		driver.findElement(UOmDrop2).click();
		WebElement ss = driver.findElement(UOmDrop2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectUomfromlist3() {
		driver.findElement(UOmDrop3).click();
		WebElement ss = driver.findElement(UOmDrop3);
		Select s = new Select(ss);
		s.selectByIndex(5);
	}
	public void SelectUomfromlist4() {
		driver.findElement(UOmDrop4).click();
		WebElement ss = driver.findElement(UOmDrop4);
		Select s = new Select(ss);
		s.selectByIndex(10);
	}

	public void EnterUnitRate(String num) {
		driver.findElement(UnitRate).sendKeys(num);
	}
	public void EnterUnitRate2(String num) {
		driver.findElement(UnitRate2).sendKeys(num);
	}
	public void EnterUnitRate3(String num) {
		driver.findElement(UnitRate3).sendKeys(num);
	}
	public void EnterUnitRate4(String num) {
		driver.findElement(UnitRate4).sendKeys(num);
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
	public void EnterExpeName2(String name) {
		driver.findElement(Expensename2).sendKeys(name);
	}
	public void EnterExpeName3(String name) {
		driver.findElement(Expensename3).sendKeys(name);
	}
	public void EnterExpeName4(String name) {
		driver.findElement(Expensename4).sendKeys(name);
	}

	public void SelectTDSApp() {
		driver.findElement(TDSApp).click();
		WebElement ss = driver.findElement(TDSApp);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectMinorHeadDropd() {
		driver.findElement(MinorheadDropd).click();
		WebElement ss = driver.findElement(MinorheadDropd);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectMinorHeadDropd2() {
		driver.findElement(MinorheadDropd2).click();
		WebElement ss = driver.findElement(MinorheadDropd2);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void SelectMinorHeadDropd3() {
		driver.findElement(MinorheadDropd3).click();
		WebElement ss = driver.findElement(MinorheadDropd3);
		Select s = new Select(ss);
		s.selectByIndex(9);
	}
	public void SelectMinorHeadDropd4() {
		driver.findElement(MinorheadDropd4).click();
		WebElement ss = driver.findElement(MinorheadDropd4);
		Select s = new Select(ss);
		s.selectByIndex(10);
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
	public void EnterQuntity2(String num) {
		driver.findElement(Quntity2).sendKeys(num);
	}
	public void EnterQuntity3(String num) {
		driver.findElement(Quntity3).sendKeys(num);
	}
	public void EnterQuntity4(String num) {
		driver.findElement(Quntity4).sendKeys(num);
	}

	public void SelectUomdropd() {
		driver.findElement(UOmDropd).click();
		WebElement ss = driver.findElement(UOmDropd);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectUomdropd2() {
		driver.findElement(UOmDropd2).click();
		WebElement ss = driver.findElement(UOmDropd2);
		Select s = new Select(ss);
		s.selectByIndex(10);
	}
	public void SelectUomdropd3() {
		driver.findElement(UOmDropd3).click();
		WebElement ss = driver.findElement(UOmDropd3);
		Select s = new Select(ss);
		s.selectByIndex(11);
	}
	public void SelectUomdropd4() {
		driver.findElement(UOmDropd).click();
		WebElement ss = driver.findElement(UOmDropd4);
		Select s = new Select(ss);
		s.selectByIndex(7);
	}

	public void EnterUnitRte(String num) {
		driver.findElement(UnitRte).sendKeys(num);
	}
	public void EnterUnitRte2(String num) {
		driver.findElement(UnitRte2).sendKeys(num);
	}
	public void EnterUnitRte3(String num) {
		driver.findElement(UnitRte3).sendKeys(num);
	}
	public void EnterUnitRte4(String num) {
		driver.findElement(UnitRte4).sendKeys(num);
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
	public void SelectPayTerms2() {
		driver.findElement(payterms2).click();
		WebElement ss = driver.findElement(payterms2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectPayTerms3() {
		driver.findElement(payterms3).click();
		WebElement ss = driver.findElement(payterms3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectPayTerms4() {
		driver.findElement(payterms4).click();
		WebElement ss = driver.findElement(payterms4);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}

	public void Selectbank() {
		driver.findElement(Bank).click();
		WebElement ss = driver.findElement(Bank);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectbank2() {
		driver.findElement(Bank2).click();
		WebElement ss = driver.findElement(Bank2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void Selectbank3() {
		driver.findElement(Bank3).click();
		WebElement ss = driver.findElement(Bank3);
		Select s = new Select(ss);
		s.selectByIndex(5);
	}
	public void Selectbank4() {
		driver.findElement(Bank4).click();
		WebElement ss = driver.findElement(Bank4);
		Select s = new Select(ss);
		s.selectByIndex(6);
	}
	public void SelectRecevdBy() {
		driver.findElement(RecvdBy).click();
		WebElement ss = driver.findElement(RecvdBy);
		Select s = new Select(ss);
		s.selectByIndex(7);
	}
	public void SelectRecevdBy2() {
		driver.findElement(RecvdBy2).click();
		WebElement ss = driver.findElement(RecvdBy2);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void SelectRecevdBy3() {
		driver.findElement(RecvdBy3).click();
		WebElement ss = driver.findElement(RecvdBy3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void SelectRecevdBy4() {
		driver.findElement(RecvdBy4).click();
		WebElement ss = driver.findElement(RecvdBy4);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void EnterNarration(String name) {
		driver.findElement(Narration).sendKeys(name);
	}
	public void EnterNarration2(String name) {
		driver.findElement(Narration2).sendKeys(name);
	}
	public void EnterNarration3(String name) {
		driver.findElement(Narration3).sendKeys(name);
	}
	public void EnterNarration4(String name) {
		driver.findElement(Narration4).sendKeys(name);
	}

	public void ClickonSaveexp() {
		driver.findElement(Saveexp).click();
	}
}

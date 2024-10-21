package transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ARB_Purchase {

	WebDriver driver;

	public ARB_Purchase(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases = By.xpath("//div[contains(text(),'Purchases')]");
	By ArbPurchase = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[2]/div[3]/div[2]");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By InvNo = By.xpath("//input[@placeholder='INV REF NO']");
	By InvDate = By.xpath("//div[@class='Modal_modalContent__rRYZG']//div[2]//div[2]//input[1]");
	By StockDate = By.xpath("//div[@class='layout-body']//div[3]//div[2]//input[1]");
	By Venddrop = By.xpath("//div[@class='flex aic gap10 credit-limit']//div[4]//select[1]");
	By RevCharge = By.xpath("//div[@class='flex aic gap10 credit-limit']//div[1]//div[1]//select[1]");
	By PoDrop = By.xpath("//div[@class='Modal_modalContent__rRYZG']//div[2]//div[1]//select[1]");
	By PODate = By.xpath("//div[@class='flex aic gap10 credit-limit']//div//input[@type='date']");
	By Proddrop = By.xpath("//td[1]//div[1]//select[1]");
	By fetchGst = By.xpath("//div[normalize-space()='FETCH GST']");
	By UnitRate = By.xpath("//input[@placeholder='UNIT RATE']");
	By Qunty = By.xpath("//input[@placeholder='QUANTITY']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By TruckNo = By.xpath("//input[contains(@placeholder,'TRUCK NUMBER')]");
	By DriverName = By.xpath("//input[@placeholder='DRIVER NAME']");
	By RecevdBy = By.xpath("//td[11]//div[1]//select[1]");
	By AddRow = By
			.xpath("//div[contains(@class,'flex aic gap10')]//div[@role='button'][normalize-space()='ADD']");

	// 2nd

	By ProdDrop2 = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[3]/td[1]/div[1]/select[1]");
	By UnitRate2 = By.xpath("//tr[3]//td[3]//div[1]//div[1]//input[1]");
	By Qunty2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By TruckNo2 = By.xpath("//tr[3]//td[9]//div[1]//div[1]//input[1]");
	By DriverName2 = By.xpath("//tr[3]//td[10]//div[1]//div[1]//input[1]");
	By RecevdBy2 = By.xpath("//tr[3]//td[11]//div[1]//select[1]");

	// 3rd

	By ProdDrop3 = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[4]/td[1]/div[1]/select[1]");
	By UnitRate3 = By.xpath("//tr[4]//td[3]//div[1]//div[1]//input[1]");
	By Qunty3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By TruckNo3 = By.xpath("//tr[4]//td[9]//div[1]//div[1]//input[1]");
	By DriverName3 = By.xpath("//tr[4]//td[10]//div[1]//div[1]//input[1]");
	By RecevdBy3 = By.xpath("//tr[4]//td[11]//div[1]//select[1]");

	// 4th
	By ProdDrop4 = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[5]/td[1]/div[1]/select[1]");
	By UnitRate4 = By.xpath("//tr[5]//td[3]//div[1]//div[1]//input[1]");
	By Qunty4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By TruckNo4 = By.xpath("//tr[5]//td[9]//div[1]//div[1]//input[1]");
	By DriverName4 = By.xpath("//tr[5]//td[10]//div[1]//div[1]//input[1]");
	By RecevdBy4 = By.xpath("//tr[5]//td[11]//div[1]//select[1]");

	By Save = By.xpath("//div[normalize-space()='SAVE']");

	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonArbPurch() {
		driver.findElement(ArbPurchase).click();
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

	public void EnterStckRecDate(String date) {
		driver.findElement(StockDate).sendKeys(date);
	}

	public void SelectVendorfromlist() {
		driver.findElement(Venddrop).click();
		WebElement ss = driver.findElement(Venddrop);
		Select s = new Select(ss);
		s.selectByIndex(6);
	}
	public String Vendorname() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Venddrop);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void SelectRevCharge() {
		driver.findElement(RevCharge).click();
		WebElement ss = driver.findElement(RevCharge);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String reversecharge() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RevCharge);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void SelectPODrop() {
		driver.findElement(PoDrop).click();
		WebElement ss = driver.findElement(PoDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String POdrod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(PoDrop);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void EnterPODate(String date) {
		driver.findElement(PODate).sendKeys(date);
	}

	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String firstprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(10).getText();

		return selectedOptionText;

	}

	public void ClickOnFetchGst() {
		driver.findElement(fetchGst).click();
	}

	public void EnterUnitRate(String num) {
		driver.findElement(UnitRate).sendKeys(num);
	}

	public void EnterQanty(String num) {
		driver.findElement(Qunty).sendKeys(num);
	}

	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}

	public void EnterTruck(String num) {
		driver.findElement(TruckNo).sendKeys(num);
	}

	public void EnterDrivername(String name) {
		driver.findElement(DriverName).sendKeys(name);
	}
	public String Driver1() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(DriverName);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();

		return selectedOptionText;

	}

	public void SelectRecdBy() {
		driver.findElement(RecevdBy).click();
		WebElement ss = driver.findElement(RecevdBy);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String firstrecvdby() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	// 2nd

	public void SelectProdfromlist2() {
		driver.findElement(ProdDrop2).click();
		WebElement ss = driver.findElement(ProdDrop2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	
	public String secondprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(ProdDrop2);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();

		return selectedOptionText;

	}

	public void EnterUnitRate2(String num) {
		driver.findElement(UnitRate2).sendKeys(num);
	}

	public void EnterQanty2(String num) {
		driver.findElement(Qunty2).sendKeys(num);
	}

	public void EnterTruck2(String num) {
		driver.findElement(TruckNo2).sendKeys(num);
	}

	public void EnterDrivername2(String name) {
		driver.findElement(DriverName2).sendKeys(name);
	}
	public String Driver2() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(DriverName2);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}
	

	public void SelectRecdBy2() {
		driver.findElement(RecevdBy2).click();
		WebElement ss = driver.findElement(RecevdBy2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String secondrecvdby() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy2);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}
	
	
	// 3rd

	public void SelectProdfromlist3() {
		driver.findElement(ProdDrop3).click();
		WebElement ss = driver.findElement(ProdDrop3);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public String Thirdprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(ProdDrop3);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(3).getText();

		return selectedOptionText;

	}

	public void EnterUnitRate3(String num) {
		driver.findElement(UnitRate3).sendKeys(num);
	}

	public void EnterQanty3(String num) {
		driver.findElement(Qunty3).sendKeys(num);
	}

	public void EnterTruck3(String num) {
		driver.findElement(TruckNo3).sendKeys(num);
	}

	public void EnterDrivername3(String name) {
		driver.findElement(DriverName3).sendKeys(name);
	}
	public String Driver3() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(DriverName3);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(3).getText();

		return selectedOptionText;

	}
	
	public void SelectRecdBy3() {
		driver.findElement(RecevdBy3).click();
		WebElement ss = driver.findElement(RecevdBy3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public String thirdrecvdby() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy3);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();

		return selectedOptionText;

	}

	// 4th

	public void SelectProdfromlist4() {
		driver.findElement(ProdDrop4).click();
		WebElement ss = driver.findElement(ProdDrop4);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public String fourthprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(ProdDrop4);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(4).getText();

		return selectedOptionText;

	}

	public void EnterUnitRate4(String num) {
		driver.findElement(UnitRate4).sendKeys(num);
	}

	public void EnterQanty4(String num) {
		driver.findElement(Qunty4).sendKeys(num);
	}

	public void EnterTruck4(String num) {
		driver.findElement(TruckNo4).sendKeys(num);
	}

	public void EnterDrivername4(String name) {
		driver.findElement(DriverName4).sendKeys(name);
	}
	public String Driver4() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(DriverName4);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(4).getText();

		return selectedOptionText;

	}

	public void SelectRecdBy4() {
		driver.findElement(RecevdBy4).click();
		WebElement ss = driver.findElement(RecevdBy4);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public String fourthrecvdby() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy4);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(3).getText();

		return selectedOptionText;

	}

	public void ClickonSave() {
		driver.findElement(Save).click();
	}

	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}

}

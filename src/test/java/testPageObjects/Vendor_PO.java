package testPageObjects;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Vendor_PO {

	WebDriver driver;

	public Vendor_PO(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases = By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By VendorePo = By.xpath("//div[contains(text(),'Vendor PO')]");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By PoNo = By.xpath("//input[contains(@placeholder,'PO NUMBER')]");
	By InvDate = By
			.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[1]/div[1]/div[2]/input");
	By VendNmeDrp = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[1]/div[3]/select");
	By QuoteNo = By.xpath("//input[contains(@placeholder,'QUOTATION NUMBER')]");
	By QuoteDate = By.xpath("//div[5]//div[2]//input[1]");
	By RevCharge = By.xpath(
			"//div[contains(@class,'flex aic gap10 credit-limit')]//div//div//select[contains(@class,'drop-select')]");
	By Narration = By.xpath("//input[contains(@placeholder,'NARRATION')]");
	By ValidUpto = By.xpath("//div[7]//div[2]//input[1]");
	By Poterms = By.xpath("//input[contains(@placeholder,'PO TERMS')]");
	By FetchPONum = By.xpath("//div[normalize-space()='FETCH PO NUMBER']");
	By Proddrop = By.xpath("//div[@class='tableScroll']//table//tr//td//div//select[@class='drop-select']");
	By Unitprice = By.xpath("//tr[2]//td[4]//div[1]//div[1]//input[1]");
	By Qunty = By.xpath("//input[contains(@placeholder,'QUANTITY')]");
	By OtherCharges = By.xpath("//input[@placeholder='0.00']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow = By
			.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");

	// 2nd Add

	By Proddrop2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Unitprice2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By Qunty2 = By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	By OtherCharges2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");

	// 3rd Add

	By Proddrop3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By Unitprice3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By Qunty3 = By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
	By OtherCharges3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");

	// 4th Add

	By Proddrop4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By Unitprice4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By Qunty4 = By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");
	By OtherCharges4 = By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");

	By Save = By.xpath("//div[normalize-space()='SAVE']");

	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonVendorPO() {
		driver.findElement(VendorePo).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void EnterPODate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}

	public void SelectVendName() {
		driver.findElement(VendNmeDrp).click();
		WebElement ss = driver.findElement(VendNmeDrp);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public String VendorName() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(By.xpath("(//select[@class='drop-select'])[1]"));
		List<WebElement> options = ss.findElements(By.tagName("option"));
		options.get(2).click();

		return options.get(2).getText();

	}

	public void EnterQuoteNo(String num) {
		driver.findElement(QuoteNo).sendKeys(num);
	}

	public void EnterQuoteDate(String date) {
		driver.findElement(QuoteDate).sendKeys(date);
	}

	public void EnterNarration(String name) {
		driver.findElement(Narration).sendKeys(name);
	}

	public void EnterValidUpto(String date) {
		driver.findElement(ValidUpto).sendKeys(date);
	}

	public void EnterPOTerms(String name) {
		driver.findElement(Poterms).sendKeys(name);
	}

	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(10);
	}

	public String firstprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(10).getText();

		return selectedOptionText;

	}

	public void Unitprice1(String num) {
		driver.findElement(Unitprice).sendKeys(num);
	}

	public void Unitprice2(String num) {
		driver.findElement(Unitprice2).sendKeys(num);
	}

	public void Unitprice3(String num) {
		driver.findElement(Unitprice3).sendKeys(num);
	}

	public void Unitprice4(String num) {
		driver.findElement(Unitprice4).sendKeys(num);
	}

	public void EnterQanty(String num) {
		driver.findElement(Qunty).sendKeys(num);
	}

	public void EnterOtherCharge(String num) {
		driver.findElement(OtherCharges).sendKeys(num);
	}

	// 2nd
	public void SelectProdfromlist2() {
		driver.findElement(Proddrop2).click();
		WebElement ss = driver.findElement(Proddrop2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}

	public String Secondprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop2);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void EnterQanty2(String num) {
		driver.findElement(Qunty2).sendKeys(num);
	}

	public void EnterOtherCharge2(String num) {
		driver.findElement(OtherCharges2).sendKeys(num);
	}

	// 3rd

	public void SelectProdfromlist3() {
		driver.findElement(Proddrop3).click();
		WebElement ss = driver.findElement(Proddrop3);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}

	public String thirdprod() {
		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop3);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void EnterQanty3(String num) {
		driver.findElement(Qunty3).sendKeys(num);
	}

	public void EnterOtherCharge3(String num) {
		driver.findElement(OtherCharges3).sendKeys(num);
	}

	// 4th
	public void SelectProdfromlist4() {
		driver.findElement(Proddrop4).click();
		WebElement ss = driver.findElement(Proddrop4);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}

	public String forthprod() {

		// String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop4);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void EnterQanty4(String num) {
		driver.findElement(Qunty4).sendKeys(num);
	}

	public void EnterOtherCharge4(String num) {
		driver.findElement(OtherCharges4).sendKeys(num);
	}

	public void ClickOnFetchPO() {
		driver.findElement(FetchPONum).click();
	}

	public void ClickOnCalculate() {
		driver.findElement(Calculate).click();
	}

	public void ClickOnAddRow() {
		driver.findElement(AddRow).click();
	}

	public void ClickonSave() {
		driver.findElement(Save).click();
	}
}

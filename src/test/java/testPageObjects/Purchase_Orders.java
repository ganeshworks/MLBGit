package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Purchase_Orders {

	WebDriver driver;

	public Purchase_Orders(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By sales = By.xpath("//div[contains(text(),'Sales')]");
	By Po = By.xpath("//div[contains(text(),'Customer PO')]");
	By AddBtn = By.xpath("//div[@class='btn btn-success']");
	By PoNUm = By.xpath("//input[contains(@placeholder,'PO NUMBER')]");
	By PoDate = By.xpath("//div[contains(@class,'Modal_modalContent__rRYZG')]//div[2]//div[2]//input[1]");
	By CustName = By.xpath("//input[@placeholder='CUSTOMER NAME']");
	By ValidUpto = By.xpath("//div[4]//div[2]//input[1]");
	By QtNum = By.xpath("//input[contains(@placeholder,'QUOTATION NUMBER')]");
	By Priceflex = By.xpath(
			"//div[contains(@class,'flex aic gap10 credit-limit')]//div//select[contains(@class,'drop-select')]");
	By Footnts = By.xpath("//input[@placeholder='FOOT NOTES']");
	By SaleType = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]");
	By ProdCat = By.xpath("//td[1]//div[1]//select[1]");
	By Proddrop = By.xpath("//td[2]//div[1]//select[1]");
	By Dicont = By.xpath("//input[@placeholder='DISCOUNT ON UNIT PRICE']");
	By Qanty = By.xpath("//input[@placeholder='QUANTITY']");
	By fetchGst = By.xpath("//div[normalize-space()='FETCH GST']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow = By
			.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");

	// 2nd
	By ProdCat2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Proddrop2 = By.xpath("//tr[3]//td[2]//div[1]//select[1]");
	By Dicont2 = By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	By Qanty2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");

	// 3rd
	By ProdCat3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By Proddrop3 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
	By Dicont3 = By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
	By Qanty3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");

	// 4th
	By ProdCat4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By Proddrop4 = By.xpath("//tr[5]//td[2]//div[1]//select[1]");
	By Dicont4 = By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");
	By Qanty4 = By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");

	By Save = By.xpath("//div[normalize-space()='SAVE']");

	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonPO() {
		driver.findElement(Po).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void EnterPoNum(String num) {
		driver.findElement(PoNUm).sendKeys(num);
	}

	public void EnterPODate(String date) {
		driver.findElement(PoDate).sendKeys(date);
	}

	public void EnterCustName(String name) {
		driver.findElement(CustName).sendKeys(name);
	}

	public void EnterValidUpto(String date) {
		driver.findElement(ValidUpto).sendKeys(date);
	}

	public void EnterQtNum(String num) {
		driver.findElement(QtNum).sendKeys(num);
	}

	public void SelectPriceFlex() {
		driver.findElement(Priceflex).click();
		WebElement ss = driver.findElement(Priceflex);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterFootnotes(String name) {
		driver.findElement(Footnts).sendKeys(name);
	}

	public void ClickonSaleType() {
		driver.findElement(SaleType).click();
	}

	public void SelectProdCatfromlist() {
		driver.findElement(ProdCat).click();
		WebElement ss = driver.findElement(ProdCat);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void Enterdisc(String num) {
		driver.findElement(Dicont).sendKeys(num);
	}

	public void EnterQanty(String num) {
		driver.findElement(Qanty).sendKeys(num);
	}

	// 2nd

	public void SelectProdCatfromlist2() {
		driver.findElement(ProdCat2).click();
		WebElement ss = driver.findElement(ProdCat2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectProdfromlist2() {
		driver.findElement(Proddrop2).click();
		WebElement ss = driver.findElement(Proddrop2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void Enterdisc2(String num) {
		driver.findElement(Dicont2).sendKeys(num);
	}

	public void EnterQanty2(String num) {
		driver.findElement(Qanty2).sendKeys(num);
	}

	// 3rd

	public void SelectProdCatfromlist3() {
		driver.findElement(ProdCat3).click();
		WebElement ss = driver.findElement(ProdCat3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectProdfromlist3() {
		driver.findElement(Proddrop3).click();
		WebElement ss = driver.findElement(Proddrop3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void Enterdisc3(String num) {
		driver.findElement(Dicont3).sendKeys(num);
	}

	public void EnterQanty3(String num) {
		driver.findElement(Qanty3).sendKeys(num);
	}

	// 4th

	public void SelectProdCatfromlist4() {
		driver.findElement(ProdCat4).click();
		WebElement ss = driver.findElement(ProdCat4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectProdfromlist4() {
		driver.findElement(Proddrop4).click();
		WebElement ss = driver.findElement(Proddrop4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void Enterdisc4(String num) {
		driver.findElement(Dicont4).sendKeys(num);
	}

	public void EnterQanty4(String num) {
		driver.findElement(Qanty4).sendKeys(num);
	}

	public void ClickOnFetchGst() {
		driver.findElement(fetchGst).click();
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
}

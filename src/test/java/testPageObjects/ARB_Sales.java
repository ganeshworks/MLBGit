package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ARB_Sales {

	WebDriver driver;

	public ARB_Sales(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By sales = By.xpath("//div[contains(text(),'Sales')]");
	By ARbSales = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[3]/div[5]/div[2]");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By SalesInvoiceDate = By.xpath("//input[@type='date']");
	By Fetcinv = By.xpath("//div[normalize-space()='FETCH INVOICE']");
	By CustReg = By.xpath("//div[contains(@class,'flex aic gap10 credit-limit')]//div[3]//select[1]");
	By Custname = By.xpath("//input[contains(@placeholder,'CUSTOMER NAME')]");
	By PoDrop=By.xpath("//div[5]//select[1]");
	By Payterms = By.xpath("//div[6]//select[1]");
	By StaffName = By.xpath("//div[8]//select[1]");
	By VehicleNo = By.xpath("//div[9]//select[1]");
	By Proddrop = By.xpath("//td[1]//div[1]//select[1]");
	By Dicont = By.xpath("//input[contains(@placeholder,'DISCOUNT ON UNIT PRICE')]");
	By Qanty = By.xpath("//input[@placeholder='QUANTITY']");
	By FetchPrice = By.xpath("//div[normalize-space()='FETCH PRICE']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow = By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Previw_Save = By.xpath("//div[normalize-space()='PREVIEW DATA AND SAVE']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	//2nd
	By Proddrop2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Dicont2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By Qanty2 = By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	
	// For the 3rd row
	By Proddrop3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By Dicont3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By Qanty3= By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");

	// For the 4th row
	By Proddrop4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By Dicont4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By Qanty4 = By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");

	

	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonArbSales() {
		driver.findElement(ARbSales).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void EnterSalesDate(String date) {
		driver.findElement(SalesInvoiceDate).sendKeys(date);
	}

	public void SelectCustName() {
		driver.findElement(CustReg).click();
		WebElement ss = driver.findElement(CustReg);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterCustName(String name) {
		driver.findElement(Custname).sendKeys(name);
	}
	
	public void SelectPODrop() {
		driver.findElement(PoDrop).click();
		WebElement ss = driver.findElement(PoDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String Poname() {
		WebElement ss = driver.findElement(PoDrop);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;
		
	}

	public void SelectPayterms() {
		driver.findElement(Payterms).click();
		WebElement ss = driver.findElement(Payterms);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectStaff() {
		driver.findElement(StaffName).click();
		WebElement ss = driver.findElement(StaffName);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String Staff() {
		WebElement ss = driver.findElement(StaffName);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;
		
	}

	public void Selectvehicle() {
		driver.findElement(VehicleNo).click();
		WebElement ss = driver.findElement(VehicleNo);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String Vehicle() {
		WebElement ss = driver.findElement(VehicleNo);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;
		
	}

	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String Productname() {
		WebElement ss = driver.findElement(Proddrop);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;
		
	}

	public void Enterdisc(String num) {
		driver.findElement(Dicont).clear();
		driver.findElement(Dicont).sendKeys(num);
	}

	public void EnterQanty(String num) {
		driver.findElement(Qanty).sendKeys(num);
	}

	
	public void ClickOnFetchInv() {
		driver.findElement(Fetcinv).click();
	}

	public void ClickOnFetchPrice() {
		driver.findElement(FetchPrice).click();
	}

	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}
	
	//2nd
	public void SelectProdfromlist2() {
		driver.findElement(Proddrop2).click();
		WebElement ss = driver.findElement(Proddrop2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}

	public void Enterdisc2(String num) {
		driver.findElement(Dicont2).clear();
		driver.findElement(Dicont2).sendKeys(num);
	}

	public void EnterQanty2(String num) {
		driver.findElement(Qanty2).sendKeys(num);
	}
	
	// For the 3rd row
	public void SelectProdfromlist3() {
	    driver.findElement(Proddrop3).click();
	    WebElement ss = driver.findElement(Proddrop3);
	    Select s = new Select(ss);
	    s.selectByIndex(3);
	}

	public void Enterdisc3(String num) {
	    driver.findElement(Dicont3).clear();
	    driver.findElement(Dicont3).sendKeys(num);
	}

	public void EnterQanty3(String num) {
	    driver.findElement(Qanty3).sendKeys(num);
	}

	// For the 4th row
	public void SelectProdfromlist4() {
	    driver.findElement(Proddrop4).click();
	    WebElement ss = driver.findElement(Proddrop4);
	    Select s = new Select(ss);
	    s.selectByIndex(4);
	}

	public void Enterdisc4(String num) {
	    driver.findElement(Dicont4).clear();
	    driver.findElement(Dicont4).sendKeys(num);
	}

	public void EnterQanty4(String num) {
	    driver.findElement(Qanty4).sendKeys(num);
	}


	public void ClickonSaveAndPreviw() {
		driver.findElement(Previw_Save).click();
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}

	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}

}

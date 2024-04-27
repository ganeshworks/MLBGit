package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Quotations {

	private int selectedCatIndex = -1; // Initialize to

	private int selectedProdIndex = -1;

	private int selectedCatIndex2 = -1; // Initialize to

	private int selectedProdIndex2 = -1;

	private int selectedCatIndex3 = -1; // Initialize to

	private int selectedProdIndex3 = -1;

	private int selectedCatIndex4 = -1; // Initialize to

	private int selectedProdIndex4 = -1;

	WebDriver driver;

	public Quotations(WebDriver d) {
		driver = d;
	}

	By Purchases = By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By VendorePo = By.xpath("//div[contains(text(),'Vendor PO')]");

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By sales = By.xpath("//div[contains(text(),'Sales')]");
	By Quotes = By.xpath("//div[contains(text(),'Quotations')]");
	By EnterPin = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[7]/div/div[2]/div/div/div[1]/div[1]/div/div/div/input");
	By SubmitPin = By.xpath("//div[contains(text(),'SUBMIT')]");
	By AddBtn = By.xpath("//div[@class='btn btn-success']");
	By QuoteDate = By.xpath("//input[@type='date']");
	By CustReg = By.xpath("//div[contains(@class,'Modal_modalContent__rRYZG')]//div[2]//select[1]");
	By Address = By.xpath("//input[@placeholder='ADDRESS']");
	By gstin = By.xpath("//input[@placeholder='GST NO.']");
	By CustName = By.xpath("//input[contains(@placeholder,'CUSTOMER NAME')]");
	By StaffName = By.xpath("//div[contains(@class,'Modal_centered__qwdvX')]//div[6]//select[1]");
	By Staffname2 = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[1]/div[4]/select");
	By Footnts = By.xpath("//input[contains(@placeholder,'FOOT NOTES')]");
	By SaleType = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[2]/div[3]");
	By ProdCat = By.xpath("//td[1]//div[1]//select[1]");
	By Proddrop = By.xpath("//td[2]//div[1]//select[1]");
	By Dicont = By.xpath("//input[contains(@placeholder,'DISCOUNT ON UNIT PRICE')]");
	By Qanty = By.xpath("//input[@placeholder='QUANTITY']");
	By fetchGst = By.xpath("//div[normalize-space()='FETCH GST']");
	By Calculate = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[4]/div[3]");
	By AddRow = By
			.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");

	// 2nd Add
	By ProdCat2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Proddrop2 = By.xpath("//tr[3]//td[2]//div[1]//select[1]");
	By Dicont2 = By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	By Qanty2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");

	// 3rd Add
	By ProdCat3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By Proddrop3 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
	By Dicont3 = By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
	By Qanty3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");

	// 4th Add
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

	public void ClickonQuotations() {
		driver.findElement(Quotes).click();
	}

	public void EnterSecretPin(String num) {
		driver.findElement(EnterPin).sendKeys(num);
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonVendorPO() {
		driver.findElement(VendorePo).click();
	}

	public void ClickonSubmitPin() {
		driver.findElement(SubmitPin).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void EnterQuteDate(String date) {
		driver.findElement(QuoteDate).sendKeys(date);
	}

	public void SelectCustReg() {
		driver.findElement(CustReg).click();
		WebElement ss = driver.findElement(CustReg);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterCustName(String name) {
		driver.findElement(CustName).sendKeys(name);
	}

	public void EnterAddrss(String name) {
		driver.findElement(Address).sendKeys(name);
	}

	public void EnterGstIn(String num) {
		driver.findElement(gstin).sendKeys(num);
	}

	public void SelectStafffromlist() {
		driver.findElement(StaffName).click();
		WebElement ss = driver.findElement(StaffName);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public String staffname() {
		WebElement ss = driver.findElement(StaffName);
		String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();

		return selectedOptionText;

	}

	public void SelectStafffromlist2() {
		driver.findElement(Staffname2).click();
		WebElement ss = driver.findElement(Staffname2);
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
        selectedCatIndex = 1; // Set the selected index for product category
        s.selectByIndex(selectedCatIndex);
    }

    public String ProductCat() {
        WebElement ss = driver.findElement(ProdCat);
        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedCatIndex).getText();
        return selectedOptionText;
    }

    public void SelectProdfromlist() {
        driver.findElement(Proddrop).click();
        WebElement ss = driver.findElement(Proddrop);
        Select s = new Select(ss);
        selectedProdIndex = 1; // Set the selected index for product
        s.selectByIndex(selectedProdIndex);
    }

    public String Productname() {
        WebElement ss = driver.findElement(Proddrop);
        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedProdIndex).getText();
        return selectedOptionText;
    }

	public void Enterdisc(String num) {
		driver.findElement(Dicont).sendKeys(num);
	}

	public void EnterQanty(String num) {
		driver.findElement(Qanty).sendKeys(num);
	}

	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}

	public void ClickOnFetchGst() {
		driver.findElement(fetchGst).click();
	}

	// 2nd

	public void SelectProdCatfromlist2() {
        driver.findElement(ProdCat2).click();
        WebElement ss = driver.findElement(ProdCat2);
        Select s = new Select(ss);
        selectedCatIndex2 = 2; // Set the selected index for product category
        s.selectByIndex(selectedCatIndex2);
    }

    public String ProductCat2() {
        WebElement ss = driver.findElement(ProdCat2);
        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedCatIndex2).getText();
        return selectedOptionText;
    }

    public void SelectProdfromlist2() {
        driver.findElement(Proddrop2).click();
        WebElement ss = driver.findElement(Proddrop2);
        Select s = new Select(ss);
        selectedProdIndex2 = 1; // Set the selected index for product
        s.selectByIndex(selectedProdIndex2);
    }

    public String Productname2() {
        WebElement ss = driver.findElement(Proddrop2);
        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedProdIndex2).getText();
        return selectedOptionText;
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
	        selectedCatIndex3 = 3; // Set the selected index for product category
	        s.selectByIndex(selectedCatIndex3);
	    }

	    public String ProductCat3() {
	        WebElement ss = driver.findElement(ProdCat3);
	        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedCatIndex3).getText();
	        return selectedOptionText;
	    }

	    public void SelectProdfromlist3() {
	        driver.findElement(Proddrop3).click();
	        WebElement ss = driver.findElement(Proddrop3);
	        Select s = new Select(ss);
	        selectedProdIndex3 = 2; // Set the selected index for product
	        s.selectByIndex(selectedProdIndex3);
	    }

	    public String Productname3() {
	        WebElement ss = driver.findElement(Proddrop3);
	        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedProdIndex3).getText();
	        return selectedOptionText;
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
	        selectedCatIndex4 = 1; // Set the selected index for product category
	        s.selectByIndex(selectedCatIndex4);
	    }

	    public String ProductCat4() {
	        WebElement ss = driver.findElement(ProdCat4);
	        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedCatIndex4).getText();
	        return selectedOptionText;
	    }

	    public void SelectProdfromlist4() {
	        driver.findElement(Proddrop4).click();
	        WebElement ss = driver.findElement(Proddrop4);
	        Select s = new Select(ss);
	        selectedProdIndex4 = 13; // Set the selected index for product
	        s.selectByIndex(selectedProdIndex4);
	    }

	    public String Productname4() {
	        WebElement ss = driver.findElement(Proddrop4);
	        String selectedOptionText = ss.findElements(By.tagName("option")).get(selectedProdIndex4).getText();
	        return selectedOptionText;
	    }

	public void Enterdisc4(String num) {
		driver.findElement(Dicont4).sendKeys(num);
	}

	public void EnterQanty4(String num) {
		driver.findElement(Qanty4).sendKeys(num);
	}

	public void ClickonSave() {
		driver.findElement(Save).click();
	}

	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
}


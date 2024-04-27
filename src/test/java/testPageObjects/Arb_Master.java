package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Arb_Master {

	WebDriver driver;

	public Arb_Master(WebDriver d) {
		driver = d;
	}

	By MasterClick = By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick = By.xpath("//div[contains(text(),'Product Master')]");
	By BlpgMasterclick = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[2]/div[2]/div[2]");
	By Drpdown = By.xpath("//select[@class='AO-2nd-ent-select']");

	By AddProduct = By.xpath("//div[@class='btn btn-success']");
	By Productlist = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[1]/div/select");
	By Brand = By.xpath("//input[@placeholder='BRAND']");
	By Product = By.xpath("//input[@placeholder='PRODUCT NAME']");
	By Hsn = By.xpath("//input[@placeholder='HSN CODE']");
	By Units = By.xpath("//td[5]//div[1]//select[1]");
	By Gst = By.xpath("//td[6]//div[1]//select[1]");
	By Purchaseprc = By.xpath("//input[@placeholder='PURCHASE PRICE']");
	By Opstock = By.xpath("//input[@placeholder='OPENING STOCK']");
	By Date = By.xpath("//input[@type='date']");
	By save = By.xpath("//div[normalize-space()='SAVE']");

	By DeleteProduct = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[10]");
	By Confrmdelete = By.xpath("//div[normalize-space()='Delete']");

	By DeleteAddedRow = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[9]");

	// For Add2
	By AddProduct2 = By.xpath("//div[@class='btn btn-success']");
	By Productlist2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Brand2 = By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By Product2 = By.xpath("//tr[3]//td[3]//div[1]//div[1]//input[1]");
	By Hsn2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By Units2 = By.xpath("//tr[3]//td[5]//div[1]//select[1]");
	By Gst2 = By.xpath("//tr[3]//td[6]//div[1]//select[1]");
	By Purchaseprc2 = By.xpath("//tr[3]//td[7]//div[1]//div[1]//input[1]");
	By Opstock2 = By.xpath("//tr[3]//td[8]//div[1]//div[1]//input[1]");
	By Date2 = By.xpath("//tr[3]//td[9]//div[1]//div[1]//input[1]");

	// For Add3
	By AddProduct3 = By.xpath("//div[@class='btn btn-success']");
	By Productlist3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By Brand3 = By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
	By Product3 = By.xpath("//tr[4]//td[3]//div[1]//div[1]//input[1]");
	By Hsn3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By Units3 = By.xpath("//tr[4]//td[5]//div[1]//select[1]");
	By Gst3 = By.xpath("//tr[4]//td[6]//div[1]//select[1]");
	By Purchaseprc3 = By.xpath("//tr[4]//td[7]//div[1]//div[1]//input[1]");
	By Opstock3 = By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
	By Date3 = By.xpath("//tr[4]//td[9]//div[1]//div[1]//input[1]");

	// For Add3
	By AddProduct4 = By.xpath("//div[@class='btn btn-success']");
	By Productlist4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By Brand4 = By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
	By Product4 = By.xpath("//tr[5]//td[3]//div[1]//div[1]//input[1]");
	By Hsn4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By Units4 = By.xpath("//tr[5]//td[5]//div[1]//select[1]");
	By Gst4 = By.xpath("//tr[5]//td[6]//div[1]//select[1]");
	By Purchaseprc4 = By.xpath("//tr[5]//td[7]//div[1]//div[1]//input[1]");
	By Opstock4 = By.xpath("//tr[5]//td[8]//div[1]//div[1]//input[1]");
	By Date4 = By.xpath("//tr[5]//td[9]//div[1]//div[1]//input[1]");

	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}

	public void ClickonProductmaster() {
		driver.findElement(ProductClick).click();
	}

	public void ClickOnBlpg() {
		driver.findElement(BlpgMasterclick).click();
	}

	public void dropdownselect() {
		WebElement ss = driver.findElement(Drpdown);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}

	public void ClickOnAdd() {
		driver.findElement(AddProduct).click();
	}

	public void Selectitemfromlist() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[1]/div/select")).click();

		WebElement ss = driver.findElement(Productlist);
		Select s = new Select(ss);
		s.selectByIndex(5);

	}
	public void Selectitemfromlist2() {
		driver.findElement(By.xpath("//tr[3]//td[1]//div[1]//select[1]")).click();

		WebElement ss = driver.findElement(Productlist2);
		Select s = new Select(ss);
		s.selectByIndex(5);

	}
	public void Selectitemfromlist3() {
		driver.findElement(By.xpath("//tr[4]//td[1]//div[1]//select[1]")).click();

		WebElement ss = driver.findElement(Productlist3);
		Select s = new Select(ss);
		s.selectByIndex(4);

	}
	public void Selectitemfromlist4() {
		driver.findElement(By.xpath("//tr[5]//td[1]//div[1]//select[1]")).click();

		WebElement ss = driver.findElement(Productlist4);
		Select s = new Select(ss);
		s.selectByIndex(3);

	}

	public void AddBrandName(String name) {
		driver.findElement(Brand).sendKeys(name);
	}
	public void AddBrandName2(String name) {
		driver.findElement(Brand2).sendKeys(name);
	}
	public void AddBrandName3(String name) {
		driver.findElement(Brand3).sendKeys(name);
	}
	public void AddBrandName4(String name) {
		driver.findElement(Brand4).sendKeys(name);
	}
	
	public void AddProdName(String name) {
		driver.findElement(Product).sendKeys(name);
	}
	public void AddProdName2(String name) {
		driver.findElement(Product2).sendKeys(name);
	}
	public void AddProdName3(String name) {
		driver.findElement(Product3).sendKeys(name);
	}
	public void AddProdName4(String name) {
		driver.findElement(Product4).sendKeys(name);
	}
	public void AddHsn(String name) {
		driver.findElement(Hsn).sendKeys(name);
		// driver.findElement(By.xpath("//*[@id=\"hsn\"]/option[1]")).click();
	}
	public void AddHsn2(String name) {
		driver.findElement(Hsn2).sendKeys(name);
		// driver.findElement(By.xpath("//*[@id=\"hsn\"]/option[1]")).click();
	}
	public void AddHsn3(String name) {
		driver.findElement(Hsn3).sendKeys(name);
		// driver.findElement(By.xpath("//*[@id=\"hsn\"]/option[1]")).click();
	}
	public void AddHsn4(String name) {
		driver.findElement(Hsn4).sendKeys(name);
		// driver.findElement(By.xpath("//*[@id=\"hsn\"]/option[1]")).click();
	}

	public void DeleteHsn() {
		driver.findElement(Hsn).click();
		// driver.findElement(By.xpath("//*[@id=\"hsn\"]/option[1]")).click();
	}

	public void Selectunitfromlist() {
		driver.findElement(By.xpath("//td[5]//div[1]//select[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[5]/div/select/option[20]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist2() {
		driver.findElement(By.xpath("//tr[3]//td[5]//div[1]//select[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[5]/div/select/option[20]")).click();
		WebElement ss = driver.findElement(Units2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist3() {
		driver.findElement(By.xpath("//tr[4]//td[5]//div[1]//select[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[5]/div/select/option[20]")).click();
		WebElement ss = driver.findElement(Units3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist4() {
		driver.findElement(By.xpath("//tr[5]//td[5]//div[1]//select[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[5]/div/select/option[20]")).click();
		WebElement ss = driver.findElement(Units4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void GstFromList() {
		driver.findElement(By.xpath("//td[6]//div[1]//select[1]")).click();
		/*
		 * driver.findElement(By .xpath(
		 * "//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[6]/div/select/option[4]"
		 * )) .click();
		 */
		WebElement ss = driver.findElement(Gst);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void GstFromList2() {
		driver.findElement(By.xpath("//tr[3]//td[6]//div[1]//select[1]")).click();
		WebElement ss = driver.findElement(Gst2);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void GstFromList3() {
		driver.findElement(By.xpath("//tr[4]//td[6]//div[1]//select[1]")).click();
		WebElement ss = driver.findElement(Gst3);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void GstFromList4() {
		driver.findElement(By.xpath("//tr[5]//td[6]//div[1]//select[1]")).click();
		WebElement ss = driver.findElement(Gst4);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}

	public void AddPurchasePrice(String name) {
		driver.findElement(Purchaseprc).clear();
		driver.findElement(Purchaseprc).sendKeys(name);
	}
	public void AddPurchasePrice2(String name) {
		driver.findElement(Purchaseprc2).clear();
		driver.findElement(Purchaseprc2).sendKeys(name);
	}
	public void AddPurchasePrice3(String name) {
		driver.findElement(Purchaseprc3).clear();
		driver.findElement(Purchaseprc3).sendKeys(name);
	}
	public void AddPurchasePrice4(String name) {
		driver.findElement(Purchaseprc4).clear();
		driver.findElement(Purchaseprc4).sendKeys(name);
	}
	public void AddOpStock(String name) {
		driver.findElement(Opstock).sendKeys(name);
	}
	public void AddOpStock2(String name) {
		driver.findElement(Opstock2).sendKeys(name);
	}
	public void AddOpStock3(String name) {
		driver.findElement(Opstock3).sendKeys(name);
	}
	public void AddOpStock4(String name) {
		driver.findElement(Opstock4).sendKeys(name);
	}
	public void EnterDate(String name) {
		driver.findElement(Date).sendKeys(name);
	}
	public void EnterDate2(String name) {
		driver.findElement(Date2).sendKeys(name);
	}
	public void EnterDate3(String name) {
		driver.findElement(Date3).sendKeys(name);
	}
	public void EnterDate4(String name) {
		driver.findElement(Date4).sendKeys(name);
	}
	public void ClickOnSave() {
		driver.findElement(save).click();
	}

	public void DeleteProductFromList() {
		driver.findElement(DeleteProduct).click();
	}

	public void ConfirmDeleteClick() {
		driver.findElement(Confrmdelete).click();
	}

	public void RemoveAddedRow() {
		driver.findElement(DeleteAddedRow).click();
	}

}

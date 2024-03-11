package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Arb_Master {

	WebDriver driver;
	
	public  Arb_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick=By.xpath("//div[contains(text(),'Product Master')]");
	By BlpgMasterclick=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[2]/div[2]/div[2]");
	By Drpdown=By.xpath("//select[@class='AO-2nd-ent-select']");
	
	By AddProduct=By.xpath("//div[@class='btn btn-success']");
	By Productlist=By.xpath("//td[1]//div[1]//select[1]");
	By Brand=By.xpath("//input[@placeholder='BRAND']");
	By Product=By.xpath("//input[@placeholder='PRODUCT NAME']");
	By Hsn=By.xpath("//input[@placeholder='HSN CODE']");
	By Units=By.xpath("//td[1]//div[1]//select[1]");
	By Gst=By.xpath("//td[6]//div[1]//select[1]");
	By Purchaseprc=By.xpath("//input[@placeholder='PURCHASE PRICE']");
	By Opstock=By.xpath("//input[@placeholder='OPENING STOCK']");
	By Date=By.xpath("//input[@type='date']");
	By save=By.xpath("//div[normalize-space()='SAVE']");
	
	By DeleteProduct =By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[10]");
	By Confrmdelete=By.xpath("//div[normalize-space()='Delete']");
	
	By DeleteAddedRow=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[9]");
	
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
		Select s=new Select(ss);
		s.selectByIndex(2);
	}
	public void ClickOnAdd() {
		driver.findElement(AddProduct).click();
	}
	public void Selectitemfromlist() {
		driver.findElement(By.xpath("//td[1]//div[1]//select[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[1]/div/select/option[6]")).click();
		
		/*
		 * WebElement ss= driver.findElement(Productlist); Select s=new Select(ss);
		 * s.selectByIndex(0);
		 */
	}
	public void AddBrandName(String name) {
		driver.findElement(Brand).sendKeys(name);
	}
	public void AddProdName(String name) {
		driver.findElement(Product).sendKeys(name);
	}

	public void AddHsn() {
		driver.findElement(Hsn).click();
		//driver.findElement(By.xpath("//*[@id=\"hsn\"]/option[1]")).click();
	}
	
	public void Selectunitfromlist() {
		driver.findElement(By.xpath("//td[1]//div[1]//select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[5]/div/select/option[20]")).click();
//		WebElement ss= driver.findElement(Units);
//		Select s=new Select(ss);
//		s.selectByIndex(0);
	}
	
	public void GstFromList() {
		driver.findElement(By.xpath("//td[6]//div[1]//select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[6]/div/select/option[4]")).click();
//		WebElement ss= driver.findElement(Units);
//		Select s=new Select(ss);
//		s.selectByIndex(0);
	}
	
	public void AddPurchasePrice(String name) {
		driver.findElement(Purchaseprc).clear();
		driver.findElement(Purchaseprc).sendKeys(name);
	}
	
	public void AddOpStock(String name) {
		driver.findElement(Opstock).sendKeys(name);
	}
	
	public void EnterDate(String name) {
		driver.findElement(Date).sendKeys(name);
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

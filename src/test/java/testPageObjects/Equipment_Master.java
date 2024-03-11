package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Equipment_Master {
	WebDriver driver;

	public Equipment_Master(WebDriver d) {
		driver = d;
	}

	By MasterClick = By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick = By.xpath("//div[contains(text(),'Product Master')]");
	By EquipmentClick = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[2]/div[1]/div[2]");
	By Drpdown = By.xpath("//select[@class='AO-2nd-ent-select']");

	By AddProduct = By.xpath("//div[@class='btn btn-success']//*[name()='svg']");
	By Productlist = By.xpath("//td[1]//div[1]//select[1]");
	By Units = By.xpath("//td[2]//div[1]//select[1]");
	By Fulls = By.xpath("//input[@placeholder='FULLS']");
	By Date = By.xpath("//input[@type='date']");
	By Save = By.xpath("//div[normalize-space()='SAVE']");

	By DeleteProduct = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[9]");
	By Confrmdelete = By.xpath("//div[normalize-space()='Delete']");

	By DeleteAddedRow = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[9]");

	
	By Delete1=By.xpath("//tr[2]//td[9]");
	By Delete2=By.xpath("//tr[3]//td[9]");
	By Delete3=By.xpath("//tr[4]//td[9]");
	By Delete4=By.xpath("//tr[5]//td[9]");
	By Delete5=By.xpath("//tr[6]//td[9]");
	
	public void delete1(){
		driver.findElement(Delete1).click();
	}
	public void delete2(){
		driver.findElement(Delete2).click();
	}
	public void delete3(){
		driver.findElement(Delete3).click();
	}
	public void delete4(){
		driver.findElement(Delete4).click();
	}
	public void delete5(){
		driver.findElement(Delete5).click();
	}
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}

	public void ClickonProductmaster() {
		driver.findElement(ProductClick).click();
	}

	public void ClickonEquipmentMaster() {
		driver.findElement(EquipmentClick).click();
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
		driver.findElement(By.xpath("//td[1]//div[1]//select[1]")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[1]/div/select/option[2]"
		 * )) .click();
		 * 
		 * WebElement ss = driver.findElement(Productlist); Select s = new Select(ss);
		 * s.selectByVisibleText("COMMERCIAL - 35 Kg VOT");
		 */
	}

	public void Selectunitfromlist() {
		driver.findElement(By.xpath("//td[2]//div[1]//select[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/select/option[2]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterFulls(String name) {
		driver.findElement(Fulls).sendKeys(name);
	}

	public void EnterDate(String name) {
		driver.findElement(Date).sendKeys(name);
	}

	public void ClickOnSave() {
		driver.findElement(Save).click();
	}

	public void DeleteProduct() throws Exception {
		driver.findElement(DeleteProduct).click();

	}

	public void confirmdelete() {
		driver.findElement(Confrmdelete).click();
	}

	public void deleteAddedRow() {
		driver.findElement(DeleteAddedRow).click();
	}

}

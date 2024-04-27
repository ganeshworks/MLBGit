package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Set_CreditLimit {

WebDriver driver;
	
	public  Set_CreditLimit(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By SetCredit=By.xpath("//div[contains(text(),'Discount/Credit Limit')]");
	By EnterPin=By.xpath("//input[@placeholder='Enter Pin Here']");
	By SubmitPin=By.xpath("//div[contains(text(),'SUBMIT')]");
	By AddBtn=By.xpath("//div[contains(@class,'btn btn-success')]");
	By CustList=By.xpath("//div[contains(@class,'flex aic gap10 credit-limit')]//div[1]//div[1]//select[1]");
	By creditLimit=By.xpath("//input[contains(@placeholder,'Credit Limit')]");
	By Contol1=By.xpath("//div[@class='Modal_centered__qwdvX']//div[3]//div[1]//select[1]");
	By creditDay=By.xpath("//input[contains(@placeholder,'Credit Day')]");
	By Control2=By.xpath("//div[5]//div[1]//select[1]");
	By prodList=By.xpath("//div[6]//div[1]//select[1]");
	By Discount1=By.xpath("//input[contains(@value,'0.00')]");
	By EffDate1=By.xpath("//input[contains(@type,'date')]");
	By Save=By.xpath("//div[contains(text(),'SAVE')]");
	
	By view=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[6]");
	By Delete=By.xpath("//td[7]//*[name()='svg']");
	By ConfrmDelete=By.xpath("//div[normalize-space()='Delete']");
	
	//For Add 2nd
	
	By Discount2=By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By EffDate2=By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	
	By EditButton=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[7]/div");
	By creditLimitEdit=By.xpath("//input[@placeholder='Credit Limit']");
	By Contol1Edit=By.xpath("//div[@class='layout-body']//div[3]//div[1]//select[1]");
	By creditDayEdit=By.xpath("//input[contains(@placeholder,'Credit Day')]");
	By Control2Edit=By.xpath("//div[5]//div[1]//select[1]");
	By Discount=By.xpath("//td[4]//div[1]//div[1]//input[1]");
	By EffDate=By.xpath("//input[@value='Invalid date']");
	By AddButton=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div[3]/div[1]/div");
	By SaveEdit=By.xpath("//div[contains(text(),'SAVE')]");
	
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonSetCreditLimit() {
		driver.findElement(SetCredit).click();
	}
	public void EnterSecretPin(String num) {
		driver.findElement(EnterPin).sendKeys(num);	
	}
	public void ClickonSubmitPin() {
		driver.findElement(SubmitPin).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void SelectCust() {
		driver.findElement(CustList).click();
		WebElement ss = driver.findElement(CustList);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterCreditLimit(String num) {
		driver.findElement(creditLimit).sendKeys(num);	
	}
	public void SelectControl1() {
		driver.findElement(Contol1).click();
		WebElement ss = driver.findElement(Contol1);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterCreditDay(String date) {
		driver.findElement(creditDay).sendKeys(date);	
	}
	public void SelectControl2() {
		driver.findElement(Control2).click();
		WebElement ss = driver.findElement(Control2);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectFromProdList() {
		driver.findElement(prodList).click();
		WebElement ss = driver.findElement(prodList);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectFromProdList2() {
		driver.findElement(prodList).click();
		WebElement ss = driver.findElement(prodList);
		Select s=new Select(ss);
		s.selectByIndex(4);
	}
	
	public void EnterDiscount(String num) {
		driver.findElement(Discount1).clear();	
		driver.findElement(Discount1).sendKeys(num);	
	}
	public void EnterDiscount2(String num) {
		driver.findElement(Discount2).clear();	
		driver.findElement(Discount2).sendKeys(num);	
	}
	public void EnterDate(String date) {
		driver.findElement(EffDate1).sendKeys(date);
	}
	public void EnterDate2(String date) {
		driver.findElement(EffDate2).sendKeys(date);
	}
	public void ClickOnSave() {
		driver.findElement(Save).click();
	}
}

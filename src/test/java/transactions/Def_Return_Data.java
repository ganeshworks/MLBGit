package transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Def_Return_Data {


	WebDriver driver;
	
	public  Def_Return_Data(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases=By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By DefReturn=By.xpath("//div[contains(text(),'Defective/Pur return')]");
	By AddBtn=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By PoNo=By.xpath("//input[@placeholder='PURCHASE INVOICE']");
	By InvDate=By.xpath("//input[@type='date']");
	By VendNmeDrp=By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By Narration=By.xpath("//input[@placeholder='NARRATION']");
	By ProdDrop=By.xpath("//div[contains(@class,'tableScroll')]//table//tr//td//div//select[contains(@class,'drop-select')]");
	By FetchGst=By.xpath("//div[normalize-space()='FETCH GST']");
	By RetuQunty=By.xpath("//input[contains(@placeholder,'RETURN QUANTITY')]");
	By NetWeght=By.xpath("//input[@placeholder='NET WEIGHT(KGS)']");
	By VehcleNo=By.xpath("//input[@placeholder='VEHICAL NUMBER']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	By Addrow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonDefRetrn() {
		driver.findElement(DefReturn).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterInvNo(String num) {
		driver.findElement(PoNo).sendKeys(num);
	}
	public void EnterInvDate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}
	public void EnterVendName() {
		driver.findElement(VendNmeDrp).click();
		WebElement ss = driver.findElement(VendNmeDrp);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void EnterNarration(String name) {
		driver.findElement(Narration).sendKeys(name);
	}
	public void SelectProdDrop() {
		driver.findElement(ProdDrop).click();
		WebElement ss = driver.findElement(ProdDrop);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void EnterRetrnQnty(String num) {
		driver.findElement(RetuQunty).sendKeys(num);
	}
	public void EnterNetQnty(String num) {
		driver.findElement(NetWeght).sendKeys(num);
	}
	public void EntervehclName(String name) {
		driver.findElement(VehcleNo).sendKeys(name);
	}
	public void ClickOnFetchGst() {
		driver.findElement(FetchGst).click();
	}
	public void ClickOnCalculate() {
		driver.findElement(Calculate).click();
	}
	public void ClickOnsave() {
		driver.findElement(Save).click();
	}
	
	public void ClickOnAddRow() {
		driver.findElement(Addrow).click();
	}
}

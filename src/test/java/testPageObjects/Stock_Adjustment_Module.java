package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Stock_Adjustment_Module {


	WebDriver driver;
	
	public  Stock_Adjustment_Module(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By StockAdjMaster=By.xpath("//div[contains(text(),'Stock Adjustments Module')]");
	By EnterPin=By.xpath("//input[contains(@placeholder,'Enter Pin Here')]");
	By SubmitPin=By.xpath("//div[contains(text(),'SUBMIT')]");
	By Date=By.xpath("//input[@type='date']");
	By ProdCat=By.xpath("//div[@class='container']//div//div[2]//div[1]//select[1]");
	By prod=By.xpath("//div[@class='layout-body']//div[3]//div[1]//select[1]");
	By AddBtn=By.xpath("//div[contains(text(),'ADD')]");
	By internalTrans=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[2]");
	By FromLoc=By.xpath("//div[@class='pin-ver']//div[1]//div[1]//select[1]");
	By ToLoc=By.xpath("//div[@class='pin-ver']//div//div[2]//div[1]//select[1]");
	By fulls=By.xpath("//div[@class='pin-ver']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]");
	By Empties=By.xpath("//div[@class='pin-ver']//div[1]//div[2]//div[2]//div[1]//div[2]//input[1]");
	By Narration=By.xpath("//input[@placeholder='NARRATION']");
	By Save=By.xpath("//div[contains(text(),'SAVE')]");
	
	By ExtTransf=By.xpath("//div[contains(text(),'EXTERNAL TRANSFER')]");
	
	By Loss=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[4]");
	
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonStockAdjModule() {
		driver.findElement(StockAdjMaster).click();
	}
	public void EnterSecretPin(String num) {
		driver.findElement(EnterPin).sendKeys(num);	
	}
	public void ClickonSubmitPin() {
		driver.findElement(SubmitPin).click();
	}
	public void EnterDate(String date) {
		driver.findElement(Date).sendKeys(date);
	}
	public void SelectProdCatgry() {
		driver.findElement(ProdCat).click();
		WebElement ss = driver.findElement(ProdCat);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectProduct() {
		driver.findElement(prod).click();
		WebElement ss = driver.findElement(prod);
		Select s=new Select(ss);
		s.selectByIndex(2);
	}
	public void ClickonAdd() {
		driver.findElement(AddBtn).click();
	}
	public void ClickonIntTransf() {
		driver.findElement(internalTrans).click();
	}
	public void SelectFromLoc() {
		driver.findElement(FromLoc).click();
		WebElement ss = driver.findElement(FromLoc);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectToLoc() {
		driver.findElement(ToLoc).click();
		WebElement ss = driver.findElement(ToLoc);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterFulls(String num) {
		driver.findElement(fulls).sendKeys(num);
	}
	public void EnterEmpties(String num) {
		driver.findElement(Empties).sendKeys(num);
	}
	public void EnterNarration(String name) {
		driver.findElement(Narration).sendKeys(name);
	}
	public void ClickonExtTransf() {
		driver.findElement(ExtTransf).click();
	}
	public void ClickonIntLoss() {
		driver.findElement(Loss).click();
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
}

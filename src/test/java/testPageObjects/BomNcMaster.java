package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BomNcMaster {

	WebDriver driver;
	
	public  BomNcMaster(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick=By.xpath("//div[contains(text(),'Product Master')]");
	By Bomnc=By.xpath("//div[contains(text(),'BOM/NC Packaging')]");
	By Addbtn=By.xpath("//div[@class='btn btn-success']");
	By Listequp=By.xpath("//div[@class='flex aic gap10 nd-item']//div[1]//div[1]//select[1]");
	By Equipclik=By.xpath("//div[normalize-space()='ADD EQUIPMENT']");
	By ListReg=By.xpath("//div[@class='Modal_modalContent__rRYZG']//div[2]//div[1]//select[1]");
	By Regclick=By.xpath("//div[normalize-space()='ADD REGULATOR']");
	By ListSevc=By.xpath("//div[@class='layout-body']//div[3]//div[1]//select[1]");
	By ServiceClick=By.xpath("//div[normalize-space()='ADD SERVICE']");
	By listArb=By.xpath("//div[4]//div[1]//select[1]");
	By ArbClick=By.xpath("//div[normalize-space()='ADD ARB ITEM']");
	By bomname=By.xpath("//input[@placeholder='NC/DBC PACKAGING NAME']");
	By CheckContypeGenDbcBpl=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[2]/div[2]/div[2]");
	By CheckConTypeLoanCash=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[2]/div[3]/div[2]");
	By DepReqEqp=By.xpath("//tr[2]//td[3]//select[1]");
	By DepReqReg=By.xpath("//tr[3]//td[3]//select[1]");
	By SaveBtn=By.xpath("//div[contains(text(),'SAVE')]");
	By DeleteBom=By.xpath("//body/div[@id='root']/div[@class='layout-main']/div[@class='layout-body']/div[@class='layout-outlet']/div[@class='container']/div[@class='grid']/div[2]/div[3]//*[name()='svg']");
	By ConfrmDelete=By.xpath("//div[normalize-space()='Delete']");
	
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonProductmaster() {
		driver.findElement(ProductClick).click();
	}
	public void ClickOnBomMaster() {
		driver.findElement(Bomnc).click();
	} 
	public void ClickOnAdd() {
		driver.findElement(Addbtn).click();
	} 
	public void EquipmentListSelect() {
		driver.findElement(Listequp).click();
		WebElement ss = driver.findElement(Listequp);
		Select s=new Select(ss);
		s.selectByIndex(4);
	}
	public void ClickOnAddEqupmnt() {
		driver.findElement(Equipclik).click();
	}
	public void RegulatorListSelect() {
		driver.findElement(ListReg).click();
		WebElement ss = driver.findElement(ListReg);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnAddRegultr() {
		driver.findElement(Regclick).click();
	}
	public void ServicesListSelect() {
		driver.findElement(ListSevc).click();
		WebElement ss = driver.findElement(ListSevc);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnAddService() {
		driver.findElement(ServiceClick).click();
	}
	public void ArbListSelect() {
		driver.findElement(listArb).click();
		WebElement ss = driver.findElement(listArb);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnAddArb() {
		driver.findElement(ArbClick).click();
	}
	public void AddBomName(String name) {
		driver.findElement(bomname).sendKeys(name);
	}
	
	public void ClickOnConTypeGenDbcBpl() {
		driver.findElement(CheckContypeGenDbcBpl).click();
	}
	public void ClickOnConTypeLoanCash() {
		driver.findElement(CheckConTypeLoanCash).click();
	}
	
	public void DepRequiredEqp() {
		driver.findElement(DepReqEqp).click();
		WebElement ss = driver.findElement(DepReqEqp);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void DepRequiredReg() {
		driver.findElement(DepReqReg).click();
		WebElement ss = driver.findElement(DepReqReg);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnSaveBtn() {
		driver.findElement(SaveBtn).click();
	}
	public void ClickOnDelete() {
		driver.findElement(DeleteBom).click();
	}
	public void ClickOnConfirmDelete() {
		driver.findElement(ConfrmDelete).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

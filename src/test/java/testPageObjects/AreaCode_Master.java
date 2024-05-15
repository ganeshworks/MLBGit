package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AreaCode_Master {

	WebDriver driver;
	
	public  AreaCode_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick=By.xpath("//div[contains(text(),'Product Master')]");
	By AreaCodeClick=By.xpath("//div[contains(text(),'Area Code Master')]");
	By AddButn=By.xpath("//div[contains(@class,'btn btn-success')]");
	By EnterPin=By.xpath("//input[contains(@placeholder,'PIN CODE')]");
	By EnterAreacode=By.xpath("//input[@placeholder='AREA CODE']");
	By EnterAreaName=By.xpath("//input[@placeholder='AREA NAME']");
	By EnterDistance=By.xpath("//input[@placeholder='DISTANCE (KM)']");
	By EnterCharges=By.xpath("//input[@placeholder='TRANSPORT CHARGES']");
	By EnterDate=By.xpath("//input[@type='date']");
	
	//fOR 2ND Add
	By EnterPin2=By.xpath("//tr[3]//td[1]//div[1]//div[1]//input[1]");
	By EnterAreacode2=By.xpath("//tr[3]//td[2]//div[1]//div[1]//input[1]");
	By EnterAreaName2=By.xpath("//tr[3]//td[3]//div[1]//div[1]//input[1]");
	By EnterDistance2=By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By EnterCharges2=By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	By EnterDate2=By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");
	
	//fOR 3rd Add
		By EnterPin3=By.xpath("//tr[4]//td[1]//div[1]//div[1]//input[1]");
		By EnterAreacode3=By.xpath("//tr[4]//td[2]//div[1]//div[1]//input[1]");
		By EnterAreaName3=By.xpath("//tr[4]//td[3]//div[1]//div[1]//input[1]");
		By EnterDistance3=By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
		By EnterCharges3=By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
		By EnterDate3=By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
	
		//fOR 4th Add
				By EnterPin4=By.xpath("//tr[5]//td[1]//div[1]//div[1]//input[1]");
				By EnterAreacode4=By.xpath("//tr[5]//td[2]//div[1]//div[1]//input[1]");
				By EnterAreaName4=By.xpath("//tr[5]//td[3]//div[1]//div[1]//input[1]");
				By EnterDistance4=By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
				By EnterCharges4=By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");
				By EnterDate4=By.xpath("//tr[5]//td[6]//div[1]//div[1]//input[1]");
	
	
	
	By SaveButn=By.xpath("//div[normalize-space()='SAVE']");
	By Delele=By.xpath("//div[contains(@class,'layout-outlet')]//div[2]//div[1]//table[1]//tr[2]//td[7]");
	By ConfrmDelete=By.xpath("//div[normalize-space()='Delete']");
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonProductmaster() {
		driver.findElement(ProductClick).click();
	}
	public void ClickOnAreaCodeMaster() {
		driver.findElement(AreaCodeClick).click();
	} 
	public void ClickOnAdd() {
		driver.findElement(AddButn).click();
	} 
	public void EnterPincode(String num) {
		driver.findElement(EnterPin).sendKeys(num);
	} 
	public void EnterPincode2(String num) {
		driver.findElement(EnterPin2).sendKeys(num);
	} 
	public void EnterPincode3(String num) {
		driver.findElement(EnterPin3).sendKeys(num);
	} 
	public void EnterPincode4(String num) {
		driver.findElement(EnterPin4).sendKeys(num);
	} 
	public void EnterAreacode(String namenum) {
		driver.findElement(EnterAreacode).sendKeys(namenum);
	} 
	public void EnterAreacode2(String namenum) {
		driver.findElement(EnterAreacode2).sendKeys(namenum);
	} 
	public void EnterAreacode3(String namenum) {
		driver.findElement(EnterAreacode3).sendKeys(namenum);
	} 
	public void EnterAreacode4(String namenum) {
		driver.findElement(EnterAreacode4).sendKeys(namenum);
	} 
	public void EnterAreaNames(String name) {
		driver.findElement(EnterAreaName).sendKeys(name);
	} 
	public void EnterAreaNames2(String name) {
		driver.findElement(EnterAreaName2).sendKeys(name);
	} 
	public void EnterAreaNames3(String name) {
		driver.findElement(EnterAreaName3).sendKeys(name);
	} 
	public void EnterAreaNames4(String name) {
		driver.findElement(EnterAreaName4).sendKeys(name);
	} 
	public void EnterOnewayDistance(String num) {
		driver.findElement(EnterDistance).sendKeys(num);
	}
	public void EnterOnewayDistance2(String num) {
		driver.findElement(EnterDistance2).sendKeys(num);
	}
	public void EnterOnewayDistance3(String num) {
		driver.findElement(EnterDistance3).sendKeys(num);
	}
	public void EnterOnewayDistance4(String num) {
		driver.findElement(EnterDistance4).sendKeys(num);
	}
	public void EnterTansCharges(String num) {
		driver.findElement(EnterCharges).sendKeys(num);
	}
	public void EnterTansCharges2(String num) {
		driver.findElement(EnterCharges2).sendKeys(num);
	}
	public void EnterTansCharges3(String num) {
		driver.findElement(EnterCharges3).sendKeys(num);
	}
	public void EnterTansCharges4(String num) {
		driver.findElement(EnterCharges4).sendKeys(num);
	}
	public void SetDate(String date) {
		driver.findElement(EnterDate).sendKeys(date);
	}
	public void SetDate2(String date) {
		driver.findElement(EnterDate2).sendKeys(date);
	}
	public void SetDate3(String date) {
		driver.findElement(EnterDate3).sendKeys(date);
	}
	public void SetDate4(String date) {
		driver.findElement(EnterDate4).sendKeys(date);
	}
	public void ClickOnSaveButton() {
		driver.findElement(SaveButn).click();
	}
	public void ClickOnDeleteButton() {
		driver.findElement(Delele).click();
	}
	
	public void ClickOnConfrmDeleteButton() {
		driver.findElement(ConfrmDelete).click();
	}
	
	
	
	
	
	
	
	
	
}

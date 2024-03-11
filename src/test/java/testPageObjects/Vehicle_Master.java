package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Vehicle_Master {

	WebDriver driver;
	
	public  Vehicle_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By VehicleMaster=By.xpath("//div[contains(text(),'Vehicles Master')]");
	By AddBtn=By.xpath("//div[@class='flex aic jcsb gap10']//div[1]");
	By VehicleNo=By.xpath("//input[@placeholder='VEHICLE NUMBER']");
	By MakeVehicle=By.xpath("//input[@placeholder='VEHICLE MAKE']");
	By Vehcletype=By.xpath("//td[3]//div[1]//select[1]");
	By VehicleUse=By.xpath("//td[4]//div[1]//select[1]");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	By DownExcel=By.xpath("//div[normalize-space()='DOWNLOAD EXCEL']");
	By UpExcel=By.xpath("//div[normalize-space()='UPLOAD EXCEL']");
	By BackButton=By.xpath("//div[@class='btn btn-info']");
	By Delete=By.xpath("//tr[2]//td[5]");
	By ConfmDelete=By.xpath("//div[normalize-space()='Delete']");
	By Dropdown=By.xpath("//select[@class='AO-2nd-ent-select']");
	By Next=By.xpath("//span[normalize-space()='Next']");
	By Previous=By.xpath("//span[normalize-space()='Previous']");
	
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonVehiclemaster() {
		driver.findElement(VehicleMaster).click();
	}
	public void ClickonAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterVehicleNo(String name) {
		driver.findElement(VehicleNo).sendKeys(name);
	}
	public void VehicleMake(String name) {
		driver.findElement(MakeVehicle).sendKeys(name);
	}
	public void SelectVehicleType() {
		driver.findElement(Vehcletype).click();
		WebElement ss = driver.findElement(Vehcletype);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectVehicleUse() {
		driver.findElement(VehicleUse).click();
		WebElement ss = driver.findElement(VehicleUse);
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickOnUploadExcel() {
		driver.findElement(UpExcel).click();
	}
	public void ClickOnDownloadExcel() {
		driver.findElement(DownExcel).click();
	}
	public void ClickOnBackButn() {
		driver.findElement(BackButton).click();
	}
	public void ClickOnDelete() {
		driver.findElement(Delete).click();
	}
	public void ClickOnConfrmDelete() {
		driver.findElement(ConfmDelete).click();
	}
	public void DropdownAll() {
		driver.findElement(Dropdown).click();
	}
	public void NextButtn() {
		driver.findElement(Next).click();
	}
	public void Previousbtn() {
		driver.findElement(Previous).click();
	}
}

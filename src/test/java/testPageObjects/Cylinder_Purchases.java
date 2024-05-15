package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cylinder_Purchases {

	WebDriver driver;

	public Cylinder_Purchases(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases = By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By CylPurchase = By.xpath("//div[contains(text(),'Cylinder Purchases')]");
	By AddBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By OmcType = By.xpath("//div[@class='flex aic gap10 credit-limit']//div//select[@class='drop-select']");
	By RefNo = By.xpath("//input[@placeholder='INV REF NO']");
	By InvDate = By.xpath("//div[@class='layout-body']//div[3]//div[2]//input[1]");
	By StockDate = By.xpath("//div[4]//div[2]//input[1]");
	By Proddrop = By.xpath("//td[1]//div[1]//select[1]");
	By OneTwoLoad = By.xpath("//td[3]//div[1]//select[1]");
	By UnitRate = By.xpath("//input[@placeholder='UNIT RATE']");
	By Qunty = By.xpath("//input[@placeholder='QUANTITY']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By TruckNo = By.xpath("//input[contains(@placeholder,'TRUCK NUMBER')]");
	By DriverName = By.xpath("//input[@placeholder='DRIVER NAME']");
	By GodwnDrop = By.xpath("//td[12]//div[1]//select[1]");
	By RecevdBy = By.xpath("//td[13]//div[1]//select[1]");
	By AddRow = By
			.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");

	// 2nd

	By Proddrop2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By OneTwoLoad2 = By.xpath("//tr[3]//td[3]//div[1]//select[1]");
	By UnitRate2 = By.xpath("//tr[3]//td[4]//div[1]//div[1]//input[1]");
	By Qunty2 = By.xpath("//tr[3]//td[5]//div[1]//div[1]//input[1]");
	By TruckNo2 = By.xpath("//tr[3]//td[10]//div[1]//div[1]//input[1]");
	By DriverName2 = By.xpath("//tr[3]//td[11]//div[1]//div[1]//input[1]");
	By GodwnDrop2 = By.xpath("//tr[3]//td[12]//div[1]//select[1]");
	By RecevdBy2 = By.xpath("//tr[3]//td[13]//div[1]//select[1]");

	// 3rd

	By Proddrop3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By OneTwoLoad3 = By.xpath("//tr[4]//td[3]//div[1]//select[1]");
	By UnitRate3 = By.xpath("//tr[4]//td[4]//div[1]//div[1]//input[1]");
	By Qunty3 = By.xpath("//tr[4]//td[5]//div[1]//div[1]//input[1]");
	By TruckNo3 = By.xpath("//tr[4]//td[10]//div[1]//div[1]//input[1]");
	By DriverName3 = By.xpath("//tr[4]//td[11]//div[1]//div[1]//input[1]");
	By GodwnDrop3 = By.xpath("//tr[4]//td[12]//div[1]//select[1]");
	By RecevdBy3 = By.xpath("//tr[4]//td[13]//div[1]//select[1]");

	// 4th

	By Proddrop4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By OneTwoLoad4 = By.xpath("//tr[5]//td[3]//div[1]//select[1]");
	By UnitRate4 = By.xpath("//tr[5]//td[4]//div[1]//div[1]//input[1]");
	By Qunty4 = By.xpath("//tr[5]//td[5]//div[1]//div[1]//input[1]");
	By TruckNo4 = By.xpath("//tr[5]//td[10]//div[1]//div[1]//input[1]");
	By DriverName4 = By.xpath("//tr[5]//td[11]//div[1]//div[1]//input[1]");
	By GodwnDrop4 = By.xpath("//tr[5]//td[12]//div[1]//select[1]");
	By RecevdBy4 = By.xpath("//tr[5]//td[13]//div[1]//select[1]");
	
	By LoadAccSub=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[8]/div/div[2]/div[2]/div[2]");
	
	By DeleteCard=By.xpath("//body/div[@id='root']/div[@class='layout-main']/div[@class='layout-body']/div[@class='layout-outlet']/div[@class='container']/div[@class='grid']/div[1]/div[2]//*[name()='svg']//*[name()='path' and contains(@d,'M135.2 17.')]");
	By SubmitDelete=By.xpath("//div[normalize-space()='DELETE']");

	By Save = By.xpath("//div[normalize-space()='SAVE']");
	
	By CardView=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonCylPurc() {
		driver.findElement(CylPurchase).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void SelectOmcfromlist() throws Exception {
		driver.findElement(OmcType).click();
		WebElement ss = driver.findElement(OmcType);
		Select s = new Select(ss);
		Thread.sleep(2000);
		s.selectByIndex(1);
	}

	public void EnterRefNo(String num) {
		driver.findElement(RefNo).sendKeys(num);
	}

	public void EnterInvDate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}

	public void EnterStckRecDate(String date) {
		driver.findElement(StockDate).sendKeys(date);
	}

	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String firstprod() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void SelectLoadType() {
		driver.findElement(OneTwoLoad).click();
		WebElement ss = driver.findElement(OneTwoLoad);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String firstload() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(OneTwoLoad);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void EnterUnitRate(String num) {
		driver.findElement(UnitRate).sendKeys(num);
	}

	public void EnterQanty(String num) {
		driver.findElement(Qunty).sendKeys(num);
	}

	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}

	public void EnterTruck(String num) {
		driver.findElement(TruckNo).sendKeys(num);
	}

	public void EnterDrivername(String name) {
		driver.findElement(DriverName).sendKeys(name);
	}

	public void SelectGodown() {
		driver.findElement(GodwnDrop).click();
		WebElement ss = driver.findElement(GodwnDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	

	public void SelectRecdBy() {
		driver.findElement(RecevdBy).click();
		WebElement ss = driver.findElement(RecevdBy);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String firstrecvdBy() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	// 2nd

	public void SelectProdfromlist2() {
		driver.findElement(Proddrop2).click();
		WebElement ss = driver.findElement(Proddrop2);
		Select s = new Select(ss);
		s.selectByIndex(4);
		
	}
	public String secondprod() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop2);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void SelectLoadType2() {
		driver.findElement(OneTwoLoad2).click();
		WebElement ss = driver.findElement(OneTwoLoad2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public String secondload() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(OneTwoLoad2);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void EnterUnitRate2(String num) {
		driver.findElement(UnitRate2).sendKeys(num);
	}

	public void EnterQanty2(String num) {
		driver.findElement(Qunty2).sendKeys(num);
	}

	public void EnterTruck2(String num) {
		driver.findElement(TruckNo2).sendKeys(num);
	}

	public void EnterDrivername2(String name) {
		driver.findElement(DriverName2).sendKeys(name);
	}

	public void SelectGodown2() {
		driver.findElement(GodwnDrop2).click();
		WebElement ss = driver.findElement(GodwnDrop2);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public String secondgodwn() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(GodwnDrop2);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(1).getText();
		 String selectedOptionTxt=selectedOptionText.substring(0,10);
		 
		 return selectedOptionTxt;
		
		
	}


	public void SelectRecdBy2() {
		driver.findElement(RecevdBy2).click();
		WebElement ss = driver.findElement(RecevdBy2);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public String secondrecvdBy() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy2);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	// 3rd

	public void SelectProdfromlist3() {
		driver.findElement(Proddrop3).click();
		WebElement ss = driver.findElement(Proddrop3);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public String thirdprod() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop3);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(3).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void SelectLoadType3() {
		driver.findElement(OneTwoLoad3).click();
		WebElement ss = driver.findElement(OneTwoLoad3);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public String thirdload() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(OneTwoLoad3);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void EnterUnitRate3(String num) {
		driver.findElement(UnitRate3).sendKeys(num);
	}

	public void EnterQanty3(String num) {
		driver.findElement(Qunty3).sendKeys(num);
	}

	public void EnterTruck3(String num) {
		driver.findElement(TruckNo3).sendKeys(num);
	}

	public void EnterDrivername3(String name) {
		driver.findElement(DriverName3).sendKeys(name);
	}

	public void SelectGodown3() {
		driver.findElement(GodwnDrop3).click();
		WebElement ss = driver.findElement(GodwnDrop3);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectRecdBy3() {
		driver.findElement(RecevdBy3).click();
		WebElement ss = driver.findElement(RecevdBy3);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public String thirdrecvdBy() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy3);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(4).getText();
		 
		 return selectedOptionText;
		
		
	}

	// 4th

	public void SelectProdfromlist4() {
		driver.findElement(Proddrop4).click();
		WebElement ss = driver.findElement(Proddrop4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public String fourthprod() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(Proddrop4);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void SelectLoadType4() {
		driver.findElement(OneTwoLoad4).click();
		WebElement ss = driver.findElement(OneTwoLoad4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public String fourthload() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(OneTwoLoad4);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(2).getText();
		 
		 return selectedOptionText;
		
		
	}

	public void EnterUnitRate4(String num) {
		driver.findElement(UnitRate4).sendKeys(num);
	}

	public void EnterQanty4(String num) {
		driver.findElement(Qunty4).sendKeys(num);
	}

	public void EnterTruck4(String num) {
		driver.findElement(TruckNo4).sendKeys(num);
	}

	public void EnterDrivername4(String name) {
		driver.findElement(DriverName4).sendKeys(name);
	}

	public void SelectGodown4() {
		driver.findElement(GodwnDrop4).click();
		WebElement ss = driver.findElement(GodwnDrop4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectRecdBy4() {
		driver.findElement(RecevdBy4).click();
		WebElement ss = driver.findElement(RecevdBy4);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public String fourthrecvdBy() {
		//String sss=driver.findElement(Proddrop2).getText();
		WebElement ss = driver.findElement(RecevdBy4);
		 String selectedOptionText = ss.findElements(By.tagName("option")).get(4).getText();
		 
		 return selectedOptionText;
		
		
	}
	public void ClickonLoadSub() {
		driver.findElement(LoadAccSub).click();
	}

	public void ClickonSave() {
		driver.findElement(Save).click();
	}

	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	
	public void ClickonDeleteCard() {
		driver.findElement(DeleteCard).click();
	}
	public void ClickonSubmitdelete() {
		driver.findElement(SubmitDelete).click();
	}

	public void ClickonView() {
		driver.findElement(CardView).click();
	}
	
}

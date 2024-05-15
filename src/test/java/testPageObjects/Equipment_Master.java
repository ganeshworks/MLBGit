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
	By ProductClick = By.xpath("/html/body/div/div[1]/div[1]/div/section/div[1]/div[2]");
	By EquipmentClick = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[2]/div[1]/div[2]");
	By Drpdown = By.xpath("//select[@class='AO-2nd-ent-select']");

	By AddProduct = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By Productlist = By.xpath("//td[1]//div[1]//select[1]");
	By Units = By.xpath("//td[2]//div[1]//select[1]");
	By Fulls = By.xpath("//input[@placeholder='FULLS']");
	By Empties=By.xpath("//input[@placeholder='EMPTIES']");
	By Date = By.xpath("//input[@type='date']");
	By Save = By.xpath("//div[normalize-space()='SAVE']");

	By DeleteProduct = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[9]");
	By Confrmdelete = By.xpath("//div[normalize-space()='Delete']");

	By DeleteAddedRow = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[9]");

	//For Add Row 2
	By AddProduct2 = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By Productlist2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Units2 = By.xpath("//tr[3]//td[2]//div[1]//select[1]");
	By Fulls2 = By.xpath("//tr[3]//td[6]//div[1]//div[1]//input[1]");
	By Empties2=By.xpath("//tr[3]//td[7]//div[1]//div[1]//input[1]");
	By Date2 = By.xpath("//tr[3]//td[8]//div[1]//div[1]//input[1]");
	By Save2 = By.xpath("//div[normalize-space()='SAVE']");
	
	//For Add Row 3
	By AddProduct3 = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By Productlist3 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By Units3 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
	By Fulls3 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
	By Empties3=By.xpath("//tr[4]//td[7]//div[1]//div[1]//input[1]");
	By Date3= By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
	By Save3 = By.xpath("//div[normalize-space()='SAVE']");
	
	//For Add Row 4
		By AddProduct4 = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
		By Productlist4 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
		By Units4 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
		By Fulls4 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
		By Empties4=By.xpath("//tr[4]//td[7]//div[1]//div[1]//input[1]");
		By Date4= By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
		By Save4 = By.xpath("//div[normalize-space()='SAVE']");
		
	//For Add Row 4
				By AddProduct5 = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
				By Productlist5 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
				By Units5 = By.xpath("//tr[4]//td[2]//div[1]//select[1]");
				By Fulls5 = By.xpath("//tr[4]//td[6]//div[1]//div[1]//input[1]");
				By Empties5=By.xpath("//tr[4]//td[7]//div[1]//div[1]//input[1]");
				By Date5= By.xpath("//tr[4]//td[8]//div[1]//div[1]//input[1]");
				By Save5 = By.xpath("//div[normalize-space()='SAVE']");
	
				
	By TableSave=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div");
	By Pagenation=By.xpath("//select[@class='AO-2nd-ent-select']");
				
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
		s.selectByIndex(1);
	}
	

	public void ClickOnAdd() {
		driver.findElement(AddProduct).click();
	}
	public void ClickOnAdd2() {
		driver.findElement(AddProduct2).click();
	}
	public void ClickOnAdd3() {
		driver.findElement(AddProduct3).click();
	}
	public void ClickOnAdd4() {
		driver.findElement(AddProduct4).click();
	}
	public void ClickOnAdd5() {
		driver.findElement(AddProduct4).click();
	}
	
	public void Selectitemfromlist() {
		driver.findElement(By.xpath("//td[1]//div[1]//select[1]")).click();
		Select ss = new Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));

		ss.selectByIndex(1);
	}
	public void Selectitemfromlist2() {
		driver.findElement(By.xpath("//tr[3]//td[1]//div[1]//select[1]")).click();
		Select ss = new Select(driver.findElement(By.xpath("//tr[3]//td[1]//div[1]//select[1]")));

		ss.selectByIndex(2);
	}
	public void Selectitemfromlist3() {
		driver.findElement(By.xpath("//tr[4]//td[1]//div[1]//select[1]")).click();
		Select ss = new Select(driver.findElement(By.xpath("//tr[4]//td[1]//div[1]//select[1]")));

		ss.selectByIndex(3);
	}
	public void Selectitemfromlist4() {
		driver.findElement(By.xpath("//tr[5]//td[1]//div[1]//select[1]")).click();
		Select ss = new Select(driver.findElement(By.xpath("//tr[5]//td[1]//div[1]//select[1]")));

		ss.selectByIndex(4);
	}
	public void Selectitemfromlist5() {
		driver.findElement(By.xpath("//tr[6]//td[1]//div[1]//select[1]")).click();
		Select ss = new Select(driver.findElement(By.xpath("//tr[6]//td[1]//div[1]//select[1]")));

		ss.selectByIndex(5);
	}
	
	public void Selectunitfromlist() {
		driver.findElement(By.xpath("//td[2]//div[1]//select[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/select/option[2]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist2() {
		driver.findElement(By.xpath("//tr[3]//td[2]//div[1]//select[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/select/option[2]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist3() {
		driver.findElement(By.xpath("//tr[4]//td[2]//div[1]//select[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/select/option[2]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist4() {
		driver.findElement(By.xpath("//tr[5]//td[2]//div[1]//select[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/select/option[2]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Selectunitfromlist5() {
		driver.findElement(By.xpath("//tr[6]//td[2]//div[1]//select[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/select/option[2]")).click();
		WebElement ss = driver.findElement(Units);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	

	public void EnterFulls(String name) {
		driver.findElement(Fulls).sendKeys(name);
	}
	public void EnterFulls2(String name) {
		driver.findElement(Fulls2).sendKeys(name);
	}
	public void EnterFulls3(String name) {
		driver.findElement(Fulls3).sendKeys(name);
	}
	public void EnterFulls4(String name) {
		driver.findElement(Fulls4).sendKeys(name);
	}
	public void EnterFulls5(String name) {
		driver.findElement(Fulls5).sendKeys(name);
	}
	public void EnterEmpties(String name) {
		driver.findElement(Empties).sendKeys(name);
	}
	public void EnterEmpties2(String name) {
		driver.findElement(Empties2).sendKeys(name);
	}
	public void EnterEmpties3(String name) {
		driver.findElement(Empties3).sendKeys(name);
	}
	public void EnterEmpties4(String name) {
		driver.findElement(Empties4).sendKeys(name);
	}
	public void EnterEmpties5(String name) {
		driver.findElement(Empties5).sendKeys(name);
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
	public void EnterDate5(String name) {
		driver.findElement(Date5).sendKeys(name);
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
	public void tabledate() {
		driver.findElement(TableSave);
	}

}

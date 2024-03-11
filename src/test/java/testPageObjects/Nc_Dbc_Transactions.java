package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nc_Dbc_Transactions {


	WebDriver driver;
	
	public  Nc_Dbc_Transactions(WebDriver d) {
		driver=d;
	}
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By Nc_Dbc=By.xpath("//body/div[@id='root']/div[@class='layout-main']/div[@class='layout-sidebar']/div[@class='sidebar-main']/section/div[2]");
	By NcDbc=By.xpath("//div[@class='list-title fs12'][normalize-space()='NC / DBC']");
	
}

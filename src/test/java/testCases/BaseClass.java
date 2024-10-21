package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;

import testUtilities.ReadConfig;
import testUtilities.SqlQuery;

public class BaseClass {

	public static WebDriver driver;

	ReadConfig read = new ReadConfig();

	TodayDate td = new TodayDate();

	RandomData Rd = new RandomData();
	
	ExcelData Ed=new ExcelData();
	
	SqlQuery Sql=new SqlQuery();
	
	// Sql_Insert sqlInsert = new Sql_Insert();
	 
	 
	
	ThreeMonthsDate Threem=new ThreeMonthsDate();

	public String Todaydate = td.getFormattedDate();

	public String Randomstring = Rd.randomstring();

	public String RandomInt = Rd.randomInt();
	
	public String Random3=Rd.randomIntThree();

	public String Vehiclenum = Rd.randomVehicleNum();

	public String baseurl = read.geturl();

	public String username = read.getusername();

	public String password = read.paswrd();
	
	public String Sqldata=Sql.Pref();
	
	public String threems=Threem.getFormattedDateAfter3Months();

	public static Logger logg;

	@BeforeTest
	public void setup() {

		// ------- To Launch FireFox-------

		/*
		 * System.setProperty("webdriver.gecko.driver", read.firefox()); driver = new
		 * FirefoxDriver();
		 */

		// -------To Launch Chrome--------

		System.setProperty("webdriver.chrome.driver", read.chrome());

		driver = new ChromeDriver();

		// -------To Launch Microsoft Edge Browser-------

		/*
		 * System.setProperty("webdriver.edge.driver", read.EdgeBrowser()); driver = new
		 * EdgeDriver();
		 */

		// -------To Launch Chrome Incognite-------

		/*
		 * System.setProperty("webdriver.chrome.driver", read.chrome());
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito"); driver = new ChromeDriver(options);
		 */

		// -------To launch FireFox Incognite'-------

		/*
		 * System.setProperty("webdriver.gecko.driver", read.firefox()); driver = new
		 * FirefoxDriver(); FirefoxOptions options = new FirefoxOptions();
		 * options.addArguments("-private"); driver = new FirefoxDriver(options);
		 */

		// -------To Launch Edge Incognite-------

		/*
		 * System.setProperty("webdriver.edge.driver", read.EdgeBrowser()); EdgeOptions
		 * options = new EdgeOptions(); options.setCapability("useInPrivateBrowsing",
		 * true); driver = new EdgeDriver(options);
		 */

		logg = Logger.getLogger("Mylpgbooks");
		PropertyConfigurator.configure("log4j.properties");

	}

	public void captureScreenshot(WebDriver driver, String tname) throws IOException {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}
}

package testUtilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;


public class Test {
    
    public static void main(String[] args) throws Exception {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Luma\\drivers\\chromedriverToday.exe");

        // Create the first WebDriver instance for the first window
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        // Open the first URL in the first window
        driver.get("https://mylpg.pmpframe.com/login");
        System.out.println("First window URL: " + driver.getCurrentUrl());

        // Create the second WebDriver instance for the second window
        WebDriver driver1 = new ChromeDriver();
        
        // Open the second URL in the second window
        driver1.get("https://www.google.com");
        System.out.println("Second window URL: " + driver1.getCurrentUrl());

        // Allow some time for the pages to load
        Thread.sleep(3000);

        // Get window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Print the window handles
        for (String handle : windowHandles) {
            System.out.println("Window Handle: " + handle);
        }

        // Switch to the first window (you can switch to driver1 as needed)
        driver.switchTo().window(driver.getWindowHandle());
        System.out.println("Switched to first window: " + driver.getCurrentUrl());

        // Optionally, perform actions on the first window
        // ...

        // Switch to the second window
        driver1.switchTo().window(driver1.getWindowHandle());
        System.out.println("Switched to second window: " + driver1.getCurrentUrl());

        // Optionally, perform actions on the second window
        // ...
        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f1, new File("./Drivers/test.png"));
        
        // Close the drivers
        
        
        //driver.quit();
        //driver1.quit();
    }
}

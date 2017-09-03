package utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Acer on 03/09/2017.
 */
public class BrowserFactory {

    public static WebDriver driver;

    public static void openBrowser(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.get(AutomationConstant.URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public static void closeBrowser(){
        driver.quit();
    }
}


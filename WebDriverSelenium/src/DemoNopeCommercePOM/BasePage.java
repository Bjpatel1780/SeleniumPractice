package DemoNopeCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 01/04/2017.
 */
public class BasePage {

    public static WebDriver driver = new FirefoxDriver();

    //This will open the browser
    public static void openBrowser(){
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    //This will close the browser
    public static void closeBrowser(){
        driver.quit();
    }
}

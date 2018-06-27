package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    public static WebDriver driver;

    public static void init() {
        ChromeOptions options =  new ChromeOptions();
        options.setCapability("chromeOptions", options);
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Assistant.fileSeparator + "drivers" + Assistant.fileSeparator + "chromedriver.exe");
        driver = new ChromeDriver(options);
    }
}
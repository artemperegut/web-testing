package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class Driver {
    public static WebDriver driver;
    public static Config config = new Config();

    @BeforeSuite
    public static void startUp() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("chromeOptions", options);
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Assistant.fileSeparator + "drivers" + Assistant.fileSeparator + "chromedriver.exe");

        config.loadFromFile();
        driver = new ChromeDriver(options);
        driver.get(config.getProperty("host"));
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
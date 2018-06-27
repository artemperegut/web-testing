package suites;

import org.testng.annotations.Test;
import util.Driver;

public class TestSuite {

    @Test(description = "Test")
    public void test() {
        Driver.init();
        Driver.driver.get("https://stackoverflow.com");
    }
}
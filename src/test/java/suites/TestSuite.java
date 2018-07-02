package suites;

import org.testng.annotations.Test;
import utils.Driver;

public class TestSuite {

    @Test(description = "Test")
    public void test() {
        Driver.startUp();
    }
}
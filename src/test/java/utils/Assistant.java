package utils;

import org.openqa.selenium.By;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

public class Assistant {
    public static String fileSeparator = System.getProperty("file.separator");

    public static By getByWebLocator(String locator) {
        if (locator.startsWith("id:")) {
            locator = locator.replaceFirst("id:", "");
            return By.id(locator);
        } else if (locator.startsWith("name:")) {
            locator = locator.replaceFirst("name:", "");
            return By.name(locator);
        } else {
            return isXPath(locator) ? By.xpath(locator) : By.cssSelector(locator);
        }
    }

    public static boolean isXPath(String xpathExpression) {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();

        try {
            xpath.compile(xpathExpression);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }
}
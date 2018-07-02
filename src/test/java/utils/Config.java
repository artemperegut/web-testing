package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    FileInputStream fis;
    Properties property = new Properties();
    private String fullPath;

    public void loadFromFile() {
        this.fullPath = System.getProperty("user.dir") + Assistant.fileSeparator + "configs" + Assistant.fileSeparator + "config1.properties";

        try {
            fis = new FileInputStream(fullPath);
            this.property.load(fis);
        } catch (FileNotFoundException e) {
            throw new FailException("No config file: " + fullPath);
        } catch (IOException e) {
            throw new FailException("Can't open file: " + fullPath);
        }
    }

    public String getProperty(String key) {
        return this.property.containsKey(key) ? this.property.getProperty(key).trim() : null;
    }
}
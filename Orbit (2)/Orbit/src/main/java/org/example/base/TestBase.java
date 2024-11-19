package org.example.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties properties = new Properties();

    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();  // Initialize driver if not already done
        }
        return driver;
    }

    public static void initializeDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    public static void loadCredentialsPropertyFile(){
        try {
            FileInputStream file = new FileInputStream("src/main/resources/Properties/credentials.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void browserSetup() {
        initializeDriver();
    }


    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;  // Set driver to null after quitting to avoid stale references
        }
    }
}

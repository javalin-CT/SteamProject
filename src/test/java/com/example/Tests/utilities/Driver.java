package com.example.Tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null) {
            switch (ConfigReader.get("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chromeHeadless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }

        }
        return driver;
    }
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
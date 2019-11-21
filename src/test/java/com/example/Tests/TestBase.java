package com.example.Tests;

import com.example.Tests.utilities.ConfigReader;
import com.example.Tests.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends Driver{
    protected WebDriver driver;
    protected Actions actions;
    protected String url = ConfigReader.get("url");
    protected String userName = ConfigReader.get("username");
    protected String password = ConfigReader.get("password");

    @BeforeMethod
    public void setUp(){
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        actions = new Actions(driver);

    }
    @AfterMethod
    public void close() throws InterruptedException{
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}

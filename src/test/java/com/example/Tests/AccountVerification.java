package com.example.Tests;

import com.example.Tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountVerification  extends TestBase {
    @Test
    public void Login() throws InterruptedException{
        //get steam homepage url
        driver.get(url);

        //click login button
        WebElement login = driver.findElement(By.xpath("//a[.='login']"));
        login.click();

        //input username
        WebElement userNameInput = driver.findElement(By.id("input_username"));
        userNameInput.sendKeys(userName);

        //input password
        WebElement passwordInput = driver.findElement(By.id("input_password"));
        passwordInput.sendKeys(password);

        //click sign in button
        WebElement signInBtn = driver.findElement(By.xpath("//span[.='Sign in']"));
        signInBtn.click();

        Thread.sleep(2000);

        //verify welcome page title
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, "Welcome to Steam");
        System.out.println("Verify Welcome Page Test Passed");

        Thread.sleep(2000);

        //click account drop down
        WebElement accntDropDown = driver.findElement(By.id("account_pulldown"));
        accntDropDown.click();

        //click account details
        WebElement accntDetails = driver.findElement(By.xpath("(//a[.='Account details'])[2]"));
        accntDetails.click();

        //verify account page title
        actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, "letstakealook's account");
        System.out.println("Verify Account Page Test Passed");

        //verify email address
        String expectedEmail = "warren.jonathanc@gmail.com";
        String actualEmail = driver.findElement(By.xpath("(//span[@class=\"account_data_field\"])[2]")).getText();
        Assert.assertEquals(actualEmail, expectedEmail);
        System.out.println("Verify Email Test Passed");

    }

}

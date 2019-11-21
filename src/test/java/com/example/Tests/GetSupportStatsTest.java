package com.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetSupportStatsTest extends TestBase{
    @Test
    public void supportStats(){
        driver.get(url);

        WebElement storeDropDown = driver.findElement(By.xpath("(//a[@class=\"menuitem supernav\"])[3]"));
        actions.moveToElement(storeDropDown).perform();

        WebElement statsBtn = driver.findElement(By.xpath("(//a[.='Stats'])[2]"));
        statsBtn.click();

        WebElement supportStatsBtn = driver.findElement(By.xpath("//a[.='Steam Support Stats']"));
        supportStatsBtn.click();

        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .build().perform();
    }
}

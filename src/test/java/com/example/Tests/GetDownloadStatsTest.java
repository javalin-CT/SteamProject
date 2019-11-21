package com.example.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetDownloadStatsTest extends TestBase{
    @Test
    public void downloadStats(){
        driver.get(url);

        WebElement storeDropDown = driver.findElement(By.xpath("(//a[@class=\"menuitem supernav\"])[3]"));
        actions.moveToElement(storeDropDown).perform();

        WebElement statsBtn = driver.findElement(By.xpath("(//a[.='Stats'])[2]"));
        statsBtn.click();

        WebElement supportStatsBtn = driver.findElement(By.xpath("//a[.='Steam Download Stats']"));
        supportStatsBtn.click();

        WebElement usaBtn = driver.findElement(By.id("countries-USA"));
        actions.moveToElement(usaBtn).click().build().perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

}

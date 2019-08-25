package com.telran.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {


    WebDriver wiki;

    @BeforeMethod
     public void search1() {
         wiki = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         wiki.get("https://ru.wikipedia.org");
         //driver.navigate().to();
     }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        wiki.quit();
    }
}

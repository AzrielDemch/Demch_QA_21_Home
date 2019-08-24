package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    WebDriver driver;
    @Test
    public void search1() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://ru.wikipedia.org");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Munich");
        driver.findElement(By.name("go")).click();

        //driver.navigate().to();

        Thread.sleep(7000);
        driver.quit();
    }



}
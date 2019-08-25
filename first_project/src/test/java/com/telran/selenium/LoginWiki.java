package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWiki extends TestBase{

    @Test
    public void loginToWiki() throws InterruptedException {

        clickOnButton(By.id("pt-login"));

        clickOnButton(By.id("wpName1"));
        wiki.findElement(By.id("wpName1")).clear();
        wiki.findElement(By.id("wpName1")).sendKeys("asdffdfds@gmail.com");

        clickOnButton(By.id("wpPassword1"));
        wiki.findElement(By.id("wpPassword1")).clear();
        wiki.findElement(By.id("wpPassword1")).sendKeys("1234567");

        clickOnButton(By.id("wpLoginAttempt"));

    }

    public void clickOnButton(By wikiLocator) {
        wiki.findElement(wikiLocator).click();
    }


}

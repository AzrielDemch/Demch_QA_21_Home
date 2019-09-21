package com.telran.selenium.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wiki;

    public HelperBase(WebDriver wiki) {
        this.wiki = wiki;
    }

    public void returnToHomePage() {
        click(By.xpath("//a[@class='mw-wiki-logo']"));
    }

    public boolean isElementPresent(By locator) {
    return wiki.findElements(locator).size() > 0;
    }

    public void click(By locator) {
        wiki.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wiki.findElement(locator).click();
        wiki.findElement(locator).clear();
        wiki.findElement(locator).sendKeys(text);
    }
}

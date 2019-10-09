package com.telran.selenium.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonHelper extends HelperBase {
    public PersonHelper(WebDriver wiki) {
        super(wiki);
    }

    public void returnToHomePage() {
        click(By.xpath("//a[@class='mw-wiki-logo']"));
    }

    public void clickOnPictureTrumpTower() {
        click(By.cssSelector("[src^='//upload.wikimedia.org/wikipedia/commons/thumb/3/30/Trump_Tower_-_lower_part." +
                "jpg/170px-Trump_Tower_-_lower_part.jpg']"));
    }

    public void closePictureButton() {
        click(By.cssSelector("[class='mw-mmv-close']"));
    }

    public void clickOnFamilyPerson() {
        click(By.cssSelector("[href='#Family']"));
    }

    public void typeNameOfPersonInField(String text) {
        click(By.cssSelector("[type='search']"));
        type(By.cssSelector("[type='search']"),text);
        click(By.cssSelector("[name='go']"));

    }

    public boolean isMainPaigeButton() {
        return !isElementPresent(By.cssSelector("#n-mainpage-description"));
    }

    public boolean isSearchButtonInHomePage() {
        return !isElementPresent(By.cssSelector("[name='search']"));
    }
}

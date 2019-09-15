package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wiki;

    public void init() {
        wiki = new ChromeDriver();
        wiki.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wiki.manage().window().maximize();

        openSite("https://en.wikipedia.org");
        login("Bender Rodrigez 00","1S234567");
    }

    public void login(String email, String password) {
        click(By.cssSelector("#pt-login"));
        type(By.cssSelector("[name='wpName']"),email);
        type(By.cssSelector("[id='wpPassword1']"),password);
        click(By.cssSelector("#wpLoginAttempt"));
    }

    public void click(By locator) {
        wiki.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wiki.findElement(locator).click();
        wiki.findElement(locator).clear();
        wiki.findElement(locator).sendKeys(text);
    }

    public void openSite(String url) {
        wiki.navigate().to(url);
    }

    public void stop() {
        wiki.quit();
    }

    public void returnToHomePage() {
        click(By.xpath("//a[@class='mw-wiki-logo']"));
    }

    public void closePictureButton() {
        click(By.cssSelector("[class='mw-mmv-close']"));
    }

    public void clickOnPictureCossackBohdanKhmelnytsky() {
        click(By.cssSelector("[src^='//upload.wikimedia.org/wikipedia/commons/thumb/9/93/" +
                "Pic_I_V_Ivasiuk_Mykola_Bohdan_Khmelnytskys_Entry_to_Kyiv.jpg/220px-Pic_I_V_Ivasiuk_Mykola_Bohdan_Khmelnytskys_Entry_to_Kyiv.jpg']"));
    }

    public void geographyByCity() {
        click(By.xpath("//a[@href='#Geography']"));
    }

    public void titleOfCity() {
        click(By.xpath("//a[@href='#Name']"));
    }

    public void typeNameOfCityInField(String text) {
    click(By.cssSelector("[type='search']"));
    type(By.cssSelector("[type='search']"),text);
    click(By.cssSelector("[name='go']"));
    }

    public boolean isUserInCityPage() {
    return isElementPresent(By.cssSelector("[alt='Counterclockwise (from upper right): Verkhovna Rada," +
            " Kiev Pechersk Lavra, Red University Building, House with Chimaeras, Independence Square, statue of Bohdan Khmelnytsky']"));
    }

    public boolean isElementPresent(By locator) {
    return wiki.findElements(locator).size() > 0;
    }

    public void clickOnPictureTrumpTower() {
        click(By.cssSelector("[src^='//upload.wikimedia.org/wikipedia/commons/thumb/3/30/Trump_Tower_-_lower_part." +
                "jpg/170px-Trump_Tower_-_lower_part.jpg']"));
        closePictureButton();
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

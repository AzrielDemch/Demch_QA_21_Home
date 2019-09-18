package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wiki;
    CityHelper cityHelper;
    PersonHelper personHelper;
    SessionHelper sessionHelper;

    public void init() {
        wiki = new ChromeDriver();
        wiki.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wiki.manage().window().maximize();

        cityHelper = new CityHelper(wiki);
        personHelper = new PersonHelper(wiki);
        sessionHelper = new SessionHelper(wiki);

        sessionHelper.openSite("https://en.wikipedia.org");
        sessionHelper.login("Bender Rodrigez 00","1S234567");
    }

    public void stop() {
        wiki.quit();
    }

    public CityHelper getCityHelper() {
        return cityHelper;
    }

    public PersonHelper getPersonHelper() {
        return personHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}

package com.telran.selenium.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wiki;
    CityHelper cityHelper;
    PersonHelper personHelper;
    SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            wiki = new ChromeDriver();
        }if(browser.equals(BrowserType.FIREFOX)){
            wiki = new FirefoxDriver();
        }


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

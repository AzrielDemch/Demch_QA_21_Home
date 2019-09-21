package com.telran.selenium.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    
    public SessionHelper(WebDriver wiki) {
        super(wiki);
    }

    public void login(String email, String password) {
        click(By.cssSelector("#pt-login"));
        type(By.cssSelector("[name='wpName']"),email);
        type(By.cssSelector("[id='wpPassword1']"),password);
        click(By.cssSelector("#wpLoginAttempt"));
    }

    public void openSite(String url) {
        wiki.navigate().to(url);
    }
}

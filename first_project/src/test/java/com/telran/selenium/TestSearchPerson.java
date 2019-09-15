package com.telran.selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchPerson extends TestBase{

    @BeforeClass
    public void isEnsurePreconditionsLogin(){
        if(app.isMainPaigeButton()){
            app.login("Bender Rodrigez 00","1S234567");
        }
    }

    @BeforeMethod
    public void isUserInThereHomePage(){
        if(app.isSearchButtonInHomePage()){
            app.returnToHomePage();
        }
    }

    @Test
    public void searchPerson(){
    app.typeNameOfPersonInField("Donald Trump");
    app.clickOnFamilyPerson();
    app.clickOnPictureTrumpTower();
    app.returnToHomePage();

}

}
package com.telran.selenium.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchPerson extends TestBase{

    @BeforeClass
    public void isEnsurePreconditionsLogin(){
        if(app.getPersonHelper().isMainPaigeButton()){
            app.getSessionHelper().login("Bender Rodrigez 00","1S234567");
        }
    }

    @BeforeMethod
    public void isUserInThereHomePage(){
        if(app.getPersonHelper().isSearchButtonInHomePage()){
            app.getPersonHelper().returnToHomePage();
        }
    }

    @Test
    public void searchPerson(){
    app.getPersonHelper().typeNameOfPersonInField("Donald Trump");
    app.getPersonHelper().clickOnFamilyPerson();
    app.getPersonHelper().clickOnPictureTrumpTower();
    app.getPersonHelper().closePictureButton();
    app.getPersonHelper().returnToHomePage();

}

}
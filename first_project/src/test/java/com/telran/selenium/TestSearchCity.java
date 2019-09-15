package com.telran.selenium;

import org.testng.annotations.Test;

public class TestSearchCity extends TestBase{

@Test
    public void searchCity(){

    app.typeNameOfCityInField("Kiev");
    app.titleOfCity();
    app.geographyByCity();
    app.clickOnPictureCossackBohdanKhmelnytsky();
    app.closePictureButton();
    app.returnToHomePage();
    app.isUserInCityPage();
}

}

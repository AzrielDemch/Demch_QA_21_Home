package com.telran.selenium.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchCity extends TestBase{

    @Test
    public void searchCity(){

    app.getCityHelper().typeNameOfCityInField("Kiev");
    app.getCityHelper().titleOfCity();
    app.getCityHelper().geographyByCity();
    app.getCityHelper().clickOnPictureCossackBohdanKhmelnytsky();
    app.getCityHelper().closePictureButton();
    app.getCityHelper().returnToHomePage();
    app.getCityHelper().isUserInCityPage();
}

}

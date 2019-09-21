package com.telran.selenium.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CityHelper extends HelperBase {


    public CityHelper(WebDriver wiki) {
        super(wiki);
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

}

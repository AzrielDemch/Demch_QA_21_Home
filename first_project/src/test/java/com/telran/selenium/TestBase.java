package com.telran.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp(){
        app.init();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        app.stop();
    }


}

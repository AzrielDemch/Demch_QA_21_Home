package com.telran.selenium.tests;

import com.telran.selenium.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeClass
    public void setUp(){
        app.init();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        app.stop();
    }

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    @BeforeMethod
    public void startLogger(Method m, Object p){
        logger.info("Start test - " + m.getName());
        System.out.println("____________________");
    }

    @AfterMethod
    public void endLogger(Method m){
            logger.info("End test - " + m.getName());
        }
}

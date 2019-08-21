package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

WebDriver driver;

@Test
/*public void getUp() throws InterruptedException {
driver = new ChromeDriver();
driver.get("https://accounts.google.com");
driver.findElement(By.name("identifier")).sendKeys("java");
Thread.sleep(5000);
driver.quit();
}*/

public void getUp1()
{
    driver = new ChromeDriver();
    driver.navigate().to("https://ru.wikipedia.org");
    driver.findElement(By.name("search")).sendKeys("Илон Маск");
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        System.out.println("My Message"+e.getMessage());
    }
    driver.quit();

}

}

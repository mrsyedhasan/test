package testdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class Selenium_Test {
WebDriver driver;

    @Before
    public void openbrowser(){
    System.setProperty("webdriver.chrome.driver","/Users/syedhasan/IdeaProjects/test_method/src/main/resources/chromedriver");
    driver = new ChromeDriver();
    }
    @After
    public void closeAll(){
    driver.quit();
    }
    @Test
    public void openThePageAndCheckTittle(){
        String expectedTitle = "Google";
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        assertEquals(expectedTitle, title);
    }
}

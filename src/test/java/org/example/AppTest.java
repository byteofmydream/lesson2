package org.example;

import static org.example.App.isTeacherGreat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        System.setProperty("webdriver.chrome.driver", "/Users/ivan/Downloads/my_chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.yahoo.com");
    }
}

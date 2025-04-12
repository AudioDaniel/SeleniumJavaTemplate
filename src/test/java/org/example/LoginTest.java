package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    private static ChromeDriver driver;
    private final String LOGIN_URL = "https://google.com";

    @BeforeClass
    public static void setupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void loadStepOne(){
        driver.get(LOGIN_URL);
    }
}

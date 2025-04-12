package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.example.utils.LocatorReader;

public class LoginPage {
    WebDriver driver;
    LocatorReader reader = new LocatorReader();

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }



}

package net.soltech.tests;

import net.soltech.handlers.AssertionsHandler;
import net.soltech.library.handlers.WebDriverHandler;
import net.soltech.pageobjects.Pages;
import net.soltech.pageobjects.PagesImpl;
import org.openqa.selenium.WebDriver;


public interface BaseTest {
    default Pages SolTech()
    {
        return new PagesImpl();
    }

    default WebDriver getDriver()
    {
        return WebDriverHandler.getDriver();
    }
    default AssertionsHandler assertions()
    {
        return new AssertionsHandler() {
        };
    }
}

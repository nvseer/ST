package net.soltech.library.handlers;

import org.openqa.selenium.WebDriver;

public class WebDriverHandler
{
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() { return driver.get(); }

    public static void setWebDriver(WebDriver _driver) { driver.set(_driver); }
}
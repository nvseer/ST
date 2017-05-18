package net.soltech.library.core.commands.driver;


import net.soltech.library.handlers.WebDriverHandler;
import org.openqa.selenium.WebDriver;

import java.util.function.Supplier;

public interface DriverFunctions {

    Supplier<WebDriver> driver = () -> WebDriverHandler.getDriver();
    Runnable quit = () -> driver.get().quit();
}
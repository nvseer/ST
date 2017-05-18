package net.soltech.library.webdrivers;


import org.openqa.selenium.WebDriver;
import java.util.function.Predicate;


public class WebDriverService {
    public WebDriver getInstance(String browserType)
    {
        return RegisterWebDrivers.getTypes()
                .filter(isMatchWith(browserType))
                .findFirst()
                .map(registerWebDriver -> registerWebDriver.getWebDriver())
                .orElseThrow(() -> new RuntimeException(String.format("the browser type failed to find/match any registered WebDriver defined: %s",browserType)));
    }

    private Predicate<WebDriverType> isMatchWith(String type)
    {
        return registerWebDriver -> registerWebDriver.isWebDriverType(type);
    }
}

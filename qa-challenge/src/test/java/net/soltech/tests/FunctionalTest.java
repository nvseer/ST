package net.soltech.tests;


import net.soltech.library.core.commands.driver.Driver;
import net.soltech.library.handlers.WebDriverHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class FunctionalTest implements BaseTest {
    @Parameters({"browser"})
    @BeforeMethod
    public void setDriver(String browser)
    {
        WebDriverHandler.setWebDriver(Driver.createInstance.apply(browser));
    }
    @Parameters({"url"})
    @BeforeMethod
    protected void setUrl(String url)
    {
        getDriver().get(url);
    }
    @AfterTest(alwaysRun = true)
    protected void quitDriver()
    {
        Driver.quitInstance.accept(getDriver());
    }
}

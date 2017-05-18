package net.soltech.library.webdrivers;

import org.openqa.selenium.WebDriver;

public interface WebDriverType
{
	WebDriver getWebDriver();
	boolean isWebDriverType(String type);
}

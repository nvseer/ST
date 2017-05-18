package net.soltech.library.webdrivers.local;


import net.soltech.library.webdrivers.WebDriverType;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.function.Supplier;

public class Chrome implements WebDriverType
{
	@Override
	public WebDriver getWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", osPath.get());
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1814,974");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        return new ChromeDriver(capabilities);
	}

	@Override
	public boolean isWebDriverType(String type)
	{
		return StringUtils.equalsIgnoreCase("chrome.local", type);
	}

	private Supplier<String> osPath = () -> SystemUtils.IS_OS_WINDOWS ? "C:\\var\\chromedriver.exe" : "/var/chromedriver/chromedriver";
}
package net.soltech.pageobjects.header.careers;


import net.soltech.handlers.OpenPositionsPageHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static net.soltech.library.core.commands.driver.DriverFunctions.driver;

public class CareersDropDownPO implements CareersDropDown {

    private WebDriverWait wait                      = new WebDriverWait(driver.get(),10);
    private WebElement openPositionsLink            = driver.get().findElement(By.xpath(".//*[@id='navbar']/div/ul/li[5]/ul/li[2]/a"));


    @Override
    public OpenPositionsPageHandler selectOpenPositions()
    {
        wait.until(ExpectedConditions.elementToBeClickable(openPositionsLink));
        openPositionsLink.click();
        switchToOpenPositionsTab();
        return OpenPositionsPageHandler.get();
    }

    private void switchToOpenPositionsTab()
    {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.get().getWindowHandles());
        driver.get().switchTo().window(tabs.get(1));
    }

}

package net.soltech.pageobjects.header;


import net.soltech.pageobjects.header.careers.CareersDropDown;
import net.soltech.pageobjects.header.careers.CareersDropDownPO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.soltech.library.core.commands.driver.DriverFunctions.driver;

public class HeaderPO implements Header {
    private WebElement careers      = driver.get().findElement(By.xpath(".//*[@id='navbar']/div/ul/li[5]/a"));

    @Override
    public CareersDropDown selectCareers()
    {
        careers.click();
        return new CareersDropDownPO();
    }
}

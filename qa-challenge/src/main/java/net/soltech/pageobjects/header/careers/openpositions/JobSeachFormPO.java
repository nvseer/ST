package net.soltech.pageobjects.header.careers.openpositions;


import net.soltech.dataobjects.OpenPosition;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;
import java.util.function.Function;


import static net.soltech.library.core.commands.driver.DriverFunctions.driver;

public class JobSeachFormPO implements JobSearchForm {

    private WebDriverWait wait          = new WebDriverWait(driver.get(),60);
    private WebElement keywordField;
    private WebElement searchButton;


    @Override
    public OpenPositions searchByKeyword(OpenPosition openPosition)
    {
        switchToIFrame();
        keywordField    = wait.until(ExpectedConditions.elementToBeClickable(driver.get().findElement(By.id("jsb_f_keywords_i"))));
        searchButton    = wait.until(ExpectedConditions.elementToBeClickable(driver.get().findElement(By.id("jsb_form_submit_i"))));
        keywordField.sendKeys(openPosition.getKeyword());
        searchButton.click();
        return new OpenPositionsPO();
    }

    private void switchToIFrame()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("icims_content_iframe")));
    }

}

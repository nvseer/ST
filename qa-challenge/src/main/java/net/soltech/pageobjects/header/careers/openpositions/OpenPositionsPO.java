package net.soltech.pageobjects.header.careers.openpositions;


import org.openqa.selenium.WebElement;


public class OpenPositionsPO implements OpenPositions {

    private WebElement searchResultsTable;

    @Override
    public JobSearchForm jobSearchForm()
    {
        return new JobSeachFormPO();
    }


}

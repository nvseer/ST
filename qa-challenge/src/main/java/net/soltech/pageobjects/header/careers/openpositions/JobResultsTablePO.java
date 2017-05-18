package net.soltech.pageobjects.header.careers.openpositions;


import net.soltech.dataobjects.OpenPosition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.soltech.library.core.commands.driver.DriverFunctions.driver;

public class JobResultsTablePO implements JobResultsTable {

    private WebElement searchResultsTable   = driver.get().findElement(By.cssSelector(".iCIMS_JobsTable.iCIMS_Table"));
    private List<WebElement> jobResultsRow  = searchResultsTable.findElements(By.xpath("//tr[contains(@class,'iCIMS_JobListingRow')]"));
    private WebElement parent;
    private WebElement position;
    private WebElement jobId;


    private WebElement returnParent(OpenPosition openPosition) {

        parent = jobResultsRow.stream()
                .filter(position -> position.getText().contains(openPosition.getPosition()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Unable to find row with matching position."));

        return parent;
        }

    @Override
    public boolean isMatchToJobId(OpenPosition openPosition)
    {
        WebElement root = returnParent(openPosition);
        jobId = root.findElement(By.xpath(".//td[2]"));
        System.out.format("JobId --> " + readJobId());
        return readJobId().equalsIgnoreCase(openPosition.getJobId());
    }

    public String readJobId()
    {
        return jobId.getText();
    }

}

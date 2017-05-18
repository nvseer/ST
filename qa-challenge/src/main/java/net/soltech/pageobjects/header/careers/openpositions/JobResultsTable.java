package net.soltech.pageobjects.header.careers.openpositions;


import net.soltech.dataobjects.OpenPosition;
import org.openqa.selenium.WebElement;

public interface JobResultsTable {

    boolean isMatchToJobId(OpenPosition openPosition);
}

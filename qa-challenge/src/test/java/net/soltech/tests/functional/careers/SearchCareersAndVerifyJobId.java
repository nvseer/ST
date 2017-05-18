package net.soltech.tests.functional.careers;


import net.soltech.builders.OpenPositionSearchBuilder;
import net.soltech.dataobjects.OpenPosition;
import net.soltech.tests.FunctionalTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchCareersAndVerifyJobId extends FunctionalTest {

    private OpenPosition openPosition;

    @Parameters({"keyword","position","jobId"})

    @BeforeMethod
    public void setup(String keyword,String position,String jobId)
    {
        openPosition = new OpenPositionSearchBuilder().withKeyword(keyword)
            .withPosition(position)
            .withJobId(jobId)
            .build();
    }

    @Test
    public void test()
    {
        SolTech().headerSection().selectCareers().selectOpenPositions()
            .openPositionsPage().jobSearchForm().searchByKeyword(openPosition);

        assertions().jobSearchAssertions().assertPositionAndJobId(openPosition);
    }
}

package net.soltech.assertions;


import net.soltech.dataobjects.OpenPosition;
import net.soltech.handlers.AssertionsHandler;
import net.soltech.pageobjects.header.careers.openpositions.JobResultsTable;
import net.soltech.pageobjects.header.careers.openpositions.JobResultsTablePO;

import static org.assertj.core.api.Assertions.assertThat;

public class JobSearchAssertions implements AssertionsHandler{

    private JobResultsTable jobResultsTable;

    public JobSearchAssertions()
    {
        jobResultsTable = new JobResultsTablePO();
    }

    public JobSearchAssertions assertPositionAndJobId(OpenPosition openPosition)
    {
        assertThat(jobResultsTable.isMatchToJobId(openPosition));
        return this;
    }
}

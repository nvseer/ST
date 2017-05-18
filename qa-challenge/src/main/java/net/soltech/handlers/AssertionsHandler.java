package net.soltech.handlers;


import net.soltech.assertions.JobSearchAssertions;

public interface AssertionsHandler {

    default JobSearchAssertions jobSearchAssertions()
    {
        return new JobSearchAssertions();
    }
}

package net.soltech.builders;


import net.soltech.dataobjects.OpenPosition;
import net.soltech.dataobjects.OpenPositionData;

public class OpenPositionSearchBuilder {

    private String keyword      = "";
    private String position     = "";
    private String jobId        = "";

    public OpenPosition build()
    {
        return new OpenPositionData(keyword,position,jobId);
    }

    public OpenPositionSearchBuilder withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public OpenPositionSearchBuilder withPosition(String position) {
        this.position = position;
        return this;
    }

    public OpenPositionSearchBuilder withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
}

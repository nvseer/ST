package net.soltech.dataobjects;


public class OpenPositionData implements OpenPosition {

    private String keyword;
    private String position;
    private String jobId;

    public OpenPositionData(String keyword,String position,String jobId)
    {
        this.keyword    = keyword;
        this.position   = position;
        this.jobId      = jobId;
    }

    @Override
    public String getKeyword() {
        return keyword;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getJobId() {
        return jobId;
    }
}

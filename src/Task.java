import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "TaskTracker") // Table name provided in instructions
public class Task {
    @DynamoDBHashKey(attributeName = "jobId") // This is the primary key
    private String jobId;
    @DynamoDBAttribute(attributeName = "completedBy")
    private String completedBy;
    @DynamoDBAttribute(attributeName = "yearCompleted")
    private Integer yearCompleted;
    @DynamoDBAttribute(attributeName = "hoursTaken")
    private Integer hoursTaken;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCompletedBy() {
        return completedBy;
    }

    public void setCompletedBy(String completedBy) {
        this.completedBy = completedBy;
    }

    public Integer getYearCompleted() {
        return yearCompleted;
    }

    public void setYearCompleted(Integer yearCompleted) {
        this.yearCompleted = yearCompleted;
    }

    public Integer getHoursTaken() {
        return hoursTaken;
    }

    public void setHoursTaken(Integer hoursTaken) {
        this.hoursTaken = hoursTaken;
    }
}

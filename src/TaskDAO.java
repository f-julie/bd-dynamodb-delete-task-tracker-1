import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class TaskDAO {

    private DynamoDBMapper mapper;

    /**
     * Allows access to and manipulation of Task objects from the data store.
     * @param mapper Access to DynamoDB
     */
    public TaskDAO(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Uses the delete() method to remove a given item from the TaskTracker table based on the item's partition key.
     * @param task given Task instance that's removed from the table based on the partition key
     */
    public void deleteTask(Task task) {
        //TODO: Implement functionality to delete the task that's passed in
        mapper.delete(task);
    }

    /**
     * Uses the load() method to get an item from the TaskTracker table given a partition key value.
     * @param partitionKey the given partition key value used to find the correct item to load.
     * @return the Task instance that's been loaded from the table
     */
    public Task getTask(String partitionKey) {
        Task task = mapper.load(Task.class, partitionKey);
        return task;
    }

    /**
     * Uses the save() method to save a given item to the TaskTracker table.
     * @param task given Task instance that's saved to the table
     */
    public void saveTask(Task task) {
        mapper.save(task);
    }
}

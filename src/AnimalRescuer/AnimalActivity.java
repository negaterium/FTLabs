package AnimalRescuer;

public class AnimalActivity {

    private String activityName;

    public AnimalActivity() {
        // Empty
    }

    public AnimalActivity(String activityName){
        this.activityName = activityName;
    }


    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}

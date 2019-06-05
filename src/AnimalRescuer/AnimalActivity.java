package AnimalRescuer;

public class AnimalActivity {

    String activityName;

    public AnimalActivity() {
        // Empty
    }

    public AnimalActivity(String activityName){
        this.activityName = activityName;
    }

    public String GetActivityName() {
        return (this.activityName);
    }
}

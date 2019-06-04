package AnimalRescuer;

public class Food {

    String foodName;
    int foodQuantity;
    Boolean foodAvailable;

    public void SetFoodName(String name) {
        this.foodName = name;
    }

    public String GetFoodName() {
        return (this.foodName);
    }

    public void SetFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int GetFoodQuantity() {
        return (this.foodQuantity);
    }

    public void SetFoodAvailability(Boolean foodAvailability) {
        this.foodAvailable = foodAvailability;
    }

    public Boolean GetFoodAvailability() {
        return (this.foodAvailable);
    }

}

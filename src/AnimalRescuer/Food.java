package AnimalRescuer;

public class Food {

    String foodName;
    int foodQuantity;
    Boolean foodAvailable;

    public Food() {
        //Empty
    }

    public Food(String foodName, int foodQuantity, Boolean foodAvailable) {
        this.foodName = foodName;
        this.foodQuantity = foodQuantity;
        this.foodAvailable = foodAvailable;
    }

    public String GetFoodName() {
        return (this.foodName);
    }


    public int GetFoodQuantity() {
        return (this.foodQuantity);
    }


    public Boolean GetFoodAvailability() {
        return (this.foodAvailable);
    }

}

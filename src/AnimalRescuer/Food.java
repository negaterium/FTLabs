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

    public String getFoodName() {
        return (this.foodName);
    }


    public int getFoodQuantity() {
        return (this.foodQuantity);
    }


    public Boolean getFoodAvailability() {
        return (this.foodAvailable);
    }

}

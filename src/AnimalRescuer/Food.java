package AnimalRescuer;

public class Food {

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Boolean getFoodAvailable() {
        return foodAvailable;
    }

    public void setFoodAvailable(Boolean foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    private String foodName;
    private int foodQuantity;
    private Boolean foodAvailable;

    public Food() {
        //Empty
    }

    public Food(String foodName, int foodQuantity, Boolean foodAvailable) {
        this.foodName = foodName;
        this.foodQuantity = foodQuantity;
        this.foodAvailable = foodAvailable;
    }



}

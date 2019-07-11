package AnimalRescuer;

public abstract class Animal {
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalHealthRating() {
        return animalHealthRating;
    }

    public void setAnimalHealthRating(int animalHealthRating) {
        this.animalHealthRating = animalHealthRating;
    }

    public int getAnimalHungerLevel() {
        return animalHungerLevel;
    }

    public void setAnimalHungerLevel(int animalHungerLevel) {
        this.animalHungerLevel = animalHungerLevel;
    }

    public int getAnimalState() {
        return animalState;
    }

    public void setAnimalState(int animalState) {
        this.animalState = animalState;
    }

    public String getAnimalPreferredFood() {
        return animalPreferredFood;
    }

    public void setAnimalPreferredFood(String animalPreferredFood) {
        this.animalPreferredFood = animalPreferredFood;
    }


    private String animalType;
    private String animalName;
    private int animalAge;
    private int animalHealthRating;
    private int animalHungerLevel;
    private int animalState;
    private String animalPreferredFood;

    public Animal() {
        //Empty
    }

    public Animal(String animalType, String animalName, int animalAge, int animalHealthRating, int animalHungerLevel,
                  int animalState, String animalPreferredFood) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalHealthRating = animalHealthRating;
        this.animalHungerLevel = animalHungerLevel;
        this.animalState = animalState;
        this.animalPreferredFood = animalPreferredFood;
    }

    public abstract void look(String text);
    public abstract void animalEats(String food);

}

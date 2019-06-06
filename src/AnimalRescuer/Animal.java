package AnimalRescuer;

public class Animal {
    String animalType;
    String animalName;
    int animalAge;
    int animalHealthRating;
    int animalHungerLevel;
    int animalState;
    String animalPreferredFood;

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

    public String getAnimalType() {
        return (this.animalType);
    }

    public String getAnimalName() {
        return (this.animalName);
    }

    public int getAnimalAge() {
        return (this.animalAge);
    }

    public int getAnimalHealthRating() {
        return (this.animalHealthRating);
    }

    public int getAnimalHungerLevel() {
        return (this.animalHungerLevel);
    }

    public int getAnimalState() {
        return (this.animalState);
    }

    public String getAnimalPreferredFood() {
        return (this.animalPreferredFood);
    }


}

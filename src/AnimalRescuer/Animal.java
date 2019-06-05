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

    public String GetAnimalType() {
        return (this.animalType);
    }

    public String GetAnimalName() {
        return (this.animalName);
    }

    public int GetAnimalAge() {
        return (this.animalAge);
    }

}

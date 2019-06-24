package AnimalRescuer;

public class Dog extends Animal {

    private boolean hasFunnyTail;
    private boolean barks;

    public Dog() {
    }

    public Dog(boolean hasFunnyTail, boolean barks, String animalType, String animalName, int animalAge,
               int animalHealthRating, int animalHungerLevel, int animalState, String animalPreferredFood)
    {
        super(animalType, animalName, animalAge, animalHealthRating, animalHungerLevel, animalState, animalPreferredFood);
        this.barks = barks;
        this.hasFunnyTail = hasFunnyTail;
    }

    public boolean getBarks() {
        return barks;
    }

    public void setBarks(boolean barks) {
        this.barks = barks;
    }

    public boolean hasFunnyTail() {
        return hasFunnyTail;
    }

    public void setHasFunnyTail(boolean hasFunnyTail) {
        this.hasFunnyTail = hasFunnyTail;
    }


}

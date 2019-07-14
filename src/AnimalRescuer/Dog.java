package AnimalRescuer;

public class Dog extends Animal{

    private boolean hasFunnyTail;
    private boolean barks;

    public Dog() {
    }

    public Dog(boolean hasFunnyTail, boolean barks, String animalType, String animalName, int animalAge,
               int animalHealthRating, int animalHungerLevel, int animalState, String animalPreferredFood) {
        super(animalType, animalName, animalAge, animalHealthRating, animalHungerLevel, animalState, animalPreferredFood);
        this.barks = barks;
        this.hasFunnyTail = hasFunnyTail;
    }


    public void dance() {
        System.out.println("Dog dance!!!");
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

    @Override
    public void look(String face) {
        System.out.println("Dog looks at you with " + face + "face");
    }

    @Override
    public void animalEats(String food)
    {
        System.out.println("The dog eats :" + food);
    }

}

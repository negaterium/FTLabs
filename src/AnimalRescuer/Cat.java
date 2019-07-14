package AnimalRescuer;

public class Cat extends Animal{


    private boolean hasFluffyTail;
    private boolean meows;

    public Cat() {
    }

    public Cat(boolean hasFluffyTail, boolean meows, String animalType, String animalName, int animalAge,
               int animalHealthRating, int animalHungerLevel, int animalState, String animalPreferredFood) {
        super(animalType, animalName, animalAge, animalHealthRating, animalHungerLevel, animalState, animalPreferredFood);
        this.meows = meows;
        this.hasFluffyTail = hasFluffyTail;
    }

    public void dance() {
        System.out.println("Cat dance!!!");
    }

    public boolean isHasFluffyTail() {
        return hasFluffyTail;
    }

    public void setHasFluffyTail(boolean hasFluffyTail) {
        this.hasFluffyTail = hasFluffyTail;
    }

    public boolean isMeows() {
        return meows;
    }

    public void setMeows(boolean meows) {
        this.meows = meows;
    }

    @Override
    public void look(String face) {
        System.out.println("Cat looks at you with " + face + "face");
    }

    @Override
    public void animalEats(String food)
    {
        System.out.println("Cat eats :" + food);
    }

}

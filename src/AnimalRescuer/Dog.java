package AnimalRescuer;

public class Dog extends Animal{

    private boolean hasFunnyTail;
    private boolean barks;

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


    public Dog() {
    }

}

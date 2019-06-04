package AnimalRescuer;

public class Adopter {
    String name;
    int availableCash;

    public void SetAdopterName(String name) {
        this.name = name;
    }

    public String GetAdopterName() {
        return (this.name);
    }

    public void SetAvailableCash(int cash) {
        this.availableCash = cash;
    }

    public int GetAvailableCash() {
        return (this.availableCash);
    }

}

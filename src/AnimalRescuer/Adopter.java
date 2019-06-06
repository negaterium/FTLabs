package AnimalRescuer;

public class Adopter {
    String adopterName;
    int adopterCash;

    public Adopter() {
        // Empty
    }

    public Adopter(String adopterName, int adopterCash) {
        this.adopterName = adopterName;
        this.adopterCash = adopterCash;
    }

    public String getAdopterName() {
        return (this.adopterName);
    }

    public int getAvailableCash() {
        return (this.adopterCash);
    }

}

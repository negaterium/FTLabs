package AnimalRescuer;

public class Adopter {
    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public int getAdopterCash() {
        return adopterCash;
    }

    public void setAdopterCash(int adopterCash) {
        this.adopterCash = adopterCash;
    }

    private String adopterName;
    private int adopterCash;

    public Adopter() {
        // Empty
    }

    public Adopter(String adopterName, int adopterCash) {
        this.adopterName = adopterName;
        this.adopterCash = adopterCash;
    }



}

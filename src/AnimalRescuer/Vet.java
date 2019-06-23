package AnimalRescuer;

public class Vet {

    private String vetName, vetSpec;

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getVetSpec() {
        return vetSpec;
    }

    public void setVetSpec(String vetSpec) {
        this.vetSpec = vetSpec;
    }

    public Vet() {
        //Empty
    }

    public Vet(String vetName, String vetSpec) {
        this.vetName = vetName;
        this.vetSpec = vetSpec;
    }

}

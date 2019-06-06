package AnimalRescuer;

public class Vet {

    String vetName;
    String vetSpec;

    public Vet() {
        //Empty
    }

    public Vet(String vetName, String vetSpec) {
        this.vetName = vetName;
        this.vetSpec = vetSpec;
    }

    public String getVetName() {
        return (this.vetName);
    }


    public String getVetspec() {
        return (this.vetSpec);
    }
}

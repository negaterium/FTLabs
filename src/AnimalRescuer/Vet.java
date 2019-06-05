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

    public String GetVetName() {
        return (this.vetName);
    }


    public String GetVetspec() {
        return (this.vetSpec);
    }
}

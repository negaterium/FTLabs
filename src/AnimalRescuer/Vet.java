package AnimalRescuer;

public class Vet {

    String vetName;
    String vetSpec;

    public void SetVetName(String name) {
        this.vetName = name;
    }

    public String GetVetName() {
        return (this.vetName);
    }

    public void SetVetSpec(String spec) {
        this.vetSpec = spec;
    }

    public String GetVetspec() {
        return (this.vetSpec);
    }
}

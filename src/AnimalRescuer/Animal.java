package AnimalRescuer;

public class Animal {
    String animalType;
    String animalName;
    int animalAge;
    int animalHealthRating;
    int animalHungerLevel;
    int animalState;
    String animalPreferredFood;

    public String GetAnimalType(){
        return(this.animalType);
    }

    public String GetAnimalName(){
        return(this.animalName);
    }

    public int GetAnimalAge(){
        return(this.animalAge);
    }

    public void SetAnimalPreferedFood(String food){
        this.animalPreferredFood = food;
    }

}

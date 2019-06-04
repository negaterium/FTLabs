package AnimalRescuer;

public class Main {

    public static void main(String[] args) {

        // Create some animals with specific data
        Animal dog = new Animal();
        Animal myDog = SetAnimalData(dog, "dog", "Rex", 3, 8, 5, 9, "meat");
        Animal cat = new Animal();
        Animal myCat = SetAnimalData(cat, "cat", "Fluffy", 2, 10, 9, 7, "milk");


        // Display animal data
        System.out.println("------------------------------------------------------");
        DisplayAnimalData(myDog);
        System.out.println("------------------------------------------------------");
        DisplayAnimalData(myCat);

        // Create a new adopter
        Adopter genericMaleAdopter = new Adopter();
        Adopter mrJohn = SetAdopterData(genericMaleAdopter, "John", 1000);
        Adopter genericFemaleAdopter = new Adopter();
        Adopter msMary = SetAdopterData(genericFemaleAdopter, "Marry", 2000);

        // Display adopter data
        System.out.println("------------------------------------------------------");
        DisplayAdopterData(mrJohn);
        System.out.println("------------------------------------------------------");
        DisplayAdopterData(msMary);

        // Create a new animal food
        Food genericDogFood = new Food();
        Food dogFood = SetFoodData(genericDogFood, "meat", 1, true);
        Food genericCatFood = new Food();
        Food catFood = SetFoodData(genericCatFood, "milk", 5, false);

        // Display food data
        System.out.println("------------------------------------------------------");
        DisplayFoodData(dogFood);
        System.out.println("------------------------------------------------------");
        DisplayFoodData(catFood);

        // Create new animal activity
        AnimalActivity genericDogActivity = new AnimalActivity();
        AnimalActivity dogActivity = SetAnimalActivityData(genericDogActivity, "running");
        AnimalActivity genericCatActivity = new AnimalActivity();
        AnimalActivity catActivity = SetAnimalActivityData(genericCatActivity, "climbing");

        // Display animal activity data
        System.out.println("------------------------------------------------------");
        DisplayAnimalActivityData(dogActivity);
        System.out.println("------------------------------------------------------");
        DisplayAnimalActivityData(catActivity);

        // Create new vets
        Vet genericPrimaryVet = new Vet();
        Vet primaryVet = SetVetData(genericPrimaryVet, "John Doe", "generalist");
        Vet genericSecondaryVet = new Vet();
        Vet secondaryVet = SetVetData(genericSecondaryVet, "Mary Jane", "surgery");

        // Display vet data
        System.out.println("------------------------------------------------------");
        DisplayVetData(primaryVet);
        System.out.println("------------------------------------------------------");
        DisplayVetData(secondaryVet);

    }

    public static Vet SetVetData(Vet newVet, String vetName, String vetSpec) {
        newVet.SetVetName(vetName);
        newVet.SetVetSpec(vetSpec);
        return (newVet);
    }

    public static void DisplayVetData(Vet specificVet) {
        System.out.println("Vet name = " + specificVet.GetVetName());
        System.out.println("Vet spec = " + specificVet.GetVetspec());
    }

    public static AnimalActivity SetAnimalActivityData(AnimalActivity newAnimalActivity, String activityName) {
        newAnimalActivity.SetActivityName(activityName);
        return (newAnimalActivity);
    }

    public static void DisplayAnimalActivityData(AnimalActivity specificAnimalActivity) {
        System.out.println("Animal activity name = " + specificAnimalActivity.GetActivityName());
    }


    public static Food SetFoodData(Food newFood, String foodName, int foodQuantity, Boolean foodAvailability) {
        newFood.SetFoodName(foodName);
        newFood.SetFoodQuantity(foodQuantity);
        newFood.SetFoodAvailability(foodAvailability);
        return (newFood);
    }

    public static void DisplayFoodData(Food specificFood) {
        System.out.println("Food name = " + specificFood.GetFoodName());
        System.out.println("Food quantity = " + specificFood.GetFoodQuantity());
        System.out.println("Food availability = " + specificFood.GetFoodAvailability());
    }

    public static Animal SetAnimalData(Animal newAnimal, String animalType, String animalName, int animalAge, int animalHealthRating, int animalHungerLevel,
                                       int animalState, String animalPreferredFood) {

        newAnimal.animalType = animalType;
        newAnimal.animalName = animalName;
        newAnimal.animalAge = animalAge;
        newAnimal.animalHealthRating = animalHealthRating;
        newAnimal.animalHungerLevel = animalHungerLevel;
        newAnimal.SetAnimalPreferedFood(animalPreferredFood);
        newAnimal.animalState = animalState;
        return (newAnimal);
    }

    public static void DisplayAnimalData(Animal specificAnimal) {
        System.out.println("Animal type = " + specificAnimal.GetAnimalType());
        System.out.println("Animal name = " + specificAnimal.GetAnimalName());
        System.out.println("Animal age = " + specificAnimal.GetAnimalAge());
        System.out.println("Animal health rating = " + specificAnimal.animalHungerLevel);
        System.out.println("Animal hunger level = " + specificAnimal.animalHealthRating);
        System.out.println("Animal animal state = " + specificAnimal.animalState);
        System.out.println("Animal preferred food = " + specificAnimal.animalPreferredFood);
    }

    public static Adopter SetAdopterData(Adopter newAdopter, String name, int availableCash) {
        newAdopter.SetAdopterName(name);
        newAdopter.SetAvailableCash(availableCash);
        return (newAdopter);
    }

    public static void DisplayAdopterData(Adopter specificAdopter) {
        System.out.println("Adopter name = " + specificAdopter.GetAdopterName());
        System.out.println("Adopter cash value = " + specificAdopter.GetAvailableCash());
    }
}

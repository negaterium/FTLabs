package AnimalRescuer;

public class Main {

    public static void main(String[] args) {

        // Create some animals with specific data
        Animal dog = new Animal("dog", "Rex", 3, 8, 5, 9, "meat");
        Animal cat = new Animal("cat", "Fluffy", 2, 10, 9, 7, "milk");

        // Display animal data
        System.out.println("------------------------------------------------------");
        DisplayAnimalData(dog);
        System.out.println("------------------------------------------------------");
        DisplayAnimalData(cat);

        // Create new adopters
        Adopter mrJohn = new Adopter("John", 1000);
        Adopter msMary = new Adopter("Marry", 2000);

        // Display adopter data
        System.out.println("------------------------------------------------------");
        DisplayAdopterData(mrJohn);
        System.out.println("------------------------------------------------------");
        DisplayAdopterData(msMary);

        // Create a new animal food
        Food dogFood = new Food("meat", 1, true);
        Food catFood = new Food("milk", 5, false);

        // Display food data
        System.out.println("------------------------------------------------------");
        DisplayFoodData(dogFood);
        System.out.println("------------------------------------------------------");
        DisplayFoodData(catFood);

        // Create new animal activity
        AnimalActivity dogActivity = new AnimalActivity("running");
        AnimalActivity catActivity = new AnimalActivity("climbing");

        // Display animal activity data
        System.out.println("------------------------------------------------------");
        DisplayAnimalActivityData(dogActivity);
        System.out.println("------------------------------------------------------");
        DisplayAnimalActivityData(catActivity);

        // Create new vets
        Vet primaryVet = new Vet( "John Doe", "generalist");
        Vet secondaryVet = new Vet("Mary Jane", "surgery");

        // Display vet data
        System.out.println("------------------------------------------------------");
        DisplayVetData(primaryVet);
        System.out.println("------------------------------------------------------");
        DisplayVetData(secondaryVet);

    }

    public static void DisplayVetData(Vet specificVet) {
        System.out.println("Vet name = " + specificVet.GetVetName());
        System.out.println("Vet spec = " + specificVet.GetVetspec());
    }

    public static void DisplayAnimalActivityData(AnimalActivity specificAnimalActivity) {
        System.out.println("Animal activity name = " + specificAnimalActivity.GetActivityName());
    }

    public static void DisplayFoodData(Food specificFood) {
        System.out.println("Food name = " + specificFood.GetFoodName());
        System.out.println("Food quantity = " + specificFood.GetFoodQuantity());
        System.out.println("Food availability = " + specificFood.GetFoodAvailability());
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

    public static void DisplayAdopterData(Adopter specificAdopter) {
        System.out.println("Adopter name = " + specificAdopter.GetAdopterName());
        System.out.println("Adopter cash value = " + specificAdopter.GetAvailableCash());
    }
}

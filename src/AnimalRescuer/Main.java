package AnimalRescuer;

public class Main {

    public static void main(String[] args) {

        // Create some animals with specific data
        Animal dog = new Animal("dog", "Rex", 3, 8, 5, 9, "meat");
        Animal cat = new Animal("cat", "Fluffy", 2, 10, 9, 7, "milk");

        // Display animal data
        System.out.println("------------------------------------------------------");
        displayAnimalData(dog);
        System.out.println("------------------------------------------------------");
        displayAnimalData(cat);

        // Create new adopters
        Adopter mrJohn = new Adopter("John", 1000);
        Adopter msMary = new Adopter("Marry", 2000);

        // Display adopter data
        System.out.println("------------------------------------------------------");
        displayAdopterData(mrJohn);
        System.out.println("------------------------------------------------------");
        displayAdopterData(msMary);

        // Create a new animal food
        Food dogFood = new Food("meat", 1, true);
        Food catFood = new Food("milk", 5, false);

        // Display food data
        System.out.println("------------------------------------------------------");
        displayFoodData(dogFood);
        System.out.println("------------------------------------------------------");
        displayFoodData(catFood);

        // Create new animal activity
        AnimalActivity dogActivity = new AnimalActivity("running");
        AnimalActivity catActivity = new AnimalActivity("climbing");

        // Display animal activity data
        System.out.println("------------------------------------------------------");
        displayAnimalActivityData(dogActivity);
        System.out.println("------------------------------------------------------");
        displayAnimalActivityData(catActivity);

        // Create new vets
        Vet primaryVet = new Vet( "John Doe", "generalist");
        Vet secondaryVet = new Vet("Mary Jane", "surgery");

        // Display vet data
        System.out.println("------------------------------------------------------");
        displayVetData(primaryVet);
        System.out.println("------------------------------------------------------");
        displayVetData(secondaryVet);

    }

    public static void displayVetData(Vet specificVet) {
        System.out.println("Vet name = " + specificVet.getVetName());
        System.out.println("Vet spec = " + specificVet.getVetspec());
    }

    public static void displayAnimalActivityData(AnimalActivity specificAnimalActivity) {
        System.out.println("Animal activity name = " + specificAnimalActivity.getActivityName());
    }

    public static void displayFoodData(Food specificFood) {
        System.out.println("Food name = " + specificFood.getFoodName());
        System.out.println("Food quantity = " + specificFood.getFoodQuantity());
        System.out.println("Food availability = " + specificFood.getFoodAvailability());
    }

    public static void displayAnimalData(Animal specificAnimal) {
        System.out.println("Animal type = " + specificAnimal.getAnimalType());
        System.out.println("Animal name = " + specificAnimal.getAnimalName());
        System.out.println("Animal age = " + specificAnimal.getAnimalAge());
        System.out.println("Animal health rating = " + specificAnimal.getAnimalHungerLevel());
        System.out.println("Animal hunger level = " + specificAnimal.getAnimalHealthRating());
        System.out.println("Animal animal state = " + specificAnimal.getAnimalState());
        System.out.println("Animal preferred food = " + specificAnimal.getAnimalPreferredFood());
    }

    public static void displayAdopterData(Adopter specificAdopter) {
        System.out.println("Adopter name = " + specificAdopter.getAdopterName());
        System.out.println("Adopter cash value = " + specificAdopter.getAvailableCash());
    }
}

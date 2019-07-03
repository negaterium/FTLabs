package AnimalRescuer;

public class Main {

    public static void main(String[] args) {

        // Create some animals with specific data
        // Obiect cu constructor fara parametrii
        Dog pug = new Dog();
        setAnimalData(pug, "Puckie", "dog", 3, 8, 4, 9, "meat");
        pug.setHasFunnyTail(true);
        pug.setBarks(false);
        // Obiect cu constructor cu parametrii
        Dog wolfdog = new Dog(false, true, "wolfdog", "Rex", 5, 9, 8, 10, "meat" );

        // Obiect cu constructor cu parametrii, dar fara mostenire
        Animal cat = new Animal("cat", "Fluffy", 2, 10, 9, 7, "milk");
        Cat specialCat = new Cat(true, true, "cat", "Meoni", 4, 8, 9, 9, "mice");
        Dog spcialDog = new Dog(false, true, "specialdog", "Bubu", 5, 9, 8, 10, "meat" );


        // Check same method name for 2 different objects
        specialCat.dance();
        spcialDog.dance();

        // Check same method name for 2 different objects, inherited from Animal class
        spcialDog.look("bland face");
        specialCat.look(9999);

        // Check overloaded method in Cat compared to Animal class
        Cat overCat = new Cat(false, false, "cat", "Meoni", 4, 8, 9, 9, "mice");
        Animal oldCat = new Animal("cat", "Meoni", 4, 8, 9, 9, "mice");
        overCat.look(9999);  // from Cat, overrides Animal
        oldCat.look(1111);  // from Animal


        // Display animal data
        System.out.println("------------------------------------------------------");
        displayDogData(pug);
        System.out.println("------------------------------------------------------");
        displayDogData(wolfdog);
        System.out.println("------------------------------------------------------");
        displayAnimalData(cat);

        // Create new adopters
        Adopter mrJohn = new Adopter();
        setAdopterData(mrJohn, 75000, "John");

        // Display adopter data
        System.out.println("------------------------------------------------------");
        displayAdopterData(mrJohn);

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
        Vet primaryVet = new Vet();
        setVetData(primaryVet, true, 50, 100000, "surgeon", "Ben");

        // Display vet data
        System.out.println("------------------------------------------------------");
        displayVetData(primaryVet);
    }

    public static void displayVetData(Vet specificVet) {
        System.out.println("Vet name = " + specificVet.getName());
        System.out.println("Vet spec = " + specificVet.getDoctorSpecialisation());
        System.out.println("Vet income = " + specificVet.getIncome());
        System.out.println("Vet age = " + specificVet.getAge());
        System.out.println("Aquatic animals care? = " + specificVet.getAquaticAnimalsCare());
    }

    public static void setVetData(Vet vet, Boolean specificCare, int age, int income, String spec, String name)
    {
        vet.setAquaticAnimalsCare(true);
        vet.setAge(age);
        vet.setIncome(income);
        vet.setDoctorSpecialisation(spec);
        vet.setName(name);
    }

    public static void setAdopterData(Adopter ad, int income, String name)
    {
        ad.setIncome(income);
        ad.setName(name);
    }

    public static void displayAnimalActivityData(AnimalActivity specificAnimalActivity) {
        System.out.println("Animal activity name = " + specificAnimalActivity.getActivityName());
    }

    public static void displayFoodData(Food specificFood) {
        System.out.println("Food name = " + specificFood.getFoodName());
        System.out.println("Food quantity = " + specificFood.getFoodQuantity());
        System.out.println("Food availability = " + specificFood.getFoodAvailable());
    }

    public static void setAnimalData(Animal specificAnimal, String animalName, String animalType, int animalAge, int animalHealthRating,
                                     int animalHungerLevel, int animalState, String animalPreferredFood) {
        specificAnimal.setAnimalName(animalName);
        specificAnimal.setAnimalType(animalType);
        specificAnimal.setAnimalAge(animalAge);
        specificAnimal.setAnimalHealthRating(animalHealthRating);
        specificAnimal.setAnimalHungerLevel(animalHungerLevel);
        specificAnimal.setAnimalState(animalState);
        specificAnimal.setAnimalPreferredFood(animalPreferredFood);
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

    public static void displayDogData(Dog specificDog) {
        System.out.println("Dog type = " + specificDog.getAnimalType());
        System.out.println("Dog name = " + specificDog.getAnimalName());
        System.out.println("Dog age = " + specificDog.getAnimalAge());
        System.out.println("Dog health rating = " + specificDog.getAnimalHungerLevel());
        System.out.println("Dog hunger level = " + specificDog.getAnimalHealthRating());
        System.out.println("Dog animal state = " + specificDog.getAnimalState());
        System.out.println("Dog preferred food = " + specificDog.getAnimalPreferredFood());
        System.out.println("Dog has funny tail = " + specificDog.hasFunnyTail());
        System.out.println("Dog barks ? " + specificDog.getBarks());
    }


    public static void displayAdopterData(Adopter specificAdopter) {
        System.out.println("Adopter name = " + specificAdopter.getName());
        System.out.println("Adopter cash value = " + specificAdopter.getIncome());


    }
}

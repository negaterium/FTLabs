package ConsoleMenu;

import Lab15.ReadNumbers;
import Lab3.*;
import Lab13.*;
import Lab14.*;

import java.util.*;
import java.io.*;

public class Run {

    String[] mainMenuItems = {"--- Main menu ---", "1. Math Operations", "2. Array operations", "3. List operations", "9. Exit"};
    String[] menuItemsMathOps = {" >>> Math operations. ", "1. Addition", "2. Subtraction ", "3. Multiplication", "4. Division", "5. Return to main menu"};
    String[] menuItemsArrayOps = {" >>> Array operations. ", "1. Load array with numbers", "2. Arithmetic mean", "3. Display pattern", "4. Copy data from one array to another", "5. Display smallest and biggest number in an array", "6. Sort array", "7. Return to main menu"};
    String[] menuItemsListOps = {" >>> List operations. ", "1. Display a list of integers", "2. Display a list of strings", "3. Display the biggest value in a list", "4. Return to main menu"};
    Calculator mathObejct = new Calculator();
    LogicalOp myOp = new LogicalOp();
    LogicalOp13 myOp13 = new LogicalOp13();
    ReadNumbers inputNumber = new ReadNumbers();
    ReadNumbers menuChoiceNumber = new ReadNumbers();
    int[] testArray1 = {1, 5, 88, 223, 4, 90, 15};
    int[] testArray2 = {0, 0, 0, 0, 0, 0, 0};
    String[] testStringArray =  {"test","best","nest","fest","crest"};
    int menuSelection;
    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, String> users = new HashMap<String, String>();
    ListOp listObject = new ListOp();
    List<Integer> integerList = new ArrayList<Integer>();
    List<String> stringList = new ArrayList<String>();


    public void Run() {
    }

    private void displayMenu(String[] menu) {
        for (int counter = 0; counter < menu.length; counter++) {
            System.out.println(menu[counter]);
        }
    }

    private int selectItemFromMenu() {

        return menuChoiceNumber.getInt();
    }

    public void clearConsole() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    }

    private void login() {
        // Setting up users/passwords
        users.put("admin", "test1234");
        users.put("tester", "1234");
        users.put("mike", "mike123");
        users.put("joe", "joe1234");
        boolean loginState = false;
        String userName = "", userPassword = "";
        System.out.println("------------------------------");
        System.out.println("Welcome to the Console Program");
        System.out.println("------------------------------");
        do {
            System.out.println("Please enter your user name:");


            try {
                userName = consoleReader.readLine();
                if (users.containsKey(userName)) {
                    try {
                        System.out.println("Please enter your password:");
                        userPassword = consoleReader.readLine();
                        if (users.get(userName).equals(userPassword)) {
                            loginState = true;
                        } else System.out.println("Invalid user or password. Please try again!");

                    } catch (Exception e) {

                        System.out.println("Some error has occurred!");
                        loginState = false;
                    }

                } else System.out.println("Invalid user or password. Please try again!");
            } catch (Exception e) {

                System.out.println("Some error has occurred!");
                loginState = false;
            }

        } while (!loginState);

        System.out.println("--- Welcome : " + userName + " ---");

    }

    public void runCycle() {
        login();
        do {
            displayMenu(mainMenuItems);
            menuSelection = selectItemFromMenu();
            switch (menuSelection) {
                case 1:
                    mathOpsMenu();
                    break;
                case 2:
                    arrayOpsMenu();
                    break;
                case 3:
                    listOpsMenu();
                    break;

                case 9:
                    System.out.println("Closing program");
                    break;
                default:
                    break;
            }
            clearConsole();
        } while (menuSelection != 9);

    }

    private void arrayOpsMenu() {

        int menuChoice, nb1, nb2, waitTime = 3;

        do {
            clearConsole();
            displayMenu(menuItemsArrayOps);
            menuChoice = menuChoiceNumber.getInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Load an array with numbers...");
                    myOp13.loadArray100Values(20);
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;

                case 2:
                    System.out.println("Calcul media aritmetica a valorilor dintr-un array...");
                    System.out.println("Media aritmetica a array-ului de teste este " + myOp13.calculateMediaArray(testArray1));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;

                case 3:
                    System.out.println("Display a specific pattern from an array...");
                    myOp13.afisareGrila();
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;

                case 4:
                    System.out.println("Copy data from one array to another ...");
                    myOp13.afisareArray(myOp13.copyIntArray(testArray1, testArray2));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(5);
                    break;
                case 5:
                    System.out.println("Display smallest and biggest number in an array ...");
                    myOp13.afisareCMM(testArray1);
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;

                case 6:
                    System.out.println("Unsorted array ...");
                    myOp13.afisareArray(testArray1);
                    System.out.println("Sorted array ...");
                    myOp13.afisareArray(myOp13.returnareArrayOrdonat(testArray1));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(10);
                    break;
                case 7:
                    System.out.println("Exiting to menu in  3...2...1...");
                    break;
                default:
                    System.out.println("Returning to menu in  3...2...1...");
                    break;

            }
        }

        while (menuChoice != 7);


    }

    private void listOpsMenu() {

        int menuChoice, waitTime = 3;

        do {
            clearConsole();
            displayMenu(menuItemsListOps);
            menuChoice = menuChoiceNumber.getInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Display a list of integers ...");
                    listObject.displayIntegerList(listObject.addValuesToIntegerList(testArray1, integerList));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;

                case 2:
                    System.out.println("Display a list of strings ...");
                    listObject.displayStringList(listObject.addValuesToStringList(testStringArray, stringList));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;

                case 3:
                    System.out.println("Display the biggest value in a list...");
                    System.out.println("The biggest value in the list is " + listObject.biggestValueOfList(listObject.addValuesToIntegerList(testArray1, integerList)));

                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;
                case 4:
                    System.out.println("Exiting to menu in  3...2...1...");
                    break;
                default:
                    System.out.println("Returning to menu in  3...2...1...");
                    break;
            }
        }

        while (menuChoice != 4);
    }


    private void mathOpsMenu() {

        int nb1, nb2, waitTime = 3;

        do {
            clearConsole();
            displayMenu(menuItemsMathOps);
            menuSelection = selectItemFromMenu();
            switch (menuSelection) {
                case 1:
                    System.out.println("Addition operation");
                    System.out.println("Enter first number:");
                    nb1 = inputNumber.getInt();
                    System.out.println("Enter second number:");
                    nb2 = inputNumber.getInt();
                    System.out.println("Addition result is: " + mathObejct.adunare(nb1, nb2));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;
                case 2:
                    System.out.println("Substraction operation");
                    System.out.println("Enter first number:");
                    nb1 = inputNumber.getInt();
                    System.out.println("Enter second number:");
                    nb2 = inputNumber.getInt();
                    System.out.println("Substraction result is: " + mathObejct.scadere(nb1, nb2));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;
                case 3:
                    System.out.println("Multiply operation");
                    System.out.println("Enter first number:");
                    nb1 = inputNumber.getInt();
                    System.out.println("Enter second number:");
                    nb2 = inputNumber.getInt();
                    System.out.println("Multiply result is: " + mathObejct.inmultire(nb1, nb2));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;
                case 4:
                    System.out.println("Division operation");
                    System.out.println("Enter first number:");
                    nb1 = inputNumber.getInt();
                    System.out.println("Enter second number:");
                    nb2 = inputNumber.getInt();
                    System.out.println("Division result is: " + mathObejct.impartire(nb1, nb2));
                    System.out.println("Returning to menu in  3...2...1...");
                    myOp.wait(waitTime);
                    break;
                case 5:
                    System.out.println("Returning to menu in  3...2...1...");
                    break;
                default:
                    break;
            }
        } while (menuSelection != 5);
    }
}

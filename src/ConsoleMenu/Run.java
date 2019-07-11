package ConsoleMenu;

import Lab15.ReadNumbers;

public class Run {

    String[] menuItems = {"Please select an option from the menu", "1. Math Operations", "2. Etc ", "3. Exit"};

    public void Run() {
    }

    private void displayMenu(String[] menu) {
        for (int counter = 0; counter < menu.length; counter++) {
            System.out.println(menu[counter]);
        }
    }

    private int selectItemFromMenu() {
        ReadNumbers menuChoiceNumber = new ReadNumbers();
        int menuChoice = 0;

        do {
            menuChoice = menuChoiceNumber.getInt();
        } while (menuChoice != 3);

        return menuChoice;
    }

    public void clearConsole() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

    }

    public void runCycle() {

        displayMenu(menuItems);

        switch (selectItemFromMenu()) {
            case 3:
                System.out.println("Closing program");
                return;
            default:
                return;

        }


    }


}

package Lab15;

import java.util.*;


public class ReadNumbers {

    public ReadNumbers() {
    }

    public int getInt() {
        int value = 0;
        Boolean exitCriteria = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                value = scan.nextInt();
                exitCriteria = false;
            } catch (InputMismatchException e) {
                System.out.println("Error! Not an integer!");
                exitCriteria = true;
            }
        }
        while (exitCriteria);
        return value;
    }

    public float getFloat() {
        float value = 0;
        Boolean exitCriteria = false;
        do {
            try {
                System.out.println("Enter an integer value:");
                Scanner scan = new Scanner(System.in);
                value = scan.nextFloat();
                exitCriteria = false;
            } catch (InputMismatchException e) {
                System.out.println("Error! Not a float value!");
                exitCriteria = true;
            }
        }
        while (exitCriteria);
        return value;
    }

    public double getDouble() {
        double value = 0;
        Boolean exitCriteria = false;
        do {
            try {
                System.out.println("Enter an integer value:");
                Scanner scan = new Scanner(System.in);
                value = scan.nextDouble();
                exitCriteria = false;
            } catch (InputMismatchException e) {
                System.out.println("Error! Not a double value!");
                exitCriteria = true;
            }
        }
        while (exitCriteria);
        return value;
    }

}

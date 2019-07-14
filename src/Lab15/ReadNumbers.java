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
                System.out.println("Enter a float value:");
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
                System.out.println("Enter an double value:");
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

    public int[] readArrayNb(int positions) {
        int counter = 0;
        int[] myArray = new int[positions];
        while (counter < positions) {
            System.out.println("Citire valoare la pozitia: " + counter);
            myArray[counter] = getInt();
            counter++;
        }

        return myArray;
    }


    public List<Integer> readArray() {
        List<Integer> myList = new ArrayList<Integer>();
        int value = 0, counter = 0;

        Boolean exitCriteria = true;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                value = scan.nextInt();
                myList.add(counter, value);
                counter++;
                exitCriteria = true;
            } catch (InputMismatchException e) {
                System.out.println("Exiting. No number input!");
                exitCriteria = false;
            }
        }
        while (exitCriteria);
        return myList;
    }


}


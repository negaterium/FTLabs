package Lab13;

import java.util.Arrays;
import java.util.*;

public class LogicalOp13 {
    public void LogicalOp13() {
    }

    // Tema -Lab 13 -Java Arrays
    // P2 - Metoda load array cu 100 valori

    public void loadArray100Values(int nbValori) {
        int[] myArray = new int[nbValori];
        for (int counter = 0; counter < nbValori; counter++) {
            myArray[counter] = counter;
            System.out.println("Array position <" + counter + "> has value <" + myArray[counter] + ">");
        }
    }

    // P3 - Metoda load array cu x valori pare pana la 100
    public int[] loadArrayEvenValues(int myArray[]) {
        int counter2 = 0;
        int arrayLength = myArray.length;
        int[] internalArray = new int[arrayLength / 2];
        for (int counter1 = 0; counter1 < arrayLength; counter1++) {
            if (counter1 % 2 == 0) {
                internalArray[counter2] = counter1;
                counter2++;
            }
        }
        return internalArray;
    }

    // P4 - Metoda calculare media aritmetica a valorilor dintr-un array
    public int calculateMediaArray(int myArray[]) {
        int suma = 0;
        int arrayLength = myArray.length;
        for (int counter = 0; counter < arrayLength; counter++)
            suma += myArray[counter];
        return suma / arrayLength;
    }

    // P5 - Metoda comparare strings
    public boolean vrificareStringArrays(String[] arrayOfStrings, String compareString) {
        for (int counter = 0; counter < arrayOfStrings.length; counter++) {
            if (arrayOfStrings[counter].equals(compareString)) return true;
        }
        return false;
    }

    // P6 - Metoda comparare valori int
    public int vrificareIntArrays(int[] arrayOfInt, int compareInt) {
        boolean flag = false;
        int position = 0;
        for (int counter = 0; counter < arrayOfInt.length; counter++) {
            if (arrayOfInt[counter] == compareInt) {
                flag = true;
                position = counter + 1;
            }

        }
        if (flag) return position;
        else return -1;
    }

    public void afisareArray(int[] myArray) {
        for (int counter = 0; counter < myArray.length; counter++) {
            System.out.println("Array position <" + counter + "> has value <" + myArray[counter] + ">");
        }
    }

    // P6 - Afisare grilla

    public void afisareGrila() {
        int counter1 = 0, counter2 = 0, counter3 = 0;
        char[] myArray = new char[100];

        for (int tcount = 0; tcount < 100; tcount++)
            myArray[tcount] = '-';

        while (counter1 < 10) {
            while (counter2 < 10) {
                System.out.print(myArray[counter3] + " ");
                counter3++;
                counter2++;
            }
            counter1++;
            counter2 = 0;
            System.out.print("\n");
        }
    }

    // P8 - Afisare array fara un numar
    public int[] returnArrayFaraNumar(int[] myArray, int nbToCheck) {
        int[] internalArray = new int[myArray.length - 1];
        int[] emptyArray = new int[myArray.length - 1];
        int step = 0;
        boolean flag = false;
        for (int counter = 0; counter < myArray.length; counter++) {
            if (myArray[counter] == nbToCheck) flag = true;
        }
        if (flag) {
            for (int c2 = 0; c2 < myArray.length; c2++) {
                if (myArray[c2] != nbToCheck) {
                    internalArray[step] = myArray[c2];
                    step++;
                }

            }
            return internalArray;
        } else return emptyArray;
    }

    // P9 si optional P1 - Returnare al doilea cel mai mic numar dintr-un array
    public int returnareAlDoileNumarMic(int[] myArray) {

        Arrays.sort(myArray);
        return (myArray[1]);
    }

    // P10 - Copy date dintr-un array in altul
    public int[] copyIntArray(int[] array1, int[] array2) {
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] = array1[counter];
        return array2;
    }

    // Optional P2 - inserare element pe pozitie specifica
    public int[] inserareElementInArray(int[] myArray, int element, int position) {
        if (position >= 0 && position < myArray.length) {
            myArray[position] = element;
            System.out.println("Elementul " + element + " a fost inserat pe pozitia " + position);
            return myArray;
        } else {
            System.out.println("Pozitia specificate este invalida, array-ul este nemodificat");
            return myArray;
        }
    }

    // Optional P3 - Afisare cel mai mic si cel mai mare numar dintr-un array
    public void afisareCMM(int[] myArray) {
        Arrays.sort(myArray);
        System.out.println("Cel mai mic numar din array este: " + myArray[0]);
        System.out.println("Cel mai mare numar din array este: " + myArray[myArray.length - 1]);
    }

    // Optional P4 - Inversare valori din array
    public int[] inversareValoriArray(int[] myArray) {
        int[] internalArray = new int[myArray.length];
        int inverseCounter = myArray.length - 1;
        for (int counter = 0; counter < myArray.length; counter++) {
            internalArray[counter] = myArray[inverseCounter];
            inverseCounter--;
        }
        return internalArray;
    }

    // Optional P5- Afisare duplicate array
    public void afisareDuplicateArray(int[] myArray) {
        Arrays.sort(myArray);
        for (int counter = 0; counter < myArray.length - 1; counter++)
            if (myArray[counter] == myArray[counter + 1])
                System.out.println("Duplicate value -> " + myArray[counter]);
    }

    // Optional P6 - Afisare elemente comune in arrays de strings

    public void afisareElementeComune(String[] myArray1, String[] myArray2) {
        Arrays.sort(myArray1);
        Arrays.sort(myArray2);
        String[] internalArray = new String[myArray1.length];
        int counter1 = 0, counter3 = 0;
        while (counter1 < myArray1.length) {
            for (int counter2 = 0; counter2 < myArray2.length; counter2++)
                if (myArray1[counter1] == myArray2[counter2]) {
                    internalArray[counter3] = myArray1[counter1];
                    counter3++;
                }
            counter1++;

        }

        for (int ctemp = 0; ctemp < internalArray.length; ctemp++) {
            if (internalArray[ctemp] != null)
                System.out.println("Element comun ->" + internalArray[ctemp]);
        }

    }

    // Optional P7 - Returnare array ordonat
    public int[] returnareArrayOrdonat(int[] myArray) {

        Arrays.sort(myArray);
        return myArray;
    }

    // lab 15 - P5 - Verificare valoare in array
    public void verValueInArray(int myArray[], int val) {

        boolean exitCriteria = true;
        try {

            System.out.println("Valoarea de pe pozitia: " + val + " este: " + myArray[val]);
            exitCriteria = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }

    }


}





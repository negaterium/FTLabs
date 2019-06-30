package Lab13;

import Lab3.Calculator;

public class Main {
    public static void main(String[] args) {

        LogicalOp13 myOp = new LogicalOp13();
        Calculator myCalculator = new Calculator();

        // Tema obligatorie - Lab 13 - Java Arrays

        // P1 - Overload metode din Calculator
        System.out.println("-------------------------------------");
        System.out.println("Overload metode din clasa Calculator");
        System.out.println("Adunare int cu int -> " + myCalculator.adunare(123, 345));
        System.out.println("Adunare float cu float -> " + myCalculator.adunare(123.1, 345.5));
        System.out.println("Adunare float cu float cu float -> " + myCalculator.adunare(123.1, 345.5, 654.1223));
        System.out.println("Scadere int cu int cu int cu int -> " + myCalculator.scadere(999, 222, 111, 222));
        System.out.println("Inmultire int cu int -> " + myCalculator.inmultire(123, 345));
        System.out.println("Inmultire float cu float -> " + myCalculator.inmultire(123.1, 345.5));
        System.out.println("Inmultire float cu float cu float -> " + myCalculator.inmultire(123.1, 345.5, 654.1223));
        System.out.println("Impartire int cu int cu int cu int-> " + myCalculator.impartire(88888, 5, 3, 2));

        // P2 - Metoda load array cu 100 valori
        System.out.println("-------------------------------------");
        System.out.println("Afisare valori dintr-un array ");
        myOp.loadArray100Values(100);
        // P3 - Metoda load array cu  valori pare
        System.out.println("-------------------------------------");
        System.out.println("Afisare valori pare dintr-un array ");
        int nbValori = 100;
        int[] emptyArray = new int[nbValori];
        myOp.afisareArray(myOp.loadArrayEvenValues(emptyArray));
        // P4 - Metoda calculare media aritmetica valori din array
        System.out.println("-------------------------------------");
        System.out.println("Afisare media valori dintr-un array ");
        int[] arrayCuValori = {1, 4, 53, 29, 199, 200};
        System.out.println("Media valori din array este: " + myOp.calculateMediaArray(arrayCuValori));

        // P5 - Metoda comparare strings
        System.out.println("-------------------------------------");
        System.out.println("Comparare strings ");
        String[] stringArray = {"one", "two", "three"};
        System.out.println("Comparam <test> cu array values -> " + myOp.vrificareStringArrays(stringArray, "test"));
        System.out.println("Comparam <one> cu array values -> " + myOp.vrificareStringArrays(stringArray, "one"));

        // P6 - Metoda comparare integers
        System.out.println("-------------------------------------");
        System.out.println("Comparare integers si returnare pozitie in array ");
        int[] intArray = {3,4,7,8,9,12,33};
        System.out.println("Comparam <12> cu array values -> pozitia pe care e numarul: " + myOp.vrificareIntArrays(intArray, 12));
        System.out.println("Comparam <555> cu array values -> pozitia pe care e numarul: (-1 daca nu e in lista)" + myOp.vrificareIntArrays(intArray, 555)); //for invalid case

        // P7 - Metoda comparare integers
        System.out.println("-------------------------------------");
        System.out.println("Afisare grila ");
        myOp.afisareGrila();

        // P8 - Returnare array fara un numar
        System.out.println("-------------------------------------");
        System.out.println("Returnare array fara un anumit numar - valid case ");
        int[] intArrayP8 = {3,4,7,8,9,12,33};
        myOp.afisareArray(myOp.returnArrayFaraNumar(intArrayP8, 33));
        System.out.println("Returnare array fara un anumit numar - invalid case - will return an array with empty values/0");
        myOp.afisareArray(myOp.returnArrayFaraNumar(intArrayP8, 3333));

        // P9 si Optional P1 - Returnare al doilea cel mai mic numar dintr-un array
        System.out.println("-------------------------------------");
        System.out.println("Returnare al doilea cel mai mic numar dintr-un array");
        int[] intArrayP9 = {55,1,8,100,7,56,22,1000};
        System.out.println("Al doilea cel mai mic numar din array este " + myOp.returnareAlDoileNumarMic(intArrayP9));

        // P10 - Copy date dintr-un array in altul gol
        System.out.println("-------------------------------------");
        System.out.println("Copy date dintr-un array in altul gol");
        int[] intArrayP10a = {1,2,3,4,5,6,7};
        int[] intArrayP10b = new int[intArrayP10a.length];
        System.out.println("Date copiate in array ");
        myOp.afisareArray(myOp.copyIntArray(intArrayP10a, intArrayP10b));


        ///////////////////////////////////////////////////////////////////////////
        // Optional P2 - inserare element pe pozitie specifica
        System.out.println("-------------------------------------");
        System.out.println("Inserare element intr-un array");
        int[] intArrayP2Optional = {1,2,3,4,5,6,7};
        System.out.println("Array-ul initial este");
        myOp.afisareArray(intArrayP2Optional);
        System.out.println("Array-ul cu un element inserat pe o pozitie este");
        myOp.afisareArray(myOp.inserareElementInArray(intArrayP2Optional, 100, 2));

        // Optional P3 - Afisare cel mai mic si cel mai mare numar dintr-un array
        System.out.println("-------------------------------------");
        System.out.println("Afisare cel mai mic si cel mai mare numar dintr-un array");
        int[] intArrayP3Optional = {55,1,8,100,7,56,22,1000};
        myOp.afisareCMM(intArrayP3Optional);

        // Optional P4 - Inversare valori dintr-un array
        System.out.println("-------------------------------------");
        System.out.println("Inversarea valorilor dintr-un array");
        int[] intArrayP4Optional = {55,1,8,100,7,56,22,1000};
        myOp.afisareArray(myOp.inversareValoriArray(intArrayP4Optional));

        // Optional P5 - Afisare duplicate array
        System.out.println("-------------------------------------");
        System.out.println("Afisare duplicate array");
        int[] intArrayP5Optional = {55,1,1,100,7,56,3,3};
        myOp.afisareDuplicateArray(intArrayP5Optional);

        // Optional P6 - Afisare elemente comune din string arrays
        System.out.println("-------------------------------------");
        System.out.println("Afisare duplicate array");
        String[] stringArrayP6OptionalA = {"one", "two", "three"};
        String[] stringArrayP6OptionalB = {"one", "four", "five", "one"};
        myOp.afisareElementeComune(stringArrayP6OptionalA, stringArrayP6OptionalB);

        // Optional P7 - Returnare array ordonat
        System.out.println("-------------------------------------");
        System.out.println("Afisare array ordonat crescator");
        int[] intArrayP7Optional = {55,1,1,100,7,56,3,3,24,67};
        myOp.afisareArray(myOp.returnareArrayOrdonat(intArrayP7Optional));
    }
}

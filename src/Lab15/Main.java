package Lab15;

import Lab13.LogicalOp13;
import Lab14.ListOp;
import Lab3.LogicalOp;

public class Main {
    public static void main(String[] args) {

        ReadNumbers test = new ReadNumbers();
        LogicalOp13 arrayObject = new LogicalOp13();
        ListOp listObject = new ListOp();
        LogicalOp myOp = new LogicalOp();


        // Lab 15 - P1
        // Citire numar de la tastatura
        System.out.println("---------------------------------------");
        System.out.println("Tasteaza un numar intreg:");
        int l16p1 = test.getInt();
        System.out.println("Numarul intreg citit de la tastatura este: " + l16p1);

        // Lab 15 - P2
        // Citire numar float si double de la tastatura

        float l16p2f = test.getFloat();
        System.out.println("---------------------------------------");
        System.out.println("Numarul float citit de la tastatura este: " + l16p2f);


        double l16p2d = test.getDouble();
        System.out.println("---------------------------------------");
        System.out.println("Numarul double citit de la tastatura este: " + l16p2d);


        // Lab 15 - P3
        // Citire un array de diminsiune specificata de la tastatura
        System.out.println("---------------------------------------");
        System.out.println("Citire si apoi afisare un array de dimensiune specificata (5)");
        arrayObject.afisareArray(test.readArrayNb(5));



        // Lab 15 - P4
        // Citire un array de diminsiune nespecificata de la tastatura
        System.out.println("---------------------------------------");
        System.out.println("Citire si apoi afisare un array");
        System.out.println("Tastati numere (cu non-numere se iese)");
        listObject.displayIntegerList(test.readArray());


        // Lab 15 - P5
        // Verificare positie numar in array
        System.out.println("---------------------------------------");
        System.out.println("Verificare positie numar in array");
        int[] intArrayL16P5 = {1,2,3,4,5,6,7};
        arrayObject.verValueInArray(intArrayL16P5,5);

        /*
         Lab 15 - P6
         Waiting for timer...
        */
        System.out.println("---------------------------------------");
        System.out.println("Waiting for timer...");
        myOp.wait(5);
        System.out.println("Done!");

    }
}

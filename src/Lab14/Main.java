package Lab14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  Lab 14 - Tema liste
        // P1 - Afisare elemente dintr-o lista
        ListOp myOp = new ListOp();
        List<Integer> l14p1 = new ArrayList<Integer>();
        int[] myIntegerList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] myIntegerList2 = {5, 42, 3, 88, 0, 123, 99, 1228, 1};
        System.out.println("---------------------------------------");
        System.out.println("P1 - Afisare valori dintr-o lists");
        myOp.displayIntegerList(myOp.addValuesToIntegerList(myIntegerList, l14p1));

        // P2 - Adaugare un numar la sfarsit de lista
        System.out.println("---------------------------------------");
        System.out.println("P2 - Adaugare numar la sfarsit de lista");
        List<Integer> l14p2 = new ArrayList<Integer>();
        myOp.displayIntegerList(myOp.addNumberToEndOfList(myOp.addValuesToIntegerList(myIntegerList, l14p2), 100));

        // P3 - Afisare valori incepand de la un numar
        System.out.println("---------------------------------------");
        System.out.println("P3 - Afisare valori incepand de la un numar");
        List<Integer> l14p3 = new ArrayList<Integer>();
        l14p3 = myOp.addValuesToIntegerList(myIntegerList, l14p3);
        myOp.displayIntegerListFromAValue(l14p3, 4);

        // P4 - Afisare valori de la coada la capat
        System.out.println("---------------------------------------");
        System.out.println("P4 - Afisare valori de la coada la capat");
        List<Integer> l14p4 = new ArrayList<Integer>();
        l14p4 = myOp.addValuesToIntegerList(myIntegerList, l14p4);
        myOp.displayIntegerListRevers(l14p4);

        // P5 - Adaugare string intr-o lista
        System.out.println("---------------------------------------");
        System.out.println("P5 - Adaugare string intr-o lista");
        List<String> l14p5 = new ArrayList<String>();
        String[] myStringList = {"test","car","team","water"};
        l14p5 = myOp.addValuesToStringList(myStringList, l14p5);
        myOp.displayStringList(myOp.setStringInAList(l14p5, "AAAA", 2));

        // P6 - Adaugare un numar la inceput de lista
        System.out.println("---------------------------------------");
        System.out.println("P6 - Adaugare un numar la inceput de lista");
        List<Integer> l14p6 = new ArrayList<Integer>();
        l14p6 = myOp.addValuesToIntegerList(myIntegerList, l14p6);
        myOp.displayIntegerList(myOp.addNumberToBeginingOfList(l14p6, 999));

        // P7 - Afisare lista cu pozitii
        System.out.println("---------------------------------------");
        System.out.println("P7 - Afisare lista cu pozitii");
        List<Integer> l14p7 = new ArrayList<Integer>();
        l14p7 = myOp.addValuesToIntegerList(myIntegerList, l14p7);
        myOp.displayIntegerList(l14p7);

        // P8 - Afisare cel mai mare numar dintr-o lista
        System.out.println("---------------------------------------");
        System.out.println("P8 - Afisare cel mai mare numar dintr-o lista");
        List<Integer> l14p8 = new ArrayList<Integer>();
        l14p8 = myOp.addValuesToIntegerList(myIntegerList2, l14p8);
        System.out.println("Cea mai mare valoared din lista este " + myOp.biggestValueOfList(l14p8));
    }
}

package Lab2;

public class TemaLab2 {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------
        //Tema lab 1 folosind functii
        //Tema p.1
        System.out.println("Tema 1,part 1");
        printMyName("TestName");
        //Tema p.2
        System.out.println("Tema 1,part 2");
        System.out.println(sumaNumere(1234, 4321));
        //Tema p.3
        System.out.println("Tema 1,part 3");
        System.out.println(impartireNumere(555, 12.3f));
        //Tema p.4
        System.out.println("Tema 1,part 4");
        customOperations();
        //---------------------------------------------------------------------------
        //Tema lab 2
        //Tema p.2 - functii pentru cele 4 operatii matematice
        //---Suma a 2 numere
        System.out.println("Suma a doua numere = " + sumaNumere(100, 200));
        //---Diferente a 2 numere
        System.out.println("Diferenta a doua numere = " + diferentaNumere(500, 290));
        //---Inmultirea a 2 numere
        System.out.println("Inmultirea a doua numere = " + inmultireNumere(23, 66));
        //---Impartire a 2 numere
        System.out.println("Impartire a doua numere = " + impartireNumere(667, 6));

        //Tema p.3 - Printing a specific model -JAVA
        printJavaModel();

        //Tema p.4 - Tiparire medie numere naturale
        System.out.println("Media a 3 numere naturale = " + mediaNumere(123, 234.5f, 556));

        //Tema p.5 - Printing a specific model -Head
        printHeadModel();

    }

    public static void printHeadModel() {
        printModel("   J    a    v     v  a");
        printModel("   J   a a    v   v  a  a");
        printModel("J  J  aaaaa    v v  aaaaaa");
        printModel(" JJ  a     a    v  a      a");
    }

    public static void printJavaModel() {
        printModel("   J    a    v     v  a");
        printModel("   J   a a    v   v  a  a");
        printModel("J  J  aaaaa    v v  aaaaaa");
        printModel(" JJ  a     a    v  a      a");
    }

    public static float mediaNumere(float n1, float n2, float n3) {

        float media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static void printModel(String modelString) {
        System.out.println(modelString);

    }


    public static void printMyName(String myName) {
        System.out.println("Hello" + "\n" + myName);
    }


    public static int sumaNumere(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static int diferentaNumere(int firstNumber, int secondNumber) {
        int dif = firstNumber - secondNumber;
        return dif;
    }

    public static float impartireNumere(float thirdNumber, float fourthNumber) {

        float divideResult = thirdNumber / fourthNumber;
        return divideResult;
    }

    public static float inmultireNumere(float thirdNumber, float fourthNumber) {

        float multiplyResult = thirdNumber * fourthNumber;
        return multiplyResult;
    }

    public static void customOperations() {
        int caseA = -5 + 8 * 6;
        System.out.println("Rezultat case a. = " + caseA);
        int caseB = (55 + 9) % 9;
        System.out.println("Rezultat case b. (modulo) = " + caseB);
        float caseC = 20 + -3 * 5 / 8;
        System.out.println("Rezultat case c.  = " + caseC);
        float caseD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Rezultat case d.  = " + caseD);

    }


}

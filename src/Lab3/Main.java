package Lab3;

public class Main {
    public static void main(String[] args) {

        // Tema Lab 3 - p1
        System.out.println("-----------------------------------------------------------------------");
        operatiiMatematice();

        // Tema Lab 3 - p2->11
        System.out.println("-----------------------------------------------------------------------");
        operatiiLogice();

    }

    public static void operatiiMatematice() {
        System.out.println("Operatii matematice");
        Calculator myAdition = new Calculator(100, 200, "+");
        Calculator mySubstraction = new Calculator(1200, 200, "-");
        Calculator myMultiply = new Calculator(223, 444, "*");
        Calculator myDivision = new Calculator(546, 32, "/");
        myAdition.mathOperation();
        mySubstraction.mathOperation();
        myMultiply.mathOperation();
        myDivision.mathOperation();
    }

    public static void operatiiLogice() {
        LogicalOp myOp = new LogicalOp();
        int compNbOne = 234,
                compNbTwo = 432,
                biggestNumber;
        String text1 = "FastTrack",
                text2 = "FastTrackIT",
                correctResult = "Learning text comparison",
                incorrectResult = "Got to try some more";
        biggestNumber = myOp.checkBiggerNumber(compNbOne, compNbTwo);

        System.out.println("Comparatie dintre 2 numere - " + compNbOne + " si " + compNbTwo + " -> cel mai mare este: " + biggestNumber);
        System.out.println("Comparatie dintre 2 texte - " + text1 + " - si - " + text2 + " -> " + myOp.checkStringValue(text1, text2, correctResult, incorrectResult));
        System.out.println("Comparatie dintre 2 texte - " + text2 + " - si - " + text2 + " -> " + myOp.checkStringValue(text2, text2, correctResult, incorrectResult));
        System.out.println("Comparatie string si int (primul caz) -> " + myOp.checkFunctionTwo("FastTrackIT", 2));
        System.out.println("Comparatie string si int (al doilea caz) -> " + myOp.checkFunctionTwo("Test", 6));

        System.out.println("Nivel zapada (primul caz) -> " + myOp.checkFunctionThree(6));
        System.out.println("Nivel zapada (al doile caz) -> " + myOp.checkFunctionThree(3));
        System.out.println("Nivel zapada (al treilea caz) -> " + myOp.checkFunctionThree(15));

        System.out.println("Verificare numar (primul caz) -> " + myOp.checkFunctionFour(3));
        System.out.println("Verificare numar (al doile caz) -> " + myOp.checkFunctionFour(4));
        System.out.println("Verificare numar (al treilea caz) -> " + myOp.checkFunctionFour(5));
        System.out.println("Verificare numar (al patrulea caz) -> " + myOp.checkFunctionFour(2));

        System.out.println("Verificare numar (switch op) - 2 - ");
        myOp.checkFunctionFive(2);
        System.out.println("Verificare numar (switch op) - 7 - ");
        myOp.checkFunctionFive(7);

        System.out.println("Verificare numar par (primul caz) - 4 - " + myOp.isNumberEven(4));
        System.out.println("Verificare numar par (al doile caz) - 5 - " + myOp.isNumberEven(5));

        System.out.println("Verificare eligibilitate vot (primul caz) - 15 - " + myOp.isEligibleToVote(15));
        System.out.println("Verificare eligibilitate vot (al doile caz) - 18 - " + myOp.isEligibleToVote(18));
        System.out.println("Verificare eligibilitate vot (al treilea caz) - 25 - " + myOp.isEligibleToVote(25));

        //System.out.println("Care e cel mai mare numar dintre : 55, 4, 7 -> ", myOp.checkThreeNumbers(55, 4, 7));

        System.out.println("-------------------------------------");
        System.out.println("Functii care folosesc For");
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere la n la 100");
        myOp.displayListTo100(23);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere la n la -100");
        myOp.displayListToMinus100(5);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere la un nr la altu");
        myOp.displayListFromNbToNb(-2, 34);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere de la un nr mic la nr mare");
        myOp.displayListFromLittleToBig(67, 80);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere de la un nr mare la nr mic");
        myOp.displayListFromLittleToBig(200, 190);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere pare de la 1 la 100");
        myOp.displayNumerePare1to100();
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere impare de la 1 la 100");
        myOp.displayNumereImpare1to100();
        System.out.println("-------------------------------------");
        System.out.println("Tiparire suma numere de la n la 100");
        System.out.println(myOp.returnSumaNumere(25));
        System.out.println("-------------------------------------");
        System.out.println("Tiparire media numere de la n la 100");
        System.out.println(myOp.returnMediaNumere(25));
        System.out.println("-------------------------------------");
        System.out.println("Tiparire pattern");
        myOp.displayStarPattern();


        System.out.println("-------------------------------------");
        System.out.println("Functii care folosesc While");

        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere la n la 100 folsind while");
        myOp.displayListTo100W(45);
        System.out.println("Tiparire lista numere la n la -100 folsind while");
        myOp.displayListToMinus100W(4);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere de la un nr mic la nr mare folosind while");
        myOp.displayListFromLittleToBigW(67, 80);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere de la un nr mare la nr mic folosind while");
        myOp.displayListFromLittleToBigW(200, 190);
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere pare de la 1 la 100");
        myOp.displayNumerePare1to100W();
        System.out.println("-------------------------------------");
        System.out.println("Tiparire lista numere impare de la 1 la 100");
        myOp.displayNumereImpare1to100W();
        System.out.println("-------------------------------------");
        System.out.println("Calcule pe numere din interval");
        myOp.calculeInterval(111,8899);
        System.out.println("-------------------------------------");
        System.out.println("Calcule pe numere divizibile cu 7 din interval");
        myOp.calculeIntervalDiv7(1,29);
        System.out.println("-------------------------------------");
        System.out.println("Numerele Fibonacci pana la n");
        myOp.fibonacci(20);


    }
}
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
        String text1 = "FsstTrack",
                text2 = "FsstTrackIT",
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

        System.out.println("Care e cel mai mare numar dintre : 55, 4, 7 -> ", myOp.checkThreeNumbers(55, 4, 7));
    }

}

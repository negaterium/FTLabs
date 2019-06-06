package Lab3;
import java.util.Arrays;

public class LogicalOp {

    public LogicalOp() {

    }

    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        // No checking for equality
        if (firstNumber < secondNumber)
            return secondNumber;
        else return firstNumber;
    }

    public String checkStringValue(String firstString, String secondString, String correctResultText, String incorrectResultText) {
        if (firstString.equals(secondString))
            return correctResultText;
        else
            return incorrectResultText;
    }

    public String checkFunctionTwo(String paramOne, int paramTwo) {
        if (paramOne.equals("FastTrackIT")) {
            if (paramTwo <= 3) {
                return (paramOne + "," + paramTwo);
            }
        } else if (paramTwo >= 4)
            return (paramTwo + "," + paramOne);
        return ("Invalid case");
    }

    public String checkFunctionThree(int paramOne) {
        if (paramOne == 6 | paramOne > 8)
            return ("The amount of snow this winter was(cm): " + paramOne);
        else
            return ("The forecast snow is(cm): " + paramOne);
    }

    public String checkFunctionFour(int paramOne) {
        if (paramOne == 3 & paramOne != 4)
            return ("The number is greater than 3 and not equal to 4");
        else if (paramOne == 4)
            return ("The number is equal to 4");
        else if (paramOne < 3)
            return ("The number is lower than 3");
        return ("Invalid case. Number is higher than 4");
    }

    public void checkFunctionFive(int paramOne) {
        switch (paramOne) {
            case 1:
                System.out.println("Numarul este 1!");
                break;
            case 2:
                System.out.println("Numarul este 2!");
                break;
            case 3:
                System.out.println("Numarul este 3!");
                break;
            case 4:
                System.out.println("Numarul este 4!");
                break;
            case 5:
                System.out.println("Numarul este 5!");
                break;
            case 6:
                System.out.println("Numarul este 6!");
                break;
            case 7:
                System.out.println("Numarul este 7!");
                break;
            case 8:
                System.out.println("Numarul este 8!");
                break;
            case 9:
                System.out.println("Numarul este 9!");
                break;
        }
    }

    public Boolean isNumberEven(int number) {
        int restImpartireLa2;
        restImpartireLa2 = number % 2;
        if (restImpartireLa2 == 0) return true;
        else return false;

    }

    public Boolean isEligibleToVote(int age) {
        if (age >= 18) return true;
        else return false;
    }

    public int checkThreeNumbers(int nbOne, int nbTwo, int nbThree) {
        int[] listaNumere = {nbOne, nbTwo,nbThree};
        return sort(listaNumere[]);
    }

    public int sort(int[] myList){
    Arrays.sort(myList);
    int listLength = myList.length-1;
    return myList[listLength];
    }
}





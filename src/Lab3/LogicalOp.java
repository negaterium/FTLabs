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
        return restImpartireLa2 == 0;

    }

    public Boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public void checkThreeNumbers(int nbOne, int nbTwo, int nbThree) {
        int[] listaNumere = new int[]{nbOne, nbTwo, nbThree};
        //return sort(listaNumere[])
    }

    public int sort(int[] myList) {
        Arrays.sort(myList);
        int listLength = myList.length - 1;
        return myList[listLength];
    }

    public void displayListTo100(int nb) {
        if (nb > 100)
            System.out.println("Numarul este mai mare de 100");
        else if (nb < 0)
            System.out.println("Numarul este mai mic decat 0");
        else
            for (int contor = nb; contor <= 100; contor++)
                System.out.println("-> " + contor);
    }

    public void displayListToMinus100(int nb) {
        if (nb < -100)
            System.out.println("Numarul este mai mic de -100");
        else
            for (int contor = nb; contor >= -100; contor--)
                System.out.println("-> " + contor);
    }

    public void displayListFromNbToNb(int nbOne, int nbTwo) {
        for (int contor = nbOne; contor <= nbTwo; contor++)
            System.out.println("-> " + contor);
    }

    public void displayListFromLittleToBig(int nbOne, int nbTwo) {
        int start = nbOne;
        int end = nbTwo;
        if (nbOne > nbTwo) {
            start = nbTwo;
            end = nbOne;
        }
        for (int contor = start; contor <= end; contor++)
            System.out.println("-> " + contor);
    }

    public void displayNumerePare1to100() {
        for (int contor = 1; contor <= 100; contor++)
            if (contor % 2 == 0)
                System.out.println("-> " + contor);
    }

    public void displayNumereImpare1to100() {
        for (int contor = 1; contor <= 100; contor++)
            if (contor % 2 != 0)
                System.out.println("-> " + contor);
    }

    public int returnSumaNumere(int nb) {
        int suma = 0;
        for (int contor = nb; contor <= 100; contor++)
            suma += contor;
        return suma;
    }

    public float returnMediaNumere(int nb) {
        int suma = 0;
        float media = 0;
        for (int contor = nb; contor <= 100; contor++)
            suma += contor;
        if (nb != 100) media = suma / (100 - nb);
        else System.out.println("Cannot divide by 0");
        return media;
    }

    public void displayStarPattern() {
        int hz = 7, vert = 7;
        for (int contorHz = 1; contorHz <= hz; contorHz++) {
            for (int contorVert = vert; contorVert >= 1; contorVert--)
                System.out.print("*");
            System.out.println("\n");
            vert--;
        }

    }

    //--------------------------------------------------------------------
    // WHILE Functions

    public void displayListTo100W(int nb) {
        int contor = nb;
        if (nb > 100)
            System.out.println("Numarul este mai mare de 100");
        else if (nb < 0)
            System.out.println("Numarul este mai mic decat 0");
        else
            while (contor <= 100) {
                System.out.println("-> " + contor);
                contor++;
            }
    }

    public void displayListToMinus100W(int nb) {
        int contor = nb;
        if (nb < -100)
            System.out.println("Numarul este mai mic de -100");
        else
            while (contor >= -100) {
                System.out.println("-> " + contor);
                contor--;
            }
    }

    public void displayListFromLittleToBigW(int nbOne, int nbTwo) {
        int start = nbOne;
        int end = nbTwo;
        if (nbOne > nbTwo) {
            start = nbTwo;
            end = nbOne;
        }
        while (start <= end) {
            System.out.println("-> " + start);
            start++;
        }
    }

    public void displayNumerePare1to100W() {
        int contor = 1;
        do {
            if (contor % 2 == 0)
                System.out.println("-> " + contor);
            contor++;
        }
        while (contor <= 100);
    }

    public void displayNumereImpare1to100W() {
        int contor = 1;
        do {
            if (contor % 2 != 0)
                System.out.println("-> " + contor);
            contor++;
        }
        while (contor <= 100);
    }

    public void calculeInterval(int startNb, int endNb) {
        int suma = 0, countTemp = 0, count = 0;
        float media = 0;
        countTemp = startNb;

        while (countTemp <= endNb) {
            suma += countTemp;
            countTemp++;
        }
        count = countTemp - startNb;
        if (endNb != startNb)
            media = suma / count;
        System.out.println("In interval avem: " + count + " numere");
        System.out.println("Suma numerelor din interval este: " + suma);
        System.out.println("Media numerelor din interval este: " + media);
    }

    public void calculeIntervalDiv7(int startNb, int endNb) {
        int suma = 0, countTemp = 0, count = 0;
        float media = 0;
        countTemp = startNb;

        while (countTemp <= endNb) {
            if ((countTemp % 7) == 0) {
                suma += countTemp;
                System.out.println(" Numere divizibile cu 7 --- > " + countTemp);
                count++;
            }
            countTemp++;
        }

        if (endNb != startNb)
            media = suma / count;
        System.out.println("In interval avem: " + count + " numere");
        System.out.println("Suma numerelor din interval este: " + suma);
        System.out.println("Media numerelor din interval care sunt divizibile cu 7: " + media);
    }

    public void fibonacci(int nb) {
        int fibo1 = 0, fibo2 = 1, fibo3;
        int count = 2;
        System.out.println("Fibo number " + fibo1 + " is ---> " + fibo1);
        System.out.println("Fibo number " + fibo2 + " is ---> " + fibo2);
        while (count <= nb) {
            fibo3 = fibo1 + fibo2;
            System.out.println("Fibo number " + count + " is ---> " + fibo3);
            fibo1 = fibo2;
            fibo2 = fibo3;
            count++;
        }
    }

    public void CozaLozaWoza() {
        int count1 = 1, count2 = 1;
        int mod3, mod5, mod7;
        System.out.println("_____________________________");
        System.out.println("Afisare numere de la 1 la 110");
        while (count1 <= 110) {
            while (count2 <= 11) {
                mod3 = count1 % 3;
                mod5 = count1 % 5;
                mod7 = count1 % 7;
                if (mod3 == 0 && mod5 != 0 && mod7 != 0) System.out.print("Coza ");
                else if (mod3 == 0 && mod5 == 0 && mod7 != 0) System.out.print("CozaLoza ");
                else if (mod3 == 0 && mod5 == 0 && mod7 == 0) System.out.print("CozaLozaWoza ");
                else if (mod3 == 0 && mod5 != 0 && mod7 == 0) System.out.print("CozaWoza ");
                else if (mod3 != 0 && mod5 == 0 && mod7 != 0) System.out.print("Loza ");
                else if (mod3 != 0 && mod5 == 0 && mod7 == 0) System.out.print("WozaLoza ");
                else if (mod3 != 0 && mod5 != 0 && mod7 == 0) System.out.print("Woza ");
                else System.out.print(count1 + " ");
                count2++;
                count1++;
            }
            System.out.println("\n");
            count2 = 1;
        }
    }


}


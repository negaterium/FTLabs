package Lab3;

public class Calculator {
    private int firstNumber, secondNumber;
    private double result;
    private String operation;

    public Calculator() {
        // Empty constructor
    }

    public Calculator(int firstNumber, int secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public void mathOperation() {
        if (this.operation.equals("+"))
            result = this.firstNumber + this.secondNumber;
        if (this.operation.equals("-"))
            result = this.firstNumber - this.secondNumber;
        if (this.operation.equals("*"))
            result = this.firstNumber * this.secondNumber;
        if (this.operation.equals("/"))
            result = this.firstNumber / this.secondNumber;
        System.out.println("Rezultatul operatiei " + this.operation + " este : " + result);
    }

    public int adunare(int nbOne, int nbTwo) {
        return (nbOne + nbTwo);
    }

    public double adunare(double nbOne, double nbTwo) {
        return (nbOne + nbTwo);
    }

    public double adunare(double nbOne, double nbTwo, double nbTree) {
        return (nbOne + nbTwo + nbTree);
    }

    public int scadere(int nbOne, int nbTwo, int nbThree, int nbFour) {
        return (nbOne - nbTwo - nbThree - nbFour);
    }

    public double scadere(double nbOne, double nbTwo) {
        return (nbOne - nbTwo);
    }
    public int scadere(int nbOne, int nbTwo) {
        return (nbOne - nbTwo);
    }

    public double scadere(double nbOne, double nbTwo, double nbTree) {
        return (nbOne + nbTwo + nbTree);
    }

    public int inmultire(int nbOne, int nbTwo) {
        return (nbOne * nbTwo);
    }

    public double inmultire(double nbOne, double nbTwo) {
        return (nbOne * nbTwo);
    }

    public double inmultire(double nbOne, double nbTwo, double nbTree) {
        return (nbOne * nbTwo * nbTree);
    }

    public int impartire(int nbOne, int nbTwo, int nbThree, int nbFour) {
        return (nbOne / nbTwo / nbThree / nbFour);
    }

    public double impartire(double nbOne, double nbTwo) {
        try {
            return (nbOne / nbTwo);
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        return (0);
    }

    public float impartire(int nbOne, int nbTwo) {
        try {
            return (nbOne / nbTwo);
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        return (0);
    }
    public double impartire(double nbOne, double nbTwo, double nbTree) {
        try {
            return (nbOne / nbTwo / nbTree);
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        return (0);
    }
}
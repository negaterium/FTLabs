package Lab3;

public class Calculator {
    int firstNumber, secondNumber;
    double result;
    String operation;

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
}

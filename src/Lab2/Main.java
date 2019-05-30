package Lab2;

public class Main {

    public static void main(String[] args) {
         int a=printSomething(1,2);
        System.out.println(printSomething(123,234));
        System.out.println(a+a);
    }

    public static int printSomething(int arg1, int arg2) {
        int op = arg1*arg2;
        return(op);
    }



}

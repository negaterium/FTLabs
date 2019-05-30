package Lab2;

public class Main {

    public static void main(String[] args) {
         int a=printSomething(134,42);
        System.out.println(printSomething(123,234));
        System.out.println(a+a);
        stuff1(1,10);
        Dog cucu = new Dog();
        Dog boop = new Dog();
        cucu.name = "alabbala";
        cucu.eat();
        cucu.name();
        boop.name();

    }

    public static int printSomething(int arg1, int arg2) {
        int op = arg1*arg2;
        return(op);
    }

    public static void stuff1(int start, int end){
        for(int counter=start;counter<=end;counter++)
        {
            System.out.println(counter*counter);
        }
    }


}

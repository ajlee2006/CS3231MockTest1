import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        menu();
    }

    public static int getFibonacci(int n){
        if (n == 1) return 1;
        if (n == 2) return 1;
        int a=1, b=1, f=2;
        for (int i=3; i<=n; i++) {
            f = a+b;
            a = b;
            b = f;
        } return f;
    }
    
    public static void dispFibonacci(int n){
        for (int i=1; i<=n; i++) {
            System.out.printf("%-5d", getFibonacci(i));
            if (i%8 == 0 && i!=n){
                System.out.println();
            }
        } System.out.println();
    }

    public static double goldenRatio(int n){
        return 1.0*getFibonacci(n+1)/getFibonacci(n);
    }

    public static void menu(){
        int inp = 1;
        Scanner s = new Scanner(System.in);
        while (inp == 1 || inp == 2 || inp == 3) {
            System.out.print("Select one of the options below:\n" +
                    "Option 1: Find nth Fibonacci number\n" +
                    "Option 2: Display first n Fibonacci number\n" +
                    "Option 3: Find nth order approximation to Golden Ratio\n" +
                    "Select an option (1, 2, 3): ");
            try {
                inp = s.nextInt();
                if (inp == 1) {
                    System.out.print("Enter n: ");
                    int n = s.nextInt();
                    System.out.println("The nth number in the Fibonacci Sequence is " + getFibonacci(n));
                } else if (inp == 2) {
                    System.out.print("Enter n: ");
                    int n = s.nextInt();
                    dispFibonacci(n);
                } else if (inp == 3) {
                    System.out.print("Enter n: ");
                    int n = s.nextInt();
                    System.out.println("The nth order approximation of the Golden Ratio is " + goldenRatio(n));
                } else {
                    System.out.println("Goodbye! Have a nice day.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Enter only an integer!");
                inp = 0;
            }
        }
    }
}

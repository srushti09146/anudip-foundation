import java.util.Scanner;

public class hell{

    int add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    int addition(int a, int b) {
        return a + b;
    }

    int product(int a,int b){
        return a*b;
    }

    hell() {
        System.out.println("Constructor called");

    }

    public static void main(String[] args) {
        hell h = new hell();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = h.addition(a, b);
        int product = h.product(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The product of " + a + " and " + b + " is: " + product);
        sc.close();
    }

}

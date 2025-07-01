
public class typecasting {

    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
    }

    public static void main(String[] args) {

        double a = 20;
        int b = (int)a;
        System.out.println(a);
        System.out.println(b);

        int c=10;
        double d =c;
        System.out.println(c);
        System.out.println(d);

    }
}
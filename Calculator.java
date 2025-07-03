
public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

  
    public int add(int a, int b, int c) {
        return a + b + c;
    }

  
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 5 and 10 (int): " + calc.add(5, 10));
        System.out.println("Sum of 3, 6, and 9 (int): " + calc.add(3, 6, 9));
        System.out.println("Sum of 2.5 and 4.3 (double): " + calc.add(2.5, 4.3));
    }
}

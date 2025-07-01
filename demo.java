import java.util.Scanner;

class demo {
    public void fun() {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("this is output " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}

    
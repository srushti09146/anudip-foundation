import java.util.Scanner;

public class ArmstrongInRange {

    // Method to print all Armstrong numbers in a given range
    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sum = 0;

            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;

                // Calculate cube of digit using loop
                int cube = 1;
                for (int i = 0; i < 3; i++) {
                    cube *= digit;
                }

                sum += cube;
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        printArmstrongNumber(start, end);
    }
}
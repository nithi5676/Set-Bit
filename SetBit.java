package setBit;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int number_1 = scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int number_2 = scanner.nextInt();
        scanner.close();
        System.out.println(count(number_1, number_2));

    }

    private static int count(int number_1, int number_2) {
        int count = 0;
        count = count | 1 << number_1;
        count = count | 1 << number_2;
        return count;

    }

}

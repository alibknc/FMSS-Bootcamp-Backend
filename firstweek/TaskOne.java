package firstweek;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int sum = getDigitsSum(getNumber());

        System.out.printf("Sum of digits: %d", sum);
    }

    public static int getDigitsSum(int num) {
        if (num == 0)
            return 0;

        int lastDigit = num % 10;

        return lastDigit + getDigitsSum(num / 10);
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return Integer.parseInt(scanner.nextLine());
    }
}

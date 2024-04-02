package BasicApporach;

import java.util.Scanner;

public class CountDigitFrequency {
    public static int calDigitFre(int digit, int num) {
        if (digit == 0 && num == 0)
            return 1;
        num = Math.abs(num);
        int counter = 0;
        while (num != 0) {
            int d = num % 10;
            if (d == digit)
                counter++;
            num = num / 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit to check its repetation: ");
        int digit = sc.nextInt();
        int count = calDigitFre(digit, num);
        System.out.print(digit + " entered in " + num + " is: " + count + " times");
    }
}

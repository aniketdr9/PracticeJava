package BasicApporach;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        System.out.println("Digit count in " + num + " is: " + countNumberDigit(num));
    }

    public static int countNumberDigit(long num) {
        int res = 0;
        num = Math.abs(num);
        if (num == 0)
            return 1;
        while (num != 0) {
            num = num / 10;
            res++;
        }
        return res;
    }
}

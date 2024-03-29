package BasicApporach;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Digit count in "+num+ " is: "+countNumberDigit(num));
    }

    public static int countNumberDigit(int num){
        int res = 0;
        if(num == 0)
            return 1;
        if(num < 0)
            res = 0;
        while(num != 0){
            num = num/10;
            res++;
        }
        return res;
    }
}

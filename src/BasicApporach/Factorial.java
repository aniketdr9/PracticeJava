package BasicApporach;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter a number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+ " is: "+findFactorial(num));
    }

    public static int findFactorial(int num){
        int fact = 1;
        for(int i = 1;i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}

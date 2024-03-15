package BasicApporach;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        int count = 0;
        System.out.print("Give a number to print fibonacci series till: " +count);
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        printFibonacci(count);
    }

    public static int printFibonacci(int count){
    int n1 = 0, n2 = 1, n3;
    System.out.print(n1+ " " +n2);
    for(int i =2; i<=count;i++){
        n3 = n1 +n2;
        System.out.print(" " +n3);
        n1 = n2;
        n2 = n3;
    }
    return 0;
    }
}

package BasicApporach;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for an array: ");
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        System.out.println("Enter " +arrLen+ " elements into the array.");
        for(int i =0; i< arrLen; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0; i< arrLen; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("There is no second largest number in the array");
        } else {
            System.out.println("Second laregest element in array: "+secondMax);
        }
    }
}


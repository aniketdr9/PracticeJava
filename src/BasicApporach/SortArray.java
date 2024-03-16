package BasicApporach;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        System.out.println("Enter the size for an array: ");
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        System.out.println("Array size is: "+arrlen);
        System.out.println("Enter the numbers into array: ");
        for(int i =0; i< arrlen; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements in the array:[");
        for (int i =0; i<arrlen; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
        sortArray(arr);
    }

    private static int[] sortArray(int[] arr){
        System.out.print("Sorted Array: [");
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(" " +arr[i]);
        }
        System.out.print("]");
        return arr;
    }
}

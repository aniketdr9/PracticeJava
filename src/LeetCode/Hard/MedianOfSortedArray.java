package LeetCode.Hard;

import java.util.Scanner;

public class MedianOfSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first Array: ");
        int first_size = sc.nextInt();
        int[] firstArr = new int[first_size];
        for(int i=0; i< first_size; i++){
            System.out.print("Enter "+(i +1)+ " element: ");
            firstArr[i] = sc.nextInt();
        }
        System.out.print("Enter size of second Array: ");
        int second_size = sc.nextInt();
        int[] secondArr = new int[second_size];
        for(int j=0; j< second_size; j++){
            System.out.print("Enter "+(j +1)+ " element: ");
            secondArr[j] = sc.nextInt();
        }
        System.out.print("Median is: "+findMedian(firstArr, secondArr));
    }

    public static double findMedian(int[] firstArr, int[] secondArr){
//        public double findMedianSortedArrays(int[] firstArr, int[] secondArr) {
            int first_size = firstArr.length;
            int second_size = secondArr.length;
            int a[] = new int[first_size + second_size];
            int i=0,j=0,k=0;
            while(i<first_size && j<second_size){
                if(firstArr[i] < secondArr[j]){
                    a[k] = firstArr[i];
                    i++;
                } else {
                    a[k] = secondArr[j];
                    j++;
                }
                k++;
            }
            while(i < first_size){
                a[k] = firstArr[i];
                i++;
                k++;
            }
            while(j < second_size){
                a[k] = secondArr[j];
                j++;
                k++;
            } if((first_size + second_size) % 2 != 0){
                return a[(first_size + second_size)/2];
            } else {
                int x =(first_size + second_size)/2;
                double p= a[x];
                double q= a[x-1];
                return (p+q)/2;
            }
        }
    }

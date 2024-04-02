package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("All possible subset: " + subsets(arr));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private static void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) {
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);
            backtrack(resultSets, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
}

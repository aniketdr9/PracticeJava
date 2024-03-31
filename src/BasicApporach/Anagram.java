package BasicApporach;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2){
        str1 = str1.replaceAll("/S", "").toLowerCase();
        str2 = str2.replaceAll("/S", "").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (checkAnagram(str1, str2)){
            System.out.print(str1+ " and "+str2+ " are anagram");
        } else {
            System.out.print(str1+ " and "+str2+ " are not anagram");
        }
    }
}

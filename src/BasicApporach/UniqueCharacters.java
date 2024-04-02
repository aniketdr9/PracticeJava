package BasicApporach;

import java.util.Scanner;

public class UniqueCharacters {

    public static String printUniqueChar(String inputString) {
        int arr[] = new int[512];
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            arr[ch - 'a'] = arr[ch - 'a'] + 1;
        }
        String str = "";
        for (int i = 0; i < 256; i++) {
            if (arr[i] == 1) {
                str = str + ((char) (i + 'a'));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String s = printUniqueChar(str);
        if (s.length() == 0) {
            System.out.print("There is not unique character in " + str);
        } else {
            System.out.print("Unique characters in " + str + " are: ");
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}

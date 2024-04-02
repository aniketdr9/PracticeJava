package BasicApporach;

import java.util.Locale;
import java.util.Scanner;

public class RepeatedCharacters {
    public static String findRepeatedCharacters(String inputString) {
        inputString = inputString.toLowerCase(Locale.ROOT);
        int[] charFreq = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                charFreq[ch]++;
            }
        }

        System.out.print("Repeated characters in String: ");
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] > 1 && Character.isLetter((char) i)) {
                System.out.println((char) i + " - " + charFreq[i] + " times.");
            }
        }
        return inputString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        findRepeatedCharacters(str);
    }
}

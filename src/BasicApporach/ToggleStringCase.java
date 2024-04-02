package BasicApporach;

import java.util.Scanner;

public class ToggleStringCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to Toggle its case: ");
        String str = sc.nextLine();
        System.out.print(str + " is toggled to " + toggleCase(str));
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder("");
        String answer = null;
        if (str.length() == 0) {
            System.err.print("Please enter a valid string");
        } else {
            for (int i = 0; i < str.length(); i++) {
                char chr = str.charAt(i);
                if (chr >= 'A' && chr <= 'Z') {
                    result.append((char) (chr + 32));
                } else if (chr >= 'a' && chr <= 'z') {
                    result.append((char) (chr - 32));
                } else {
                    result.append(chr);
                }
            }
            answer = result.toString();
        }
        return answer;
    }
}

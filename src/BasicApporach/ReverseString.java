package BasicApporach;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        System.out.println("Reversed String: "+reverse(str));
    }

    public static String reverse(String str){
        if(str == null){
            System.out.println("No string is available");
        }
        StringBuilder sb = new StringBuilder();
        char[] strChar = str.toCharArray();
        for(int i = strChar.length -1; i >= 0; i--){
            sb.append(strChar[i]);
        }
        return sb.toString();
    }
}

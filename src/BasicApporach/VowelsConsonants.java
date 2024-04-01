package BasicApporach;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if(str.length() == 0){
            System.out.print("Provide a valid string");
        }
        int vowel =0;
        int consonants =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel++;
             else
                consonants++;
        }
        System.out.print("There are "+vowel+ " vowels & "+consonants+ " consonants in "+str);
    }
}

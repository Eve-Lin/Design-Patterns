package adapter;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String word) {
          String reversedWord = "";
          boolean isPalindrome = false;
        for(int i=word.length()-1; i >=0; i--){
            reversedWord = reversedWord + word.charAt(i);
        }

        if(reversedWord.equal(word)){
            isPalindrome = true;
        }
        return isPalindrome;

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(Main.isPalindrome(word));
    }
}
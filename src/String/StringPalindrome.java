package String;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        String olstr = "", rev = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        olstr = str;


        for (int i = (str.length()) - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println("Reverse of a string is :" + rev);

        if (olstr.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }


}

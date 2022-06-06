package Testing;

import javax.swing.*;
import java.util.Arrays;

public class CountCharacterInAString {

    public static void main(String[] args) {

        int wordCount = 0;
        String word = "hillhhiilllsdsjkbd";
        for (char letter = 'a'; letter <= 'z'; letter++)  {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(letter + "=" + wordCount);
                wordCount = 0;
            }
        }

    }

}

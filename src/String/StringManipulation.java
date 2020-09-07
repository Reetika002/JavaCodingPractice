package String;

import java.util.*;
//Given a string str, a character ch and a value N, the task is to find the index of Nth occurrence
// of the given character in the given string. Print -1 if no such occurrence exists.

class StringManipulation
{


    // Function to find the
// Nth occurrence of a character 
    static int findNthOccur(String str,
                            char ch, int N)
    {
        int occur = 0;

        // Loop to find the Nth
        // occurence of the character
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                occur += 1;
            }
            if (occur == N)
                return i;
        }
        return -1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        char ch = 'e';
        int N = 2;
        System.out.print(findNthOccur(str, ch, N));
    }
} 
package Testing;

import java.util.Arrays;

public class AngramString {

    //Two strings are called anagrams if they contain same set of characters but in different order.
    // For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.

    public  static  void  IsAnagram (String s1 , String s2)
    {
        String cs1 = s1.replaceAll("\\s+","");
        String cs2 = s2.replaceAll("\\s","");

        boolean status = true;

        if(cs1.length() !=  cs2.length())
        {
            status = false;
        }

        else
        {
            //converting into one case and chracter array
            char[] array1 = cs1.toLowerCase().toCharArray();
            char[] array2 = cs2.toLowerCase().toCharArray();

            //sort the two arrays
            Arrays.sort(array1);
            Arrays.sort(array2);

            status = Arrays.equals(array1,array2);

        }

        if(status)
        {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not anagrams");
        }
    }

    public static void main(String[] args) {
        IsAnagram("peek","keep");
        IsAnagram("dnfdf","DFGFHFH");
    }
}

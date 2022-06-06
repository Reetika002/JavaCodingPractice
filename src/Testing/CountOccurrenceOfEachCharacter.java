package Testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurrenceOfEachCharacter {

    public static  void characterCount(String inputString)
    {
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //converting the given string into character array

        char[] strArray = inputString.toCharArray();

        for (char character : strArray)
        {
            //checking each character of strArray

            if(charCountMap.containsKey(character))
            {
                charCountMap.put(character,charCountMap.get(character)+1);
            }
            else {
                charCountMap.put(character,1);
            }

        }

        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();

        for (Map.Entry<Character,Integer> entry : entrySet)
        {

                System.out.println(entry.getKey() +":"+ entry.getValue());
                if (entry.getValue() > 1)
                {
//                    charCountMap.remove(entry.getKey());
                    System.out.println(entry.getKey()+":"+ entry.getValue());
                }


        }

    }

    public static void main(String[] args) {
        characterCount("reetika");
//        characterCount("shashank");
    }
}

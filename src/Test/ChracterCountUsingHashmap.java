package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChracterCountUsingHashmap {

    public static void characterCount(String str)
    {

        Map<Character,Integer> storemap = new HashMap<>();
        char[] ch = str.toCharArray();

        for(char c : ch) {
            if (!storemap.containsKey(c)) {

                storemap.put(c,1);

            }

            else {

                storemap.put(c,storemap.get(c)+1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet = storemap.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet)
        {

            System.out.println(entry.getKey() +" "+ entry.getValue());



            if(entry.getValue() ==1)
            {
                System.out.println("all non repeated characters are :" +entry.getKey());
            }

        }
        //            first non repeated
        Map.Entry<Character,Integer> entry = storemap.entrySet().iterator().next();
        if(entry.getValue() ==1)
        {
            System.out.println("first non repeated characters are :" +entry.getKey());
        }



    }

    public static void main(String[] args) {

        characterCount("reetika");
    }
}

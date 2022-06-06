package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnagramStringUsingHashmap {

    public static void main(String[] args) {

        //Take Two hashmaps
        //Complexity O(n)
        System.out.println(isAnagram("peek","keep"));
        System.out.println(isAnagram("abc","smnd"));


    }
        public static boolean  isAnagram(String str1, String str2)
        {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

            for (Character ch : char1)
            {
                if(map1.containsKey(ch))
                {

                    map1.put(ch,map1.get(ch) + 1);

                }

                else {

                    map1.put(ch,1);
                }

            }

            for(Character ch: char2)
            {

                if(map2.containsKey(ch))
                {

                    map2.put(ch,map2.get(ch) + 1);

                }

                else {

                    map2.put(ch,1);
                }
            }

           return map1.equals(map2);
        }

    }


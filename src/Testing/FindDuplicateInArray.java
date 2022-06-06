package Testing;

import java.util.*;

public class FindDuplicateInArray {

    public static void main(String[] args) {

        String[] names = {"ddf", "Java", "Python", "C", "Ruby", "Java", "Python", "Perl"};

        //using hashset
        Set<String> store = new HashSet<String>();
        for(String name : names)
        {
            if(store.add(name) == false)
            {
                System.out.println("Duplicate in array are:" +name);
            }
        }

       // using hashmap
        Map<String,Integer> storeMap = new HashMap<String, Integer>();
        for(String name : names)
        {
            Integer count = storeMap.get(name);
            if(count == null)
                storeMap.put(name,1);
            else
                storeMap.put(name, ++count);
        }

        Set<Map.Entry<String,Integer>> entrySet = storeMap.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("duplicate elements are:" +entry.getKey()+ "Count is:" +entry.getValue());
            }
        }

        }



    }




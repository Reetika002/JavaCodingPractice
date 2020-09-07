package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInArray {

    public static void main(String[] args) {

        String[] names = {"ddf", "Java", "Python", "C", "Ruby", "Java", "Python", "Perl"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate elements are :" + names[i] + " " + i);
                }
            }

        }

        // using Hashset -- store unique values

        Set<String> store = new HashSet<String>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("Duplicate elements are:" + name);
            }

        }

        // using Hashmap --keyValue pair

        Map<String,Integer> storeMap = new HashMap<String, Integer>();
        for(String name : names)
        {
            Integer count = storeMap.get(name);
            if(count == null)
            {
                storeMap.put(name,1);
            }
            else {
                storeMap.put(name, ++count);
            }
        }

        //get the value from hashmap

        Set<Map.Entry<String,Integer>> entrySet = storeMap.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate elements are" +entry.getKey());
            }
        }


    }
}

package JavaBasics.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_ietrate {

    public static void main(String[] args) {

        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        storeMap.put("abc", 100);
        storeMap.put("abcd", 200);
        storeMap.put("abce", 300);
        storeMap.put("abcf", 400);
        storeMap.put("abcg", 500);
        storeMap.put("abch", 600);

        System.out.println(storeMap.get("abc"));

        for(Map.Entry<String, Integer> m : storeMap.entrySet())
        {
            System.out.println(m.getKey() + " "+ m.getValue());


        }
    }
}

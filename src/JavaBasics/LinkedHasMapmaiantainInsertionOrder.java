package JavaBasics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapmaiantainInsertionOrder {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("01","aa");
        map.put("03","bb");
        map.put("04","cc");
        map.put("02","dd");

        Set<Map.Entry<String ,String >> entrySet =  map.entrySet();

        for(Map.Entry<String,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());

        }
    }
}

//o/p:
//        01 aa
//        02 dd
//        03 bb
//        04 cc

//**************************************************************************************/
//When elements get from the HashMap due to hashing the order they inserted is not maintained while retrieval. We can achieve the given task using LinkedHashMap.
// The LinkedHashMap class implements a doubly-linked list so that it can traverse through all the elements.
class LinkedHasMapmaiantainInsertionOrder1 {

    public static void main(String[] args) {

        HashMap<String,String> map = new LinkedHashMap<>();
        map.put("01","aa");
        map.put("03","bb");
        map.put("04","cc");
        map.put("02","dd");

        Set<Map.Entry<String ,String >> entrySet =  map.entrySet();

        for(Map.Entry<String,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());

        }
    }
}

////output
//        01 aa
//        03 bb
//        04 cc
//        02 dd
package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueElementsInArray {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,1,2,3,5,6,7,5,6};

        HashMap<Integer,Integer> storeMap = new HashMap<>();

        for(int a : arr)
        {
            Integer count = storeMap.get(a);
            if(count == null)
            {
                storeMap.put(a,1);
            }
            else {
                storeMap.put(a,++count);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = storeMap.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet)
        {
            if(entry.getValue() == 1)
            {
                System.out.println("Unique elements are :"+entry.getKey());
            }
        }

    }
}

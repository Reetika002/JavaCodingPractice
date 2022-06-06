package JavaBasics.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap_Practice {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"ab");
        map.put(2,"ab");
        map.put(3,"ab");
        map.put(null,"6");

        System.out.println(map);

       //hashing -- ObjectClass method hashcode()
        // override the hashcode() method

        /*

        public V put (K key, V Value){
        int hash = hashcode(key)
        index = hash & (n-1)
        n = 16 map size
        }
         */

        /*

        use of get (uses .equals method to match the key)
        */

        //hashcode of null is always zero (index=0)
    }
}

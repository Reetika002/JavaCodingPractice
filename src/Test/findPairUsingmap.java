package Test;

import java.util.HashMap;

public class findPairUsingmap {
    public static void main(String[] args) {

        int a[] = {1,4,5,6,3,7,2,5,8,10}, sum=7;
        findPairMap(a,sum);
    }

    public static void findPairMap(int[] a, int sum){

        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;

        for(int i = 0; i <a.length; i++)
        {
            int temp = sum - a[i];

            if(map.containsKey(temp))
            {
                count += map.get(temp);
                System.out.println("Pairs are :"+ a[i]+"," +temp);

            }

            if (map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }

            else {

                map.put(a[i], 1);
            }
        }
        System.out.println("Pairs count:" +count);


    }
}

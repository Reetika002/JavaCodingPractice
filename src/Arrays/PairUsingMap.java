package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class PairUsingMap {


    public static void main(String[] args) {
        int[] a = { 1, 5, 7, -1, 5 };
        int sum = 6;
//        printpairs(a, sum);
        printPairsusingMap(a,sum);
    }

    /*
    * Time Complexity: O(n).
As the whole array is needed to be traversed only once.
Auxiliary Space: O(n).
A hash map has been used to store array elements.*/

     static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }


    static void printPairsusingMap(int a[], int sum)
    {
        //{ 1, 5, 7, -1, 5,1,1,3,3} // sum = 6
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0; i <a.length-1; i++) {
            int temp = sum - a[i];


            if (map.containsKey(temp)) {
                count += map.get(temp);
                System.out.println(a[i]+","+temp);
            }

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {

                map.put(a[i], 1);

            }

        }

//
            System.out.println(count);


        }





    }





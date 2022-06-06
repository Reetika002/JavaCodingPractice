package Arrays;

import java.util.HashSet;

public class PairWithSumUsingMap {

    public static void main(String[] args) {
        int[] a = { 1, -4, 45, 6, 10, 8,-12 };
        int sum = 16;
        pairWithoutMap(a, sum);
    }

    public static void pairWithoutMap(int a[], int sum){

        for(int i =0; i < a.length; i++)
        {
            for(int j=i+1; j <a.length; j++)
            {
                if(a[i] + a[j] == sum)
                {
                    System.out.println("Pairs are:"+a[i]+","+a[j]);
                }
            }
        }
    }


}

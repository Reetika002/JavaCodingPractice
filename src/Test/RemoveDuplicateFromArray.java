package Test;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
//        int[] a = {2,4,5,6,1,2,3,5,6};
        int [] a = {2,2,2,2,2,2};
        int [] res = new int[]{};
        int i, j;
        int n = a.length;
        for(i=0; i <n; i++)
        {
            for(j=0;j <n;j++)
            {
                if(a[i] == a[j] && i != j)
                {
                 res = remove(a,j);
                 n=n-1;
                }
            }

        }
        for(i = 0; i < n; i++ )
        {
            System.out.println(res[i]);
        }


    }

    public static int[] remove(int[] a, int index)
    {
        for(int i=0; i <a.length; i++)
        {
            if (i == index)
            {
                for(int j = i; j <a.length-1; j++)
                {
                    a[j] = a[j+1];

                }

            }

        }
        return a;
    }
}

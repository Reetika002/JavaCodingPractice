package Testing;

import java.util.Arrays;

public class FindUniqueElementInArray {

    public static void main(String[] args) {
        int[] a = {2,4,5,6,2,3,4,5,6,7,2,8};

        int i ,j;
        boolean unique = false;

        for(i=0; i<a.length;i++)
        {
            unique = true;
            for (j=1;j<a.length;j++)
            {
                if(a[i] == a[j] && i!=j) {
                    unique = false;
                    break;

                }

                else {
                    unique = true;
                }
            }
            if(unique)
                System.out.println(a[i]);

        }



    }
}

package Arrays;

import java.util.Arrays;

public class PrintDuplicateWithFrequency {


//    {-1,5,4,2,3,2,2,4,3,2}
//{-1,2,2,2,2,3,3,4,4,5}

    public static void main(String[] args) {

        int[] a = new int[]{2,2,2,2,3,3,4,4,5};
        int count =1;
//        int repeatedElementCount=0;
        Arrays.sort(a);
        int i;
//        boolean flag ;


        for (i =0; i <a.length-1; i++)
        {
            if(a[i] == a[i+1])
            {
                count++;

            }

            else {
//                repeatedElementCount++;
                System.out.println(a[i]+"repeated" +count);
                count = 1;

            }

        }
//        System.out.println(repeatedElementCount);



    }
}

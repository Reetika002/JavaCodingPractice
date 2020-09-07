package Testing;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6};
        System.out.println("Enter the number of rotation");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

//        int[] result = leftRotate(arr,r);
//        for(int i = 0; i < arr.length; i++)
//        {
//            System.out.println(result[i]);
//        }
        int[] resultr = rightRotate(arr,r);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(resultr[i]);
        }
    }

//    static int[] leftRotate(int[] arr,int r)
//    {
//        int i,j,temp;
//        for (i=0; i < r; i++)
//        {
//            temp = arr[0];
//            for (j=0;j<arr.length-1;j++)
//            {
//                arr[j] = arr[j+1];
//            }
//
//            arr[arr.length-1] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }

    public static int[] rightRotate(int[] arr, int r)
    {
        int i, j;
        for(i=0; i<r; i++)
        {
            int temp = arr[arr.length-1];

            for(j=(arr.length -1) ; j > 0 ; j--)
            {
                arr[j] = arr[j-1];


            }

            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

package Testing;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateOfAnArray {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++)
        {
            Scanner sca = new Scanner(System.in);
            arr[i] = sca.nextInt();
        }
        System.out.println("Enter the number of rotations");
        Scanner scr = new Scanner(System.in);
        int r = scr.nextInt();
        int[] result =LeftRotate(arr, r);

        for (int i =0; i < n ; i++)
        {
            System.out.println(result[i]);
        }


    }

    public static int []  LeftRotate(int[] arr, int r)
    {
        int j;
        for(int i = 0 ; i < r; i ++ )
        {
            int temp = arr[0];

            for(j=0;j <arr.length-1; j++)
            {
                arr[j] = arr[j+1];

            }
            arr[arr.length -1] = temp;

        }

        System.out.println(Arrays.toString(arr));

    return arr;
    }


}

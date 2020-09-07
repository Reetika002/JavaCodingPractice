package Testing;

import java.util.Scanner;

public class RightRotateOfArray {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++)
        {
            Scanner sca = new Scanner(System.in);
            arr[i] = sca.nextInt();
        }
        System.out.println("Enter the number of rotations");
        Scanner scr = new Scanner(System.in);
        int r = scr.nextInt();
        int[] result = RightRotate(arr, r);

        for (int i =0; i < n ; i++)
        {
            System.out.println(result[i]);
        }


    }

    public static int[] RightRotate(int[] arr, int r)
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

        return arr;
    }
}


























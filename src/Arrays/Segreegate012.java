package Arrays;

import java.util.Arrays;

public class Segreegate012 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 2, 1};

        int  low=0, mid=0, high=arr.length-1;

        while (mid <= high) {
            if (arr[mid] == 0)
            {
                swap(arr,low,mid);
                low++;
                mid++;

            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;

            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int a[], int i, int j)
    {

        int t=a[i];
        a[i] = a[j];
        a[j] = t;

    }
}

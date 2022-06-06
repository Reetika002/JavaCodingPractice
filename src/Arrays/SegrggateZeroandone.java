package Arrays;

import java.util.Arrays;

public class SegrggateZeroandone {

    static void seggregateZeroandOne(int[] arr) {
        int count = 0, i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }

        }

        for (i = 0; i < count; i++) {
            arr[i] = 0;
        }

        for (i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println("After segreggation array:");
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1};
        seggregateZeroandOne(arr);

        // using 2 method
//        int[] A = { 0, 1, 1, 0, 1, 0, 1, 1, 0 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        Arrays.fill(arr, arr.length - sum, arr.length, 1);
        Arrays.fill(arr, 0, arr.length - sum, 0);

        System.out.println(Arrays.toString(arr));

    }
}

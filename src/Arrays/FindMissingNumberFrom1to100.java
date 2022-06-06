package Arrays;

import java.util.Scanner;

public class FindMissingNumberFrom1to100 {

    public static void main(String[] args) {

        int sum=0,expectedsum=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n where you want to find missing number from 1 to n");
//        int n = sc.nextInt();
//        int[] inputArray = new int[n];
//        System.out.println("Enter " +Integer.toString(n-1)+ " numbers");
//        for (int i = 0; i < n-1; i++)
//        {
//            inputArray[i] = sc.nextInt();
//            sum = sum + inputArray[i];
//        }
//        System.out.println("Actual Sum" +sum);
//
//        expectedsum = n*(n+1)/2;
//
//        System.out.println("Missing number is:"+(expectedsum-sum));
//

     //   *********************************************************************
        int[] ar = {1,2,3,5,6,7,8,9,10};
        int n =10;
        for(int i = 0; i <=ar.length-1; i++)
        {
            sum = sum +ar[i];
        }
        expectedsum = n*(n+1)/2;

        System.out.println("Missing number is:"+(expectedsum-sum));

    }
}

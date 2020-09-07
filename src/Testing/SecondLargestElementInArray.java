package Testing;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i,largest = arr[0], slargest = arr[1];
        System.out.println("Enter the values");
        for(i=0;i < n; i++){

            Scanner inputArr = new Scanner(System.in);
            arr[i] = inputArr.nextInt();
        }

        for (i =0; i < n; i++)
        {
            if(arr[i] > largest)
            {
                 slargest = largest;
                 largest = arr[i];

            }
            else if(arr[i] > slargest && arr[i] <largest)
            {
                slargest = arr[i];
            }
        }

        System.out.println("Largest is:" +largest);
        System.out.println("Second Largest is:" +slargest);






    }
}

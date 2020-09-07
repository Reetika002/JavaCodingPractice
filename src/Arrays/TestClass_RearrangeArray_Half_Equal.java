package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass_RearrangeArray_Half_Equal {
    public static void main(String[] args) {
        boolean flag=false;

//        Scanner sct = new Scanner(System.in);
//        System.out.println("Enter the number of testcases");
//        int t = sct.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in an array");
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Enter the values");
        for (int i =0; i <n;i++)
        {
            Scanner scvalues = new Scanner(System.in);
            inputArray[i] = scvalues.nextInt();

        }
        System.out.println(Arrays.toString(inputArray));

        if(n%2 == 0)
        {

            for (int i =0; i < n-1; i+=2)
            {

                System.out.println(i);
                Arrays.sort(inputArray);
                if(inputArray[i] == inputArray[i+1])
                {
                    flag = true;
                }
//                else {
//                    flag = false;
//                }

            }
            System.out.println(Arrays.toString(inputArray));
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        else
        {
            System.out.println("Number of elements in an array should be even");
        }


    }
}

package Testing;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }

    static int factorial(int num)
    {
        int fact = 1;

        if (num == 0)
            return 1;

        for(int i =1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is " +fact);

        return fact;
    }

    // Recursive Function
    static int fact(int num)
    {
        if(num ==0)
            return 1;
        else
            return (num * fact(num-1));
    }
}

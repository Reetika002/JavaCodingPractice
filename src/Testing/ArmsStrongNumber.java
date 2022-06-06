package Testing;

import java.util.Scanner;

public class ArmsStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, sum=0;
        int b = 0;
        b = n;
        //153 = 1^3 + 5^3 + 3^3

        while(n > 0)
        {
            a= n%10;
            sum  = sum + a *a *a ;
            n = n/10;


        }
        if(b == sum) {
            System.out.println("armstrong");
        }
        else {
            System.out.println("not armstong");
        }

    }
}

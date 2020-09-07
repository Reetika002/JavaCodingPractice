package Arrays;

public class ReverseOfANumber {

    public static void main(String[] args) {
        int num = 12345;
        int rev=0;

        while(num!=0)
        {
            rev = rev * 10 + num%10;
            num = num /10;


        }

        System.out.println("Reverse of a number :" +rev);


        // using StringBuffer
        long num1 = 12323424;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}

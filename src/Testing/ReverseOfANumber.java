package Testing;

public class ReverseOfANumber {

    public static void main(String[] args) {

        int n = 1234;
        int a,rev=0;
        while (n>0) {
            a = n % 10;
            rev = rev * 10 + a;
            n = n / 10;
        }
        System.out.println("Reverse of a number:"+rev);


    }


}

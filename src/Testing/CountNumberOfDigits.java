package Testing;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        int sum =0;
        int num = 56565;

        while (num > 0)
        {
            sum = sum + num % 10;
            num = num /10;

        }

        System.out.println("Sum of digits are " +sum);

    }
}

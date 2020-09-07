package Arrays;

public class PrimeNumber {

    public  static  boolean IsPrimeNumber(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(IsPrimeNumber(4));
        System.out.println(IsPrimeNumber(7));
    }
}

package Arrays;

public class PrimeNumber {

    public  static  boolean IsPrimeNumber(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for (int i = 2; i < num; i++) // can also write for(int i =2; i <=Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(IsPrimeNumber(9));
        System.out.println(IsPrimeNumber(2));
    }
}

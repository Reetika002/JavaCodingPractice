package Arrays;

public class FindAllPairsEqualToGivenSumInArray {

    public static void main(String[] args) {
//        Sort the array first
        int[] a = {1,2,3,4,5,6,7};
        int givenSum = 10;

        int l = 0;
        int r = a.length-1;

        while (l<r)
        {
            if(a[l] + a[r] > givenSum)
            {
                r--;
            }

            else if(a[l] + a[r] < givenSum)
            {
                l++;
            }
            else
            {
                System.out.println("Pairs are" + "("+a[l]+ "," +a[r]+")");
                System.out.println(+l +"   "+r);
                l++;
                r--;

            }
        }
    }
}

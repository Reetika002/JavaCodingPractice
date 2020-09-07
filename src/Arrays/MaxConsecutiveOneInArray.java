package Arrays;

public class MaxConsecutiveOneInArray {

    static void maxConsecutiveOne(int[] arr)
    {
        int count =0;
        int maxConsecutive = 0;

        for (int i =0; i<arr.length; i++)
        {
            if(arr[i] == 1) {
                count++;
                maxConsecutive = Math.max(count, maxConsecutive);
            }
            else {
                count =0;
            }
        }
        System.out.println("Max consecutive one's are : " +maxConsecutive);
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,0};
        maxConsecutiveOne(arr);
    }
}

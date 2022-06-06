package Arrays;

public class FindGreaterValuesOnRightSideInArray {

    public static void main(String[] args) {
//        int[] arr = {4,5,2,7,8,4,5,9,2};
        int[] arr = {10, 4, 6, 3, 5};

        int max_value = Integer.MIN_VALUE;

        for(int i = arr.length-1; i >=0; i--)
        {
            if(arr[i] >= max_value)
            {
                max_value = arr[i];
                System.out.println(arr[i]);
            }

        }

    }


}

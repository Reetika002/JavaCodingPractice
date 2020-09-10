package Arrays;

public class RemoveDuplicateElementInArray {

    public static void main(String[] args) {

        int[] arr = {1,8,8,9,2,2,3,3,4,5,5,6,7,7};

        int n = arr.length;
        n= removeDuplicates(arr,n);
        for(int i=0; i <n; i++)
        {
            System.out.println(arr[i]);
        }
    }

    static int removeDuplicates(int arr[],int n)
    {
        if(n==0 || n==1)
            return n;

// store index of next unique element
        int j=0;

        for(int i=0; i <n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++] = arr[i];

            }

        }
       arr[j++] = arr[n-1];
        return j;


    }
}

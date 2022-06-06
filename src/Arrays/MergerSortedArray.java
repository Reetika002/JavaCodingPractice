package Arrays;
import java.util.Arrays;

public class MergerSortedArray {

    public static void main(String[] args) {
        int[] arrayA = {-9,-3,0,4,6,9,5,6,7,7,78,7};
        int[] arrayB = {-4,-3,0,8,9};
        System.out.println(Arrays.toString(mergeArray(arrayA,arrayB)));
    }

    public static int[] mergeArray(int[] a,int[] b)
    {
        int i=0, j=0, k=0;
        int[] merge = new int [a.length + b.length];
        while (i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                merge[k] = a[i];
                i++;
                k++;
            }
            else {
                merge[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length)
        {
            merge[k] = a[i];
            i++;k++;
        }
        while (j<b.length)
        {
            merge[k] = b[j];
            j++;k++;
        }
        return merge;
    }
}

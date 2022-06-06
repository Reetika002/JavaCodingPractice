package Testing;

public class BubbleSort {
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//Example:
    public void buubleSort(int[] a)
    {

        int i, j, temp;
        int n = a.length;
        for(i=0; i <n;i++)
        {
            for(j=0; j< n-i-1;j++)
            {
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] a = {3,4,6,1,7,3,4,8,6,9};
        obj.buubleSort(a);
        for(int i=0; i <a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}

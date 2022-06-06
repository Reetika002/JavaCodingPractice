package Arrays;

import JavaBasics.AbstractConcept.A;

import java.util.ArrayList;

public class CompareTwoIndicesAndFindCommonThirdArray {

    public static void main(String[] args) {

        int[] a = {7,4,5,8};
        int[] b = {5,4,3,8};
        int i;

        for(i=0; i<=a.length-1; i++)
        {
            if(a[i] == b[i])
            {
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(a[i]);

                Object[] finalarray = al.toArray();
                for (Object fin : finalarray)
                System.out.println(fin);
            }
        }



    }
}

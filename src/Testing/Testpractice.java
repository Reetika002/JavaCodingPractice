package Testing;

import javax.swing.*;
import java.util.Random;

public class Testpractice {
    public static void main(String[] args) {

        int[] a = {3,4,5,6,7,1,2,3,7,8};

        boolean found = false;
        int i,j;
        for(i=0; i <a.length;i++)
        {
            found = true;
            for (j=0; j<a.length;j++) {
                if (a[j] == a[i] && j != i) {
                    found = false;
                    break;
                }
                else {
                    found = true;
                }
            }
            if(found)
            {
                System.out.println(a[i]);
            }

        }



    }


}

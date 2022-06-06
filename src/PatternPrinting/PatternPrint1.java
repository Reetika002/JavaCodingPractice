package PatternPrinting;

public class PatternPrint1 {
    public static void main(String[] args) {
        int i, j, n=5, k=1;
        for(i=1;i<=n;i++)
        {

            for (j=1;j<=i;j++)
            {

                System.out.print(k);
                k++;


            }

            System.out.println();
        }

    }

}

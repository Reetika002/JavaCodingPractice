package PatternPrinting;

public class rightTriangleStar3 {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i=n; i>=1; i--)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j=2*(n-i); j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j=i; j>=1; j-- )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }


}




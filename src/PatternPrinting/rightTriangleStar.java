package PatternPrinting;

public class rightTriangleStar {

    public static void main(String[] args) {

        int i, j, n = 6;
        for (i = 1; i < n; i++) //outer loop for number of rows(n)
        {
            for (j = 1; j <= i; j++) //  inner loop for columns
            {
                System.out.print("*"); // print star
                System.out.print((char)(j)); // print star
            }
            System.out.println(); //     ending line after each row
        }
    }

}


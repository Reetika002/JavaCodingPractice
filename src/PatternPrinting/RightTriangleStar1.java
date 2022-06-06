package PatternPrinting;

public class RightTriangleStar1 {

    public static void main(String[] args) {
        int i, j, n=5;

        for(i=5;i>=1;i--)
        {
            for(j=i; j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

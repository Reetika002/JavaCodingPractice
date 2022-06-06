package Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        //To multiply an m×n matrix by an n×p matrix, the n must be the same,
        //and the result is an m×p matrix.
        //
        //matrix multiply rows cols
     //   m*n muliply n*p == m * p
//        When we do multiplication:
//
//                The number of columns of the 1st matrix must equal the number of rows of the 2nd matrix.
//        And the result will have the same number of rows as the 1st matrix, and the same number of columns as the 2nd matrix.

        int c[][] = new int[3][3];

        for(int i = 0; i <3; i++)
        {
            for(int j =0; j <3; j++)
            {
                c[i][j] = 0;

                for(int k =0; k < 3 /*row2; */; k++)
                {
                    c[i][j]+= a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }



    }
}

package Arrays;





    class Result {

        /*
         * Complete the 'countPairs' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY numbers
         *  2. INTEGER k
         */

        public static int countPairs(int arr[], int n, int k) {
            // Write your code here
            int count = 0;

            // Pick all elements one by one
            for (int i = 0; i < n; i++)
            {
                // See if there is a pair
                // of this picked element
                for (int j = i + 1; j < n; j++)
                    if (arr[i] - arr[j] == k ||
                            arr[j] - arr[i] == k)
                        count++;
            }
            return count;

        }

    }

    class Solution {
        public static void main(String[] args)  {

            int arr[] = { 1, 5, 3, 4, 2 };
            int n = arr.length;
            int k = 3;
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the value of k");
            // int k = sc.nextInt();
            System.out.println("Count of pairs with given diff is "
                    + Result.countPairs(arr, n, k));
        }
    }



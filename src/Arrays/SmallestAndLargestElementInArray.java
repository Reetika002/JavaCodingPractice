package Arrays;

public class SmallestAndLargestElementInArray {
    public static void main(String[] args) {
        int numbers[] ={23,11,45,66,11,6,2,8,3,88,33};
        int largest = numbers[0];
        int smallest = numbers [0];

        for (int i = 1; i <numbers.length; i++)
        {
            if(numbers[i] > largest)
            {
                largest = numbers[i];
            }
            else if (numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest:" + largest) ;
        System.out.println("Smallest:" + smallest) ;
    }
}

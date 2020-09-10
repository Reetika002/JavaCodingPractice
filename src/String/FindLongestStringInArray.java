package String;

public class FindLongestStringInArray {
    public static void main(String[] args) {

        String[] arr = {"first","second","third","fourth"};
        int lgth = 0;
        String longest=null;
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i].length() > lgth)
            {
                lgth = arr[i].length();
                longest = arr[i];
            }
        }
        System.out.println("longest string is :"+longest);

    }


}

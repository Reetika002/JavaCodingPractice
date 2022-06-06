package Test;

public class LongestStringArray {

    public static void main(String[] args) {

        String[] str = {"first", "Second", "Third","Fourth"};

        int len = str.length;
        String longestlghtstring = "";

        for(int i = 0; i < len; i++)
        {
            if(str[i].length() > longestlghtstring.length())
            {
                len = str[i].length();
                longestlghtstring = str[i];
            }
        }
        System.out.println(longestlghtstring);

    }


}

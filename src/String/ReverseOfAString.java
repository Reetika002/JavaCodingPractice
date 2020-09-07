package String;

public class ReverseOfAString {

    public static void main(String[] args) {


        String str = "Selenium", rev = "";

        for (int i=str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);


        // using stringbuffer class
        StringBuffer str1 = new StringBuffer(str);
        str1 = str1.reverse();
        System.out.println(str1);

    }

}

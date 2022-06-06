package Test;

public class StringPalindrome {

    public static void main(String[] args) {

        String str = "madam";
        String rev = "";
        String oldstr;
        oldstr = str;

        for(int i =str.length()-1; i >=0; i--)
        {

            rev = rev + str.charAt(i);

        }

        if(rev.equals(oldstr))
        {
            System.out.println("paindrome");
        }

        else {

            System.out.println("not palindrome");
        }

    }


}

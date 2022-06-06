package Test;


//reetika is name My
public class StringReverse {

    public static void main(String[] args) {
        String str = "My name is reetika";
        String rev = "";
        String [] strarray = str.split(" ");

        for(int i = strarray.length-1; i >=0; i--)
        {
            rev = rev + " " + strarray[i];
        }
        System.out.println(rev);


    }

}


//akiteeraasiaaemanaayM
class StringReverse1{

    public static void main(String[] args) {

        String str = "My name is reetika";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev  +str.charAt(i);

        }
        rev= rev.replace(" ", "aa");
        System.out.println(rev);
    }
}

// yM eman si akiteer
class  StringReverse2{

    public static void main(String[] args) {

        String str = "My name is reetika";

        String reverseString = "";

        String[] words = str.split(" ");

        for(String word : words)
        {
            String rev = "";
            for(int i = word.length()-1; i>=0;i--)
            {
                rev = rev+word.charAt(i);

            }
            reverseString = reverseString + " " +rev;
        }
        System.out.println(reverseString);



    }
}
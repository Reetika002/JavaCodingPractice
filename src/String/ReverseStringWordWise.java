package String;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String str = "I love my India";
        String rev = "";
//    o/p: India my love I;

        String[] words = str.split(" ");

        for(int i = words.length-1; i >=0; i--)
        {
            rev = rev +" " +words[i];
        }
        System.out.println(rev);

    }


}

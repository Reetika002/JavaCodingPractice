package String;

public class  ReverseEachWordOfString {
//    emocleW oT avaJ
    public static void main(String[] args) {
        String str = "Welcome To Java";
        String reverseString = "";

        String words[] = str.split(" ");
        for (String w : words) {
            String revWords = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                revWords = revWords + w.charAt(i);
            }
            reverseString = reverseString+" "+revWords;
        }
        System.out.println(reverseString);
    }
}

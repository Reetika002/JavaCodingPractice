package String;

public class LengthOfStringWithoutLengthFunction {

    public static void main(String[] args) {

        String s = "knlkl";
        int count = 0;
        char[] a = s.toCharArray();

        for(char ch : a)
        {
            count++;
        }
        System.out.println(count);
    }
}

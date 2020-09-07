package String;

public class SwapTwoStrings {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("before swapping");
        System.out.println("value of a :" +a);
        System.out.println("value of b :" +b);

        a= a +b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());

        System.out.println("after swapping");
        System.out.println("value of a :" +a);
        System.out.println("value of b :" +b);
    }
}

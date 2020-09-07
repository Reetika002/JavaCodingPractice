package String;

public class StringPractice {

    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("welcome");
        sb.append("hello");
        System.out.println(sb);
        String str = new String("abc");
        str=str.concat("def");
        System.out.println(str);

    }

}

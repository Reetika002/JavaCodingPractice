package String;

public class StringPractice {

    public static void main(String[] args)
    {
//        StringBuffer sb = new StringBuffer("welcome");
//        sb.append("hello");
//        System.out.println(sb);
//        String str = new String("abc");
//        str=str.concat("def");
//        System.out.println(str);

        String str = "Welcome to java";
        String rev = "";
        // java to Welcome
        String word[] = str.split(" ");
        for (int i = word.length-1;i>=0;i--)
        {
            rev = rev +" "+ word[i];
        }
        System.out.println(rev);
        }
    }



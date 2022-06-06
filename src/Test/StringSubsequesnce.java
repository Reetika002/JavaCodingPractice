package Test;

public class StringSubsequesnce {
    public static void main(String[] args) {

        String str = "abc";
        int n = str.length();
        int l =0;
        int r = n-1;

        permute(str,l,r);
    }

    public static void permute(String str, int l, int r)
    {

        if(l == r)
        {
            System.out.println(str);
            return;
        }

        for(int i=l; i<=r; i++)
        {
            str = swap(str, l,i);
            permute(str,l+1,r);
            str = swap(str, l,i);
        }

    }

    public static  String swap(String s, int a ,int b)
    {
        char[] ch = s.toCharArray();
        char p = ch[a];
        ch[a] = ch[b];
        ch[b] = p;
        return String.valueOf(ch);
    }

}

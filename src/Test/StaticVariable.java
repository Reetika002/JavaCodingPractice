package Test;

public class StaticVariable {

        static int a =12;
        public static void main(String args[]){
            StaticVariable s1 = new StaticVariable();
            s1.a = 2;
            System.out.println(a + "");
            StaticVariable s2 = new StaticVariable();
            s2.a = 9;
            StaticVariable s3 = new StaticVariable();
            System.out.println(s1.a + "");
            System.out.println(s3.a);
            //Change s1 a value alone

        }
    }


package JavaBasics.multithreading;


    public class test1 extends Thread implements Runnable
    {
        public void run()
        {
            System.out.printf("GFG ");
        }
        public static void main(String[] args) throws InterruptedException
        {
            test1 obj = new test1();
            obj.run();
//            obj.start();
        }
    }


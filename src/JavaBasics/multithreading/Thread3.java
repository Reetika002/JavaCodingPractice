package JavaBasics.multithreading;

public class Thread3 implements Runnable{

    public void run()
    {
        System.out.println("runnning" + " " +Thread.currentThread().getName());
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Thread t = new Thread(new Thread3());
//        t.start();
//        t.run();
//        t.run();
        Thread t1 = new Thread(new Thread3());
        t1.start();
        t1.run();

//        t1.start();  // cannot start or invoke thread again, get runtime exception

        Thread t2 = new Thread(new Thread3());
        t2.start();
        t2.run();

    }
}

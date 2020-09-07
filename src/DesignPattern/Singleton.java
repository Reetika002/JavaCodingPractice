package DesignPattern;

// one private constructor
// on public static class return type method (lazy initialization)
// reference returntype class
public class Singleton {

    public static Singleton instance = null;
    int x=10;

    private Singleton(){

    }

    public static Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

}

class Main {

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        a.x = a.x + 10;
        System.out.println(a.x);
        System.out.println(b.x);
    }
}
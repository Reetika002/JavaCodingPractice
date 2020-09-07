package JavaBasics.StaticConcept;

// Constructor cannot be static
// local varibales cannot be static
// no static block without main method.main method is must from java 7 to execute static block
// outer class/class cannot be static
// inner class can be static

// you can overload a static method in Java
// you cannot ovverride a static method in Java. Cannot make a static reference to the non -static method

public  class StaticConcept {
    String name = "Tom";
    static int age = 23;


    public static void main(String[] args) {

        StaticConcept obj = new StaticConcept();
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.sendMail();
        obj.sum();

    }

    public void sendMail()
    {

        System.out.println("sendmail method");
        sum();
    }

    public static void sum()
    {

        System.out.println("sum method");
    }
}

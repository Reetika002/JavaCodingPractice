package JavaBasics.OverloadedBoxing;


// Rule : Search for primitive type -> then search for corresponding wrapper type -> parent wrapper
// -> then search for object type
public class BoxingConcept {

    public  void showNumber(Object o)
    {
        System.out.println("in object");
    }

    public  void showNumber(int o)
    {
        System.out.println("in int");
    }

    public  void showNumber(Integer o)
    {
        System.out.println("in Integer");
    }
    public  void showNumber(String o)
    {
        System.out.println("in String");
    }

    public  void showNumber(Number o)
    {
        System.out.println("in Number");
    }

    public void showNumber(float o)
    {
        System.out.println("In float");
    }

    public void showNumber(Float o)
    {
        System.out.println("In Float");
    }

    public static void main(String[] args) {
        BoxingConcept obj1 = new BoxingConcept();
        obj1.showNumber(5.0);
    }
}

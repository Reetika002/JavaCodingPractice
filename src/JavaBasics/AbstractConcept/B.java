package JavaBasics.AbstractConcept;
// caanot create object of abstrat class
public class B extends A {

    @Override
    public void XYZ() {
        System.out.println("In B - XYZ");
    }

    @Override
    public void ABC()
    {
        System.out.println("In B - ABC");
    }

    public void DEF()
    {
        System.out.println("In B - DEF");
    }

    B(){
        super();
        System.out.println("B constructor");
    }

    public static void main(String[] args) {

        A obj1 = new B();
        obj1.ABC();
        obj1.XYZ();
        obj1.Hello();

    }
}

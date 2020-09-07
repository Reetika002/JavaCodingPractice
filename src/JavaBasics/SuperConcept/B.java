package JavaBasics.SuperConcept;

// Parent class constructor called before child class constructor
// Super keyword is used to called parent class contructor. If you don't write super keyword, by default...default constructor
// will be called...If you want to call parametrized constructor of parent class use super keyword
// It should be the first statement in any constructor
public class B extends A {

    B()
    {
        super(10);
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}

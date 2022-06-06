package JavaBasics;

class FinalParentKeyword {

    final public void print()
    {
        System.out.println("I am final parent class");
    }
}

class Child extends FinalParentKeyword{

//    public void print()
//    {
//        System.out.println("I am in child class");
//    }
}

//O/P: It gives compile time error
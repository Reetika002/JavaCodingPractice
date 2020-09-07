package JavaBasics.StaticConcept;

class StaticOverride {

    public static void display()
    {
        System.out.println("InsideParent");
    }
}

class Child extends StaticOverride{
    public static void display()
    {
        System.out.println("Inside child");
    }

    public static void main(String[] args) {
        StaticOverride obj = new Child();
        obj.display();
        display();
    }
}

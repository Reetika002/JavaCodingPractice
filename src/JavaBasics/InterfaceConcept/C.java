package JavaBasics.InterfaceConcept;

public class C implements I1,I2 {

    public void ABC()
    {
        System.out.println("In child class - ABC");
    }


    public void XYZ()
    {
        System.out.println("In child class- XYZ");
    }


    public void Reetika()
    {
        System.out.println("Class C- Reetika overriden method");
    }

    public static void main(String[] args) {
        I2 obj = new C();
        obj.Reetika();

        I1 obj1 = new C();
        obj1.ABC();






    }
}

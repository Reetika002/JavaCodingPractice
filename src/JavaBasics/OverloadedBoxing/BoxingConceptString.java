package JavaBasics.OverloadedBoxing;

public class BoxingConceptString {

    public void ShowText(Object o)
    {
        System.out.println("Ïn object");
    }

    public void ShowText(String o)
    {
        System.out.println("Ïn String");
    }

    public void ShowText(StringBuffer o)
    {
        System.out.println("Ïn object");
    }

    public void ShowText(StringBuilder o)
    {
        System.out.println("Ïn object");
    }

    public static void main(String[] args) {

        BoxingConceptString obj = new BoxingConceptString();
        obj.ShowText("ABC");

    }


}

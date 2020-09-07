package JavaBasics.Exception;

public class ThrowsKeyword {

    public static void main(String[] args) {

        ThrowsKeyword obj = new ThrowsKeyword();
        obj.sum();

    }

    public void sum()
    {
        div();
    }
    public void div() throws ArithmeticException{
        int i=9/0;
    }
}

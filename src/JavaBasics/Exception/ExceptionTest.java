package JavaBasics.Exception;

public class ExceptionTest {
    public static void main(String[] args) {

        try{
            int i=10/0; //will throw ArithmeticException
        }catch(ArithmeticException ae){
            System.out.println("Exception handled - ArithmeticException");
        }catch(RuntimeException re){
            System.out.println("Exception handled - RuntimeException");
        }catch(Exception e){
            System.out.println("Exception handled - Exception");
        }

    }
}
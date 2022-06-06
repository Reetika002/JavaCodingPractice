package JavaBasics;

interface interface1 {

    default void test()
    {
        System.out.println("test-I1");
    }
}

interface interface2 {

    default void test()
    {
        System.out.println("test- I2");
    }

    static  void test1()
    {
        System.out.println("static - I2");
    }
}

class Result implements interface1,interface2{

    @Override
    public void test() {
        interface1.super.test();


//        System.out.println("class-test");
    }


    public static void main(String[] args) {

        Result obj = new Result();
        obj.test();




    }


}

package JavaBasics;


    class Animal{}
    class Dog1 extends Animal{//Dog inherits Animal

//        public static void main(String args[]){
//            Dog1 d=new Dog1();
//            System.out.println(d instanceof Animal);//true
//        }
    }

    class Dog2 extends Dog1{
        public static void main(String[] args) {
            Dog1 obj = new Dog1();
            System.out.println(obj instanceof Dog2);
        }


    }


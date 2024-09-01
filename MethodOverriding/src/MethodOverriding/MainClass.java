package MethodOverriding;


  abstract  class C {
        public void first() {
            System.out.println("first method");
        }
    }

    abstract class B extends C {
        public void second() {
            System.out.println("Second method");
        }
    }

     class A extends B {
        public void third() {
            System.out.println("Third method");
        }

        @Override
        public void first() {
            System.out.println("first method Implementation");
        }

        @Override
        public void second() {
            System.out.println("Second method Implementation here");
        }
    }
public class MainClass {

    public static void main(String[] args) {
        A a1 = new A();
        a1.first();
        a1.second();
    }
}

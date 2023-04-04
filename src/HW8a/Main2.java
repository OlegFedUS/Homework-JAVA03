package HW8a;

public class Main2 {

    public class A {
        public void print() {
            System.out.println("lox");
        }
    }

    //inner
    public static class B {

        public void print() {
            System.out.println("lox");
        }
    }

        //nested
        public static void main(String[] args) {

            Main2 main = new Main2();

            Main2.A a = main.new A();
            Main2.B b = new B();
        }

    }


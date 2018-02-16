package app.m4.e2;


public class Test {

    public static void main(String[] args) {
        A a = new B();
        a.random();
    }

    public static class A {

        public int random() {
            return 1;
        }

        public int m() {
            return 2;
        }

    }

    public static class B extends A {

        public int random() {
            return 4;
        }

    }

}

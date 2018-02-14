package m4.e1;


public class Test2 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.random());
    }

    public static class A {

        public static int random() {
            return 1;
        }

    }

    public static class B extends A {

        public static int random() {
            return 4;
        }

    }

}

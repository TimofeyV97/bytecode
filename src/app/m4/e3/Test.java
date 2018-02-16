package app.m4.e3;


public class Test {

    public static void main(String[] args) {
        Randomizer r = new C();
        r.random();
    }

    public interface Randomizer {

        int random();

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

    public static class C extends B implements Randomizer {}

}

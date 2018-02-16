package app.m4.e1;


public class Test {

    public static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        }

        return 0;
    }

    public static void main(String[] args) {
        Test.sum(10);
    }

}

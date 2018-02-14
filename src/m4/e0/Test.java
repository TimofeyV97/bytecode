package m4.e0;


public class Test {

    public static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        }

        return 0;
    }

}

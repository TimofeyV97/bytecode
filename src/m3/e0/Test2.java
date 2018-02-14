package m3.e0;


public class Test2 {

    public static int mod(final int val) {
        final int result;

        if (val >= 0) {
            result = val;
        } else {
            result = -val;
        }

        return result;
    }

}

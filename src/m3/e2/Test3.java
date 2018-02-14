package m3.e2;


public class Test3 {

    public static int forLoop() {
        int result = 0;
        int i = 0;

        loop: for(;;) {
            if (i < 10) {
                result = result + i;
                i++;
                continue loop;
            } else {
                return result;
            }
        }
    }

}

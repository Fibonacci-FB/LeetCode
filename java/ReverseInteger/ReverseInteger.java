package ReverseInteger;

/**
 * Created by guoxiaopeng on 2017/8/28.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        long y = 0;
        while (x != 0) {
            y = (long)(x % 10) + y * 10;
            x = x / 10;
        }
        if (y > 2147483647 || y < -2147483648)
            return 0;
        return (int) y;
    }

    public static void main(String args[]) {
        System.out.println();
    }
}

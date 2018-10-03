package PalindromeNumber;

/**
 * Created by guoxiaopeng on 2017/9/1.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        Long y = Long.valueOf(x);
        Long z = Long.valueOf(0);

        while(x > 0) {
            z = (Long.valueOf(x) % 10) + z * 10;
            x = x / 10;
        }
        return z.equals(y);
    }
}

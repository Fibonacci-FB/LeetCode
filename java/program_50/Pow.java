package program_50;

public class Pow {
    public Pow() {
    }

    public static double myPow(double x, int n) {
        if (x == 0.0D) {
            return 0.0D;
        } else if (n != 0 && x != 1.0D) {
            if (n < 0) {
                n = -1 * n;
                x = 1.0D / x;
            }

            double answer;
            for(answer = 1.0D; n != 1 && n != -1; n /= 2) {
                if (n % 2 == 1 || n % 2 == -1) {
                    answer *= x;
                }

                x *= x;
            }

            answer *= x;
            return answer;
        } else {
            return 1.0D;
        }
    }

    public static void main(String[] args) {
        double answer = myPow(2.0D, -2147483648);
        System.out.println(answer);
    }
}

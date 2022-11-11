package exsicise;

public class EXS2 {
    public static void main(String args[]) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        int mark = n;
        if (n < 0) {
            n = -n;
        }
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        if (mark < 0) return 1 / result;
        return result;
    }
}

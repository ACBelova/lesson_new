package exsicise;

public class EXS4 {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        return result;
    }
}







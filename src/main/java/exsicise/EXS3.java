package exsicise;
public class EXS3 {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(isPowerOfTwo(n));
    }
         public static boolean isPowerOfTwo(int n) {
            if (n == 1) return true;

            if (n <= 0 || n % 2 == 1) {
                return false;
            }
            return isPowerOfTwo(n / 2);
        }
}


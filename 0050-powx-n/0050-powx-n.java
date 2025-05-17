class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert to long to avoid overflow when n = Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;  // Invert x for negative powers
            N = -N;
        }

        double result = 1;
        while (N > 0) {
            if ((N % 2) == 1) result *= x; // Multiply result when bit is 1
            x *= x;    // Square the base
            N /= 2;    // Divide exponent by 2
        }

        return result;
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two
        }
        if (n == 1) {
            return true; // 1 is 2^0
        }
        if (n % 2 != 0) {
            return false; // Odd numbers greater than 1 cannot be powers of two
        }
        return isPowerOfTwo(n / 2); // Recursive call
    }
}

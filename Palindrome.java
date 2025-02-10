class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        int original = x;
        StringBuilder sb = new StringBuilder();

        while (x > 0) {

            int digit = x % 10;
            sb.append(digit);
            x /= 10;

        }

        long newNumber = Long.parseLong(sb.toString());

        return newNumber == original;

    }
}

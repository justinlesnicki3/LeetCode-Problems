import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {

        BigInteger numOne = new BigInteger(a, 2);
        BigInteger numTwo = new BigInteger(b, 2);

        BigInteger sum = numOne.add(numTwo);

        return sum.toString(2);
    }
}

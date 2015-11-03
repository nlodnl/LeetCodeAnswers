package easy;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-binary/
 *
 * Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".
 */
public class AddBinary {
    public class Solution {
        private static final int BINARY_RADIX = 2;

        public String addBinary(String a, String b) {
            if (a == null || b == null) {
                throw new NullPointerException("Parameters cannot be null!");
            }

            if (a.isEmpty() || b.isEmpty()) {
                throw new IllegalArgumentException("Can't get a binary representation from an empty String!");
            }

            BigInteger aAsBinaryNum = new BigInteger(a, BINARY_RADIX);
            BigInteger bAsBinaryNum = new BigInteger(b, BINARY_RADIX);

            return aAsBinaryNum.add(bAsBinaryNum).toString(BINARY_RADIX);
        }
    }
}

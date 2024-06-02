package org.example.codility.easy;

/*
*LINK :: https://app.codility.com/demo/results/training7F2ESH-FHK/
* Task description
        A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

        Write a function:

        class Solution { public int solution(int N); }

        that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].
*
* */

public class BinaryEntry {
    public int solution(int N) {
        // Convert the integer to its binary string representation
        String binaryString = Integer.toBinaryString(N);

        int maxGap = 0;    // To store the maximum length of the binary gap
        int currentGap = 0; // To store the length of the current binary gap
        boolean inGap = false; // To track if we are in a binary gap

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                if (inGap) {
                    // End of a gap, compare and store the maximum gap length
                    maxGap = Math.max(maxGap, currentGap);
                }
                // Reset the current gap length and mark that we are inside a gap
                inGap = true;
                currentGap = 0;
            } else if (inGap) {
                // We are inside a gap, increment the current gap length
                currentGap++;
            }
        }

        return maxGap;
    }

}

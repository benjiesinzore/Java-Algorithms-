package org.example.codility.medium;

/*
* LINK :: https://app.codility.com/demo/results/trainingGZZ9AT-SHP/
* Task description
        Write a function solution that, given two integers A and B, returns a string containing exactly A letters 'a' and exactly B letters 'b' with no three consecutive letters being the same (in other words, neither "aaa" nor "bbb" may occur in the returned string).

        Examples:

        1. Given A = 5 and B = 3, your function may return "aabaabab". Note that "abaabbaa" would also be a correct answer. Your function may return any correct answer.

        2. Given A = 3 and B = 3, your function should return "ababab", "aababb", "abaabb" or any of several other strings.

        3. Given A = 1 and B = 4, your function should return "bbabb", which is the only correct answer in this case.

        Assume that:

        A and B are integers within the range [0..100];
        at least one solution exists for the given A and B.
        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
* */
public class ThreeLetters {
    public String solution(int A, int B) {
        StringBuilder result = new StringBuilder();
        int aCount = A, bCount = B;

        while (aCount > 0 || bCount > 0) {
            int n = result.length();
            if (n >= 2 && result.charAt(n - 1) == result.charAt(n - 2)) {
                // If the last two letters are the same, choose the opposite letter
                if (result.charAt(n - 1) == 'a') {
                    if (bCount > 0) {
                        result.append('b');
                        bCount--;
                    }
                } else {
                    if (aCount > 0) {
                        result.append('a');
                        aCount--;
                    }
                }
            } else {
                // If the last two letters are not the same, choose the letter with the higher remaining count
                if (aCount >= bCount) {
                    if (aCount > 0) {
                        result.append('a');
                        aCount--;
                    }
                } else {
                    if (bCount > 0) {
                        result.append('b');
                        bCount--;
                    }
                }
            }
        }

        return result.toString();
    }

}

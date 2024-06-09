package org.example.codility.hard;

import org.example.control_and_data_struc.ControlStructures;

import java.util.Objects;

public class DisappearingPairs {

    public static void main(String[] args) {
        System.out.println(new DisappearingPairs().solution("ACCAABBC"));

    }




    /**
     * LINK :: https://app.codility.com/demo/results/trainingFQGYXE-M9A/
     * */
    public String solution(String S) {
        // Using a StringBuilder as a stack for efficiency
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);

            // If the stack is not empty and the last character on the stack is the same
            // as the current character, pop the stack (i.e., remove the pair)
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == currentChar) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                // Otherwise, push the current character onto the stack
                stack.append(currentChar);
            }
        }

        // Convert the stack back to a string and return
        return stack.toString();
    }
}

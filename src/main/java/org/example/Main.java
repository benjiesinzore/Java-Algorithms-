package org.example;

import org.example.codility.easy.BinaryEntry;

import java.util.HashSet;

public class Main {

    static BinaryEntry binaryEntry = new BinaryEntry();
    public static void main(String[] args) {
        int res = binaryEntry.solution(1);

        int countL = 0;
        int number = 529;
        String binaryString = Integer.toBinaryString(number);
        char[] ch = binaryString.toCharArray();

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[0] == 1){

                int j = 0;
                while (ch[j] != 1){
                    countL++;
                    j++;
                }
                hashSet.add(countL);
            }

            else if (ch[i] == 1){
                while (i != 0){
                    countL++;
                }
                hashSet.add(countL);
            }
        }
        System.out.println("Hello world! " + binaryString);
    }
}
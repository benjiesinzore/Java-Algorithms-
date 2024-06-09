package org.example.codility.easy;

public class TennisTournament {

    public static void main (String[] args){
        System.out.println(new TennisTournament().solution_(10, 3));
    }

    /**
     * LINK :: https://app.codility.com/demo/results/training3U6E2Q-HAS/
     * */
    public int solution(int P, int C){
        int retVal = 0;
        int setPlayers = P/2;

        if (setPlayers > C){
            retVal = C;
        }

        else {
            while (setPlayers > 0){
                retVal++;
                setPlayers--;
            }
        }

        return retVal;
    }

    /**
     * LINK :: https://app.codility.com/demo/results/trainingYT5YYP-F4Y/
     * */
    public int solution_(int P, int C) {
        // Maximum number of games is limited by the number of pairs of players we can form
        // and the number of courts available.
        int maxGamesByPlayers = P / 2;
        return Math.min(maxGamesByPlayers, C);
    }
}

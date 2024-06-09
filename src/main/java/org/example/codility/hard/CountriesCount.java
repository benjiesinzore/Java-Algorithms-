package org.example.codility.hard;

/*
* LINK :: https://app.codility.com/demo/results/trainingMQ8YUH-23R/
* Task description
        A rectangular map consisting of N rows and M columns of square areas is given. Each area is painted with a certain color.

        Two areas on the map belong to the same country if the following conditions are met:

        they have the same color;
        it is possible to travel from one area to the other orthogonally (that is, by moving only north, south, west or east) without moving over areas of a different color.
        The map can be described by a zero-indexed matrix A consisting of N rows and M columns of integers. The color of each area is described by the corresponding element of the matrix. Two areas have the same color if and only if their corresponding matrix elements have the same value.

        For example, consider the following matrix A consisting of seven rows and three columns:

        A[0][0] = 5    A[0][1] = 4    A[0][2] = 4
        A[1][0] = 4    A[1][1] = 3    A[1][2] = 4
        A[2][0] = 3    A[2][1] = 2    A[2][2] = 4
        A[3][0] = 2    A[3][1] = 2    A[3][2] = 2
        A[4][0] = 3    A[4][1] = 3    A[4][2] = 4
        A[5][0] = 1    A[5][1] = 4    A[5][2] = 4
        A[6][0] = 4    A[6][1] = 1    A[6][2] = 1
        Matrix A describes a map that is colored with five colors. The areas on the map belong to eleven different countries (C1−C11), as shown in the following figure:


        Write a function

        class Solution { public int solution(int[][] A); }

        that, given a zero-indexed matrix A consisting of N rows and M columns of integers, returns the number of different countries to which the areas of the map described by matrix A belong.

        For example, given matrix A consisting of seven rows and three columns corresponding to the example above, the function should return 11.

        Write an efficient algorithm for the following assumptions:

        N and M are integers within the range [1..300,000];
        the number of elements in matrix A is within the range [1..300,000];
        each element of matrix A is an integer within the range [−1,000,000,000..1,000,000,000].
* */
public class CountriesCount {
    private int rows;
    private int cols;
    private int[][] A;
    private boolean[][] visited;
    private int[] dr = {0, 0, 1, -1};  // Direction vectors for row
    private int[] dc = {1, -1, 0, 0};  // Direction vectors for col

    public int solution(int[][] A) {
        this.A = A;
        rows = A.length;
        cols = A[0].length;
        visited = new boolean[rows][cols];
        int countries = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (!visited[r][c]) {
                    dfs(r, c);
                    countries++;
                }
            }
        }
        return countries;
    }

    private void dfs(int r, int c) {
        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && !visited[nr][nc] && A[nr][nc] == A[r][c]) {
                dfs(nr, nc);
            }
        }
    }




    //     public int solution(int[][] A) {
//         int N = A.length;
//         int M = A[0].length;
//         boolean[][] visited = new boolean[N][M];
//         int countries = 0;

//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < M; j++) {
//                 if (!visited[i][j]) {
//                     countries++;
//                     dfs(A, visited, i, j, N, M, A[i][j]);
//                 }
//             }
//         }

//         return countries;
//     }

//     private void dfs(int[][] A, boolean[][] visited, int i, int j, int N, int M, int color) {
//         if (i < 0 || i >= N || j < 0 || j >= M || visited[i][j] || A[i][j] != color) {
//             return;
//         }

//         visited[i][j] = true;

//         dfs(A, visited, i - 1, j, N, M, color); // move north
//         dfs(A, visited, i + 1, j, N, M, color); // move south
//         dfs(A, visited, i, j - 1, N, M, color); // move west
//         dfs(A, visited, i, j + 1, N, M, color); // move east
//     }
}

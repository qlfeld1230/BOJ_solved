package boj;

import java.io.*;

public class BOJ7595 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * It is not hard to draw a triangle of stars of any given size.
         * For example, a size 5 triangle would look like this (5 stars high and 5 stars wide):
         *
         * *
         * **
         * ***
         * ****
         * *****
         *
         * Your task is to draw triangles in a number of sizes.
         * 
         * 입력:
         * Each line of input contains a single positive integer, n, 1 <= n <= 100.
         * The last line of input contains 0.
         * For each non-zero number, draw a triangle of that size.
         * 
         * 출력:
         * Output consists of triangles of the appropriate sizes.
         * Each triangle is wider at the bottom.
         * There are no gaps between the triangles.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = 1;
        
        while(N != 0) {
            N = Integer.parseInt(br.readLine());
            for(int i=0; i < N; i++){
                    System.out.println("*".repeat(i+1));
            }
        }

        // 결과 출력
        System.out.println(sb);
    }
}

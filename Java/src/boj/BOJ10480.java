package boj;

import java.io.*;

public class BOJ10480 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Some numbers are just, well, odd.
         * For example, the number 3 is odd, because it is not a multiple of two.
         * Numbers that are a multiple of two are not odd, they are even.
         * More precisely, if a number n can be expressed as n = 2 * k for some integer
         * k, then n is even.
         * For example, 6 = 2 * 3 is even.
         * 
         * Some people get confused about whether numbers are odd or even.
         * To see a common example, do an internet search for the query “is zero even or
         * odd?”
         * (Don’t search for this now! You have a problem to solve!)
         * 
         * Write a program to help these confused people.
         * 
         * 입력:
         * Input begins with an integer 1 ≤ n ≤ 20 on a line by itself,
         * indicating the number of test cases that follow.
         * Each of the following n lines contain a test case consisting of a single
         * integer -10 ≤ x ≤ 10.
         * 
         * 출력:
         * For each x, print either ‘x is odd’ or ‘x is even’ depending on whether x is
         * odd or even.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for (int t = 0; t < N; t++) {
            int x = Integer.parseInt(br.readLine());

            if (x % 2 == 0) {
                sb.append(x).append(" is even\n");
            } else {
                sb.append(x).append(" is odd\n");
            }
        }

        // 결과 출력
        System.out.print(sb);
    }
}

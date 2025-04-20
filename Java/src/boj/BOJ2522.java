package boj;

import java.io.*;

public class BOJ2522 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 규칙을 유추해서 별을 찍어라.
         *   *
         *  **
         * ***
         *  **
         *   *
         * 
         * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
         * 
         * 출력: 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sb.append(String.format(" ".repeat(N - i) + "*".repeat(i))).append("\n");
        }

        for(int i=N-1; i >= 1; i--) {
            sb.append(String.format(" ".repeat(N - i) + "*".repeat(i))).append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}

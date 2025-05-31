package boj;

import java.io.*;

public class BOJ18414 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 整数 X, L, R が与えられる。L 以上 R 以下の整数のうち，X との差の絶対値が最も小さいものを出力せよ。
         * そのような整数はちょうど１つだけ存在することが証明できる。
         * 
         * 입력:
         * 入力は以下の形式で標準入力から与えられる。
         * X L R
         * 
         * 출력:
         * L 以上 R 以下の整数のうち，X との差の絶対値が最も小さいものを出力せよ。
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        sb.append(Math.max(L, Math.min(R, X)));
        System.out.print(sb);
    }
}

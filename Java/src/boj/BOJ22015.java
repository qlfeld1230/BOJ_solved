package boj;

import java.io.*;

public class BOJ22015 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * JOI 高校の生徒である葵と凛は、教師の理恵先生と一緒に 3 人で金平糖を同じ数だけ食べることにした。
         * いま、葵は A 粒、凛は B 粒、理恵先生は C 粒の金平糖を食べた。
         * 3 人が食べた金平糖の個数を等しくするには、最小で合計いくつの金平糖を追加で食べる必要があるだろうか。
         * 
         * 3 人が食べた金平糖の個数 A, B, C が与えられたとき、追加で食べる金平糖の個数の最小値を求めるプログラムを作成せよ。
         * 
         * 입력:
         * 入力は以下の形式で標準入力から与えられる。
         * A B C
         * 
         * 출력:
         * 標準出力に、追加で食べる金平糖の個数の最小値を 1 行で出力せよ。
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input[] = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int max = Math.max(A, Math.max(B, C));
        int sum = 0;

        for(int i=0; i<3; i++){
            int current = Integer.parseInt(input[i]);
            if(current < max) {
                sum += (max - current);
            }
        }

        sb.append(sum);
        // 결과 출력
        System.out.print(sb);
    }
}

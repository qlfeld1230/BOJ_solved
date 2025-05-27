package boj;

import java.io.*;

public class BOJ18411 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * JOI 君は情報の試験を 3 回受けた．試験の点数はすべて 0 以上 100 以下の整数である．
         * 
         * JOI 君の成績は 3 回の試験の点数のうち高い方から２つを足し合わせた合計によって決まる．
         * 
         * 3 回の試験の点数 A, B, C が与えられたとき，3 回の試験の点数のうち高い方から２つを足し合わせた合計を出力する
         * プログラムを作成せよ．
         * 
         * 입력:
         * 入力は以下の形式で標準入力から与えられる．
         * 
         *   A B C
         * 
         * 출력:
         * 3 回の試験の点数のうち高い方から２つを足し合わせた合計を 1 行で出力せよ．
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input[] = br.readLine().split(" ");

        // sort input
        int[] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }

        java.util.Arrays.sort(scores);

        int result = scores[1] + scores[2]; // 두 번째로 높은 점수와 가장 높은 점수의 합
        sb.append(result);
        
        // 결과 출력
        System.out.println(sb);
    }
}

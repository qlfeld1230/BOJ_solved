package boj;

import java.io.*;

public class BOJ18408 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * ３つの整数 A, B, C が与えられる．A, B, C はそれぞれ１または２である．
         * １と２のうち，どちらが多くあるか．
         * 
         * 입력:
         * 入力は以下の形式で標準入力から与えられる．
         * 
         *   A B C
         * 
         * 출력:
         * １と２のうち，個数が多い方を出力せよ．
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 공백으로 구분된 세개의 정수를 읽어들여 배열에 저장
        String[] strInput = br.readLine().split(" ");
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(strInput[i]);
        }


        sb.append((input[0] + input[1] + input[2]) <= 4 ? 1 : 2);

        // 결과 출력
        System.out.print(sb);
    }
}

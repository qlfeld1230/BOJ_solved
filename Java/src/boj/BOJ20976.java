package boj;

import java.io.*;

public class BOJ20976 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 3 つの整数 A, B, C が与えられる．これらのうち 2 番目に大きい数を出力せよ．
         * 
         * 입력: 入力は以下の形式で標準入力から与えられる．
         * 
         * 출력: A, B, C のうち，2 番目に大きい数を出力せよ．
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String input[] = br.readLine().split(" ");
 
        // input 배열 정렬
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        java.util.Arrays.sort(numbers);

        sb.append(numbers[1]); // 두 번째로 큰 수는 정렬된 배열의 두 번째 인덱스에 위치



        // 결과 출력
        System.out.print(sb);
    }
}

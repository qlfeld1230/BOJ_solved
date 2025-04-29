package boj;

import java.io.*;

public class BOJ33170 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 3개의 입력이 주어졌을 때, 21 이하라면 1을 이상이라면 0을 출력하라.
         * 
         * 입력: 각 줄에 순서대로 정수 3개가 주어진다. (1 ≤ A, B, C ≤ 13)
         * 
         * 출력: 결과를 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        
        System.out.println((A + B + C <= 21) ? 1 : 0);
    }
}

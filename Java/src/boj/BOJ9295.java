package boj;

import java.io.*;
import java.util.*;

public class BOJ9295 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 주사위를 두 번 던져 나온 수의 합을 출력하라.
         * 
         * 입력: 첫째 줄에 테스트케이스의 개수 T가 주어진다.
         * 
         * 출력: 각 테스트 케이스마다 "Case x: "를 출력한 다음, 주사위를 두 번 던져 나온 두 수의 합을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        // 테스트 케이스만큼 반복
        for (int t = 0; t < N; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a + b; // 주사위를 두 번 던져 나온 수의 합
            sb.append("Case" + (t + 1) + ": " + result + "\n");
        }

        // 결과 출력
        System.out.println(sb);
    }
}

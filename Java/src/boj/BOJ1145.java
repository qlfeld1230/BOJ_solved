package boj;

import java.io.*;
import java.util.*;

public class BOJ1145 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 5개의 자연수 중 적어도 3개의 자연수의 배수인
         * 가장 적은 자연수를 구하는 프로그램을 작성.
         * 
         * 입력: 첫째 줄에 다섯 개의 자연수가 주어진다.
         * 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
         * 
         * 출력: 첫 째줄에 정답을 출력하라.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numbers = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int result = 1;
        while (true) {
            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (result % numbers[i] == 0) {
                    cnt++;
                }
            }

            if (cnt >= 3) {
                break;
            }
            result++;
        }

        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}

package boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11549 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: tea type이 주어지면 몇명의 정답자가 있는지 출력하라.
         * 
         * 입력: 첫째 줄에 tea type이 주어진다. 1 <= T <= 4
         * 둘째 줄에 5명의 정답이 제출된다.
         * 
         * 출력: 정답자의 수를 출력하라.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 테스트 케이스만큼 반복
        for (int t = 0; t < 5; t++) {
            // 초기 상태 설정
            int answer = Integer.parseInt(st.nextToken());

                if(answer == T) {
                    result++; // 정답자 수 증가
                }
        }

        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}

package boj;

import java.io.*;
import java.util.*;

public class BOJ1547 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 3개의 컵 중 1번 컵 아래에 공이 있다.
         * M번 컵의 위치를 바꾼 후 공이 들어있는 컵의 번호를 출력하는 프로그램 작성.
         * 입력:
         * - 첫째 줄: M (1 ≤ M ≤ 50) -> 컵 위치 변경 횟수
         * - 둘째 줄부터 M개의 줄: X Y (1 ≤ X, Y ≤ 3) -> X번과 Y번 컵의 위치 교환
         * 출력:
         * - 마지막에 공이 들어 있는 컵의 번호를 출력 (공이 사라지는 경우는 없음)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        // 공의 위치
        int ballPosition = 1;

        // 테스트 케이스만큼 반복
        for (int t = 0; t < testCase; t++) {
            // 초기 상태 설정
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 문제 해결
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (X == ballPosition) {
                ballPosition = Y;
            } else if (Y == ballPosition) {
                ballPosition = X;
            }
        }

        // 결과 출력
        sb.append(ballPosition);
        System.out.println(sb);
    }
}

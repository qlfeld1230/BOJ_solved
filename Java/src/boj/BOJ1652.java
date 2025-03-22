package boj;

import java.io.*;
import java.util.*;

public class BOJ1652 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: NxN 크기의 정사각형에서 가로 및 세로로 2칸이상
         * 연속된 빈칸의 개수를 구하는 프로그램 작성.
         * 입력:
         * - 첫째 줄: 첫째 줄에 방의 크기 N이 주어진다. N은 1이상 100이하의 정수이다.
         * 다음으로 입력되는 '.'은 아무것도 없는 곳을 의미하고, 'X'는 짐이 있는 곳을 의미한다.
         * 출력:
         * - 첫째 줄에 가로로 누울 수 있는 자리와 세로로 누울 수 있는 자리의 개수를 출력.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 가로와 세로 결과 값
        int horizontal = 0;
        int vertical = 0;

        // NxN 배열 선언
        int[][] room = new int[N][N];

        // 배열 채우기
        for (int t = 0; t < N; t++) {
            String str = br.readLine();
            for (int i = 0; i < N; i++) {
                char c = str.charAt(i);
                if (c == '.') {
                    room[t][i] = 0;
                } else {
                    room[t][i] = 1;
                }
            }
        }

        // 가로로 누울 수 있는 자리 구하기
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (room[i][j] == 0) {
                    cnt++;
                    if (j == N - 1 && cnt >= 2) {
                        horizontal++;
                    }
                } else {
                    if (cnt >= 2) {
                        horizontal++;
                    }
                    cnt = 0;
                }
            }
        }

        // 세로로 누울 수 있는 자리 구하기
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (room[j][i] == 0) {
                    cnt++;
                    if (j == N - 1 && cnt >= 2) {
                        vertical++;
                    }
                } else {
                    if (cnt >= 2) {
                        vertical++;
                    }
                    cnt = 0;
                }
            }
        }

        // 결과 출력
        sb.append(horizontal).append(" ").append(vertical);
        System.out.println(sb);
    }
}

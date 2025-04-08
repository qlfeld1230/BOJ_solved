package boj;

import java.io.*;
import java.util.*;

public class BOJ20114 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 원래 문자열의 길이
        int H = Integer.parseInt(st.nextToken()); // 세로로 번진 글자의 개수
        int W = Integer.parseInt(st.nextToken()); // 가로로 번진 글자의 개수

        StringBuilder result = new StringBuilder(); // 복원된 결과 문자열
        for (int i = 0; i < N; i++) {
            result.append('?'); // 초기값은 모두 '?'
        }

        // H개의 줄에 걸쳐 번진 문자열 입력
        for (int i = 0; i < H; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                // j번째 문자에 해당하는 W개의 문자 탐색
                for (int k = 0; k < W; k++) {
                    char c = str.charAt(j * W + k);
                    if (c != '?') {
                        result.setCharAt(j, c); // 유효한 문자 발견 시 복원
                        break; // 더 이상 탐색할 필요 없음
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}

package boj;

import java.io.*;

public class BOJ33612 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 7개월 마다 열리는 대회의 N번째 월드컵이 열리는 날을 구하라.
         * 1회 : 2024년 8월
         * 입력: N이 주어진다.
         * 
         * 출력: 피갤컵이 열리는 연도와 월을 공백을 두고 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int year = 2024; // 시작 연도
        int month = 8; // 시작 월

        month += (N - 1) * 7; // N번째 월드컵까지의 월 수 계산
        if (month > 12) { // 12월을 넘어가는 경우
            year += month / 12; // 연도 계산
            month = month % 12; // 월 계산
            if (month == 0) { // 월이 0인 경우 12월로 설정
                month = 12;
            }
        }

        // 결과 출력
        sb.append(year).append(" ").append(month);
        System.out.print(sb);
    }
}
